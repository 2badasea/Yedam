package co.bada.prj.comm;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {    //DAO Data Access Object 데이터를 접근할 수 있는 객체. 
	private static DataSource dataSource = new DataSource();  // 싱글톤으로 생성.  
														//static으로 줘야 싱글톤클래스가 된다.~!!
	
	private Connection conn;      //db에서 다룰 매개변수들. 
	private String driver;
	private String url;
	private String user;
	private String password;
	
	
	private DataSource() {
		config();    //싱글톤 클래스로 외부에서 생성자를 만들지 못 하게 함. 그래서 private.
		//외부에서 날 호출하지 말라는 성격의 기본생성자 선언. 
	}
	public static DataSource getInstance() {  //기본적인 싱글톤패턴의 구성. 
		return dataSource;      
	}
	
	//dbproperties를 읽기위한 메소드.
	private void config() {
		Properties properties = new Properties();  
		String resource = getClass().getResource("/db.properties").getPath();    //getPath 대신 getFile도 가능.
		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		}catch(IOException e ) {  //파일을 읽어들여야 하니깐 ioe익셉션이 일어날 수 있다. 
			e.printStackTrace();
		}
	}
	
	//커넥션이 돌아가기 위해.
	public Connection getConnection() {
//		config(); // 생성자에 넣었으면 주석처리. 생성자랑 여기랑 둘 다 넣을 필요 없다.  config()파일은 가급적 생성자에 넣는 게 좋다. 
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	 
	
	
	
	
}
