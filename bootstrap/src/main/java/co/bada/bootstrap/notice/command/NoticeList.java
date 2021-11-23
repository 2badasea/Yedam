package co.bada.bootstrap.notice.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.bootstrap.comm.Command;
import co.bada.bootstrap.notice.service.NoticeService;
import co.bada.bootstrap.notice.serviceImpl.NoticeServiceImpl;

public class NoticeList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		NoticeService noticeDao = new NoticeServiceImpl();
		request.setAttribute("notices", noticeDao.noticeSelectList());
		return "notice/noticeList";  // tile를 띄우기 싫을 때 직접적으로 .jsp 이름을 줬음. frontController에 보면 작동방식을 알 수 있음. 
	}									// tiles를 태우고 싶으면, .jsp 생략. 그럼 .tiles 이 붙으면서 viewPage 값이 된다. 

}
