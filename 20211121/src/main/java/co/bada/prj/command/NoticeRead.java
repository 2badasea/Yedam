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
		vo.setNo(Integer.valueOf(request.getParameter("no"))); // 문자열을 inteter타입 객체로 만들어서 넘긴다. 
		request.setAttribute("notice", noticeDao.noticeSelect(vo));
		return "notice/noticeRead";
	}

}
