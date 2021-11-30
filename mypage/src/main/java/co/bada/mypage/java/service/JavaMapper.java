package co.bada.mypage.java.service;

import java.util.List;

public interface JavaMapper {
	//기본적인 crud
		List<JavaVO> javaSelectList();
		JavaVO javaSelect(JavaVO vo);
		int javaInsert(JavaVO vo);
		int javaDelete(JavaVO vo);
		int javaUpdate(JavaVO vo);
		List<JavaVO> javaSearchList(String searchkey);
}
