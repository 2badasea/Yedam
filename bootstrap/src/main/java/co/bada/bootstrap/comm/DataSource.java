package co.bada.bootstrap.comm;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {
	private static SqlSessionFactory sqlSessionFactory;   //싱글톤 패턴 만드는 기본 패턴 3줄. 
	private DataSource() {}; // 남들이 생성하지 못 하도록. 
	public static SqlSessionFactory getDataSource() {
		String resource = "mybatis-config.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);   // mybatis 사이트에서 복붙. 
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);  // 복붙해서 앞부분만 자름. 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}
}
