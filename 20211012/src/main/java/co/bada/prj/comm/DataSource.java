package co.bada.prj.comm;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {  //DAO (Data Access Object)
	private static SqlSessionFactory sqlSessionFactory; //Mybatis를 사용하기 위해서 sqlsessionfactory를 이용한 것
	private DataSource() {}  //외부에서 생성하지 못 하도록 초기화. 
	
	public static SqlSessionFactory getInstance() {	//DataBase 연결된다. connection pool 기반으로. 
		String resource = "mybatis-config.xml";
		try{ 
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
	}
}
/*
 * 마이바티스를 사용하기 위한 기본적인 자바 인터페이스는 SqlSession이다. 이 인터페이스를 통해 명령어를 실행하고 매퍼를 얻으며 트랜잭션을 관리할 수 있다. 
 * sqlSession은 sqlSessionFactory인스턴스를 사용해서 만든다. sqlsessionfactroy는 sqlsessionfactorybuiler를 통해 만들어진다. 
 * sqlsessionfactorybuilder는 5개의 build메소드를 가지는데, 우리가 위에서 쓴 건 InputStream타입의 inputStream객체를 매개값으로 받는 build()메소드다.(18행)
 * 17행의 Resources 또한 클래스이다. 
 */
