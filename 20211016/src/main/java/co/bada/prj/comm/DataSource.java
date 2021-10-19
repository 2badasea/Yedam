package co.bada.prj.comm;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {

	private static DataSource dataSource = new DataSource();
	// 싱글톤으로 만든다 >>> 인스턴스가 오직 1개만 생성돼야 하는 경우에 사용하는 패턴.
	private Connection conn; // connection클래스.
	private String driver;
	private String url;
	private String user;
	private String password;

	private DataSource() {
		dbconfig();
	} // 외부에서 인스턴스를 생성 못 하도록 생성자 초기화. 인스턴스 생성될 때 config()실행.

	public static DataSource getInstance() {
		return dataSource;
	}
	// DataSourc 생성자를 호출하게 될 경우, getInstance를 통해서.
	// DataSource타입의 인스턴스 dataSource가 반환되는데, 이때 dbconfig()도 실행됨.

	private void dbconfig() {
		Properties properties = new Properties();
		//properties클래스는 hashtable의 하위클래스. 그래서 Map의 속성, key와 value를 갖는다. 
		//"Key = Value" 형태로 된 "파일이름.properties" 파일 또는 xml파일 
		//파일을 직업 여는 클래스가 아니므로 FileReader 객체를 매개변수로 받았고 
		//load()메소드를 통해 호출하였다. 
		
		String resource = getClass().getResource("/db.properties").getPath(); //getPath()메소드를 통해 url호출.
		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver"); //괄호안은 key값이다. 
			url = properties.getProperty("url"); //호출되는 값: "jdbc:oracle:thin:@localhost:1521:xe" 
			user = properties.getProperty("user"); // " bada"값이 호출되어 'uesr'변수에 저장.
			password = properties.getProperty("password"); // "1234"가 호출되어 password에 저장.
		} catch (Exception e) {
			{
				e.printStackTrace();
			}

		}

	}
	
	public Connection getConnection() {
		try {
			Class.forName(driver);  //ojdbc연결용. (사용할 드라이버를 로드시키는 부분)
			//class.forName()을 통해 'driver'은 객체화되고 메모리상에 잡히게 된다. 
			conn = DriverManager.getConnection(url, user, password);
			// DriverManager클래스는 Connection인터페이스의 구현 객체를 생성하는 데 getConnection()메소드를 사용한다. 
			System.out.println("DB연결 성공");
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	
}
