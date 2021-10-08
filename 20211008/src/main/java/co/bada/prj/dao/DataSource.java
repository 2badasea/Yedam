package co.bada.prj.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	private static DataSource dataSource = new DataSource();      //싱글톤으로 만든다(인스턴스가 오직 1개만 생성되야 하는 경우에 사용하는 패턴)
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String password;
	
	
	private DataSource() {		//외부에서 생성할 수 없도록. 생성자를 private으로
		dbconfig();
	}					
	
	public static DataSource getInstance() {  
		return dataSource;
	}
	
	
	
	private void dbconfig() {		//외부 properties  	<<properties클래스 설명>> Hashtalbe의 하위 클래스. 
									//Hashtable을 상속받았기 때문에 Map의 속성, 즉 Key와 Value를 갖는다. 
									//key를 주면 value값을 반환하는 기능을 가진다. 
									//"Key = Value" 형태로 된 "파일이름.properties" 파일 또는 Xml 파일
									//파일을 직접 여는 클래스가 아니므로 FileReader 객체를 매개변수로 받음. 
									//load() 메소드를 통해 파일 정보를 넣어줌 
		Properties properties = new Properties();   
		String resource = getClass().getResource("/db.properties").getPath(); // '/' << 절대경로. 
		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		}catch(Exception e ){
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {       //커넥션을 얻기 위해 public
		try {
			Class.forName(driver);     // ojdbc 연결용.(사용할 드라이버를 로드시키는 것)
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공"); 
		}catch(ClassNotFoundException | SQLException e ) {
			e.printStackTrace();
		}
		
		return conn;   //생성된 컨넥션 객체를 돌려준다. 
	}
	
}
