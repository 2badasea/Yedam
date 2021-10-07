package co.bada.dbprj;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//dao객체가 되기 위해선 
public class DataSource {
	
	private String driver;	//사용할 JDBC 드라이버. 
	private String url;		//DBMS가 위치한 주소
	private String user;	//DB에 접속할 계정.
	private String password; 	//DB 접속계정의 패스워드
	
	public Connection conn;  //java에서 DBMS 연결 객체.  
							//connection은 자바에서 db에 연결하는 인터페이스다. 
							//public만 상속됨. 상속하기 위해. 
	
	public DataSource() {
		getDbproperties();	//외부 properties 파일을 읽어서 내부 변수에 담음. 
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패");
		}
	}
	
	private void getDbproperties() {
		File path = new File("src/main/resources/db.properties");  //파일을 다루는 객체.
		Properties properties = new Properties();		
		try {
			FileReader file = new FileReader(path);
			properties.load(file);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
