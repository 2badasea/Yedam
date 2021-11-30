package co.bada.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.comm.Command;
import co.bada.prj.notice.service.NoticeService;
import co.bada.prj.notice.service.NoticeVO;
import co.bada.prj.notice.serviceImpl.NoticeServiceImpl;

public class NoticeRead implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setNo(Integer.valueOf(request.getParameter("no")));  // 문자열을 integer타입 객체로 만들어서 넘김. 
//		vo = noticeDao.noticeSelect(vo); 밑의 방식으로 해도 됨. 
		request.setAttribute("notice", noticeDao.noticeSelect(vo));  // 알아서 형 변환됨 
		return "notice/noticeRead";
		
	}

}
