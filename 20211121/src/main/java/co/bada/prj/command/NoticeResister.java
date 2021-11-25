package co.bada.prj.command;

import java.io.File;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.bada.prj.comm.Command;
import co.bada.prj.notice.service.NoticeService;
import co.bada.prj.notice.service.NoticeVO;
import co.bada.prj.notice.serviceImpl.NoticeServiceImpl;

public class NoticeResister implements Command {
	private String filePath="c:\\FileTest";  // 파일이 저장되는 절대 경로  \특수기호를 사용하기 우ㅟ해 \를 붙임. 
	private int fileSize = 1024 * 1024 * 100; // 파일 최대사이즈 100mb 
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 공지사항 저장
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		HttpSession session = request.getSession();
		vo.setId((String) session.getAttribute("id")); //세션에 저장된 아이디 값.
		vo.setName((String) session.getAttribute("name")); // 세션에 저장된 이름  >>> 세션에 아이디와 이름을 담았다. 
		
		try {    //cos.jar에서 제공하는 multipartrequest객체. 									//중복된 파일이 올라온다면 자동으로index를 붙여주는 메소드. defaul~policy()
			MultipartRequest multi = new MultipartRequest(request, filePath, fileSize, "utf-8", new DefaultFileRenamePolicy());
				//여기까지 파일이 다 올라간 상태다. 객체가 생성될 때가 파일이 이미 올라간 상태인 것이다.
			//filename은 중복이름이 들어올 경우 자동으로index가 있는 물리 파일명
			String fileName = multi.getFilesystemName("fileName");
			//index되기 전의 원본명
			String original = multi.getOriginalFileName("fileName"); // 원본 파일 명 
			fileName = filePath + File.separator + fileName;   // separater은 \\ 를 붙여주는 것.  >>> 저장경로를 포함해서 만듬  >>> c:/FileTest/fileName 형태로 들어간다. 
			if(original != null) {  //첨부 파일이 존재할 때~  mapper에서 insert컬람값을 넣지않고, values값만 넣었을 경우. 만약 insert쿼리에 행이름을 다 넣었으면 ifelse안해도 됨.
				vo.setFileName(original); // 원본 파일 저장. 
				vo.setPfileName(fileName); // 물리 파일명
			} else {  // 첨부 파일이 존재하지 않을 때
				vo.setFileName("");
				vo.setPfileName("");
			}
			vo.setWdate(Date.valueOf(multi.getParameter("wdate"))); //브라우저를 통해서 서버로 넘어오는 값들은 전부 다  string이다. 근데 wdate은  Date타입으로  db에서 형성함. 
			// 서버에선 문자열 타입으로 받음. 그래서 string으로 들어온 것을 Data객체가 가지고 있는 valueof메소드를 통해
			// date타입으로 바꿔준다.    >>> 문자를 날짜로 변경.
			vo.setTitle(multi.getParameter("title"));
			vo.setSubject(multi.getParameter("subject"));
			
			noticeDao.noticeInsert(vo); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "noticeList.do";
	}

}
