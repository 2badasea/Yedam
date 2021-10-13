package co.bada.prj.comm;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource { //DAO(Data Access Object)
	private static SqlSessionFactory sqlSessionFactory; //Mybatis를 사용하기 위해서 sqlsessionfactory를 이용한 것. 
	private DataSource() {}  //외부에서 생ㅅ어하지 못하도록 초기화. 
	
	public static SqlSessionFactory getInstance() { //DB와 연결된다. connection pool기반으로. 싱굴톤메서드. 
		 String resource = "mybatis-config.xml";
		 try {
			 InputStream inputStream = Resources.getResourceAsStream(resource);
			 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		 } catch(IOException e) {
			 e.printStackTrace();
		 }
		 return sqlSessionFactory;
	}
}
/*
*마이바티스를 사용하기 위한 기본적인 자바 인터페이스는 Sqlsession이다. 이 인터페이스를 통해 명령어를 실행하고 mapper를 얻으며 
*트랜잭션을 관리할 수 있다. Sqlsession은 sqlsessionfactory인스턴스를 사용해서 만든다. sqlsessionfactroy는 
*sqlsessionfactorybuilder를 통해 만들어진다. sqlsessionfactroybuilder는 5개의 build메소드를 가진는데, 
*우리가 위에서 쓴 건 InputStream타입의 inputStream객체를 매개로 받는 build()메소드다. 
*17행의 Resource또한 마이바티스에서 제공하는, 리소스를 읽어들일 수 있게 도와주는 유틸클래스다. 
*/