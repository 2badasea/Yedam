package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.comm.Command;
import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceImpl.MemberServiceImpl;

public class AjaxAuthorUpdate implements Command {
	private String result;
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// member-map.xml에 보면, memberauthorupdate 쿼리에 권한값과  id값을 넘기는 것을 확인. 
		// 현재 memberList.jsp에서 ajax호출로 id값과 author값을 받은 상황임. 
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id")); // ajax에서 id라는 변수명으로 값이 실려왔었다.
		vo.setAuthor(request.getParameter("author"));
		int n = memberDao.memberAuthorUpdate(vo); // update 구문이니깐 integer타입이 리턴된다. 
		if(n !=0) {  // 성공하면~
			result = "yes";
		} else {
			result = "no";
		}
		return "ajax:"+result;  // 다 string이다. 얘들이 frontController로 돌아와서 viewPage의 값이
								// ajax:yes 가 되고, 거기서 5글자를 자르고, 나머지를 호출한 페이지에 돌려보내게 된다. 
	}

}
