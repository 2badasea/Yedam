package co.bada.mypage.java.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.bada.mypage.java.service.JavaMapper;
import co.bada.mypage.java.service.JavaService;
import co.bada.mypage.java.service.JavaVO;

@Repository("javaDao")
public class JavaServiceImpl implements JavaService {
	@Autowired
	private JavaMapper map;  // datasource-context.xml의 sqlsession을 자동으로 autowired 해주게 된다. 즉, dao를 의존주입하는 것.
	
	@Override
	public List<JavaVO> javaSelectList() {
		// TODO Auto-generated method stub
		return map.javaSelectList();
	}

	@Override
	public JavaVO javaSelect(JavaVO vo) {
		// TODO Auto-generated method stub
		return map.javaSelect(vo);
	}

	@Override
	public int javaInsert(JavaVO vo) {
		// TODO Auto-generated method stub
		return map.javaInsert(vo);
	}

	@Override
	public int javaDelete(JavaVO vo) {
		// TODO Auto-generated method stub
		return map.javaDelete(vo);
	}

	@Override
	public int javaUpdate(JavaVO vo) {
		// TODO Auto-generated method stub
		return map.javaUpdate(vo);
	}

	@Override
	public List<JavaVO> javaSearchList(String searchkey) {
		// TODO Auto-generated method stub
		return map.javaSearchList(searchkey);
	}

}
