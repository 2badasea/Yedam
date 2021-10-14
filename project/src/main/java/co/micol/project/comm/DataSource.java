package co.micol.project.comm;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {  //DAO객체. sqlsession이랑, mapper, getMapper, mapper.classd, InputStream inputream 
	private static SqlSessionFactory sqlSessionFactory;
	private DataSource() {}   //생성자 초기화. 다른 곳에서 함부로 호출할 수 없도록. 
	
	public static SqlSessionFactory getInstance() {
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
