package co.bada.prj.comm;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {
	//싱글톤 패턴으로 생성한다. 
	private static SqlSessionFactory sqlSessionFactory; 
	private DataSource() {};
	
	public static SqlSessionFactory getDataSource() {
			String resource = "mybatis-config.xml";
			try {
				InputStream inputStream = Resources.getResourceAsStream(resource);
					// 
					/*getResoureAsStream 이 getResource()보다 편함. 일반 파일이건, jar파일과 같이 묶여 있는 파일이건 
					*해당 디렉토리 파일을 읽을 경우 모두 가능함. getResource()는 기본적으로 url을 반환하는데, url은 .exe(.jar)파일을 '!'
					*와 함께 표시하기 때문에 jar실행시 에러가 발생한다. 하지만 getResourceAsStream()은 InputStream을 반환한다.
					*/
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return sqlSessionFactory;
	}
}
/* XML파일에서 SqlSessionFactory인스턴스를 빌드하는 것은 매우 간단한다. 
*설정을 위해 클래스패스 자원을 사용하는 것을 추천하나 파일 경로나 file:// URL로부터 만들어진 
*	InputStream인스턴스를 사용할 수도 있다. 마이바티스는 클래스패스와 다른 위치에서 자원을 로드하는 것으로 
*	좀더 쉽게 해주는 Resources 라는 유틸성 클래스를 가지고 있다.
*/

