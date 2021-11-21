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
		// member-map.xxml에 보면, memberauthoraupdate쿼리에 권한값과 id값을 넘기는 것을 확인.
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));  //ajax에서 id로 실었엇음.
		vo.setAuthor(request.getParameter("author"));
		int n = memberDao.memberAuthorUpdate(vo); //update 구문이니깐 integer가 리턴.
		if(n !=0) { //성공적이면~
			result = "yes";     
		} else {
			result = "no";
		}
		return "ajax:"+result;  // 다 string이다.  얘들이 controller로 돌아와서, 
									//viewPage의 값이 ajax:yes 되고, 거기서 5글자를 자르고,
										//나머지를 호출한 페이지에 돌려보내게 된다. 
	}

}
