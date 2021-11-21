package co.bada.prj.comm;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {   
	//기본적인 싱글톤 패턴. 
	private static SqlSessionFactory sqlSessionFactory;
	private DataSource() {}  //외부에서 자기를 생성하지 못 하도록 초기화. 
	
	public static SqlSessionFactory getDataSource() {     //인스턴스를 통해서 호출할 수 있도록 하는 싱글톤 패턴. 
		
		//mybatis페이지의 '시작하기' 부분에서 copy한다. 그리고 수정. 
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}
}
/* MyBatis3의 주요 컴포넌트의 역할
*1. Mybatis 설정파일(mybatis-config.xml) : 데이터베이스의 접속 주소 정보나 Mapping파일의 경로 등의 고정된 환경정보를 설정한다. 
*2. SqlSessionFactoryBuilder : MyBatis 설정 파일을 바탕으로 SqlSessionFactory를 생성한다. 
*3. SqlSessionFactory : SqlSession 을 생성한다. 
*4. SqlSession : 핵심적인 역할을 하는 클래스로서 SQL 실행이나 트랜잭션 관리를 실행한다. 
*				SqlSession 오브젝트는 Thread-Safe 하지 않으므로 thread마다 필요에 따라 생성한다. 
*5. mapping 파일(member-map.xml) : SQL문과 OR Mapping을 설정한다. 
*/