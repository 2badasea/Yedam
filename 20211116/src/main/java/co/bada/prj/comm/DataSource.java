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
