/*
 * File Upload 객체
 * Servlet 3.0 이상만 가능
 * Servlet 개체가 제공하는 Part class를 사용함
 * */
package co.bada.prj.command;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.sql.rowset.serial.SerialException;

import co.bada.prj.comm.Command;
import co.bada.prj.notice.service.NoticeService;
import co.bada.prj.notice.service.NoticeVO;
import co.bada.prj.notice.serviceImpl.NoticeServiceImpl;

//@MultipartConfig(     // 선언하지 않아도무방. 선언하는 위치 상관x 
//	location = "c:\\FileTest", // 임시저장소
//      maxFileSize = -1, // 업로드 파일사이즈 제한을 두지않음
//      maxRequestSize = -1, // 전체 multipart사이즈 제한 x // 폼에서 넘어노느 데이터의 사이즈에 제한을 두지 않음. 
//      fileSizeThreshold = 1024) // 임시저장시 byte단위로 저장

public class ServletApiUpload implements Command {
   private String attechDir = "c:\\FileTest"; // 실제 저장할 장소
   private String fileName;

   @Override
   public String run(HttpServletRequest request, HttpServletResponse response) {  
	   // 공지사항 저장
	    NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		HttpSession session = request.getSession();
		vo.setId((String) session.getAttribute("id")); //세션에 저장된 아이디 값.
		vo.setName((String) session.getAttribute("name")); // 세션에 저장된 이름  >>> 세션에 아이디와 이름을 담았다. 
	   
      String contentType = request.getContentType(); // 콘텐츠 타입을 가져옴
      if (contentType != null && contentType.toLowerCase().startsWith("multipart/")) {
         try {
            Collection<Part> parts = request.getParts();   // 폼에서 넘오는 데이터를 각각 part객체에 담음. 
            for (Part part : parts) {
               if (part.getHeader("Content-Disposition").contains("filename=")) {
                  String partHeader = part.getHeader("Content-Disposition");
                  for (String str : partHeader.split(",")) {
                     if (str.trim().startsWith("filename")) {  // 파일명 찾음. 
                        fileName = str.substring(str.indexOf("=") + 1).trim().replace("\"", ""); // replace() >> 특수문자를 공백으로. trim() >> 좌우공백제거. 
                        int index = fileName.indexOf(File.separator); 
                        fileName = fileName.substring(index + 1);
                        System.out.println(fileName);
                     }
                  }
                  if (part.getSize() > 0) {  // filename이 존재한다면~
                     part.write(attechDir + File.separator + fileName); // 파일저장 물리적 filename에 이런 형식으로 들어가야 함. 
                     part.delete(); // 임시저장된 파일삭제
                  }

               }
            }
         } catch (IOException | ServletException e) {
            e.printStackTrace();
         }

      } // 파일 업로드.
      	vo.setFileName(fileName);  // 원본. 
		vo.setPfileName(attechDir + File.separator + fileName);  // 물리파일명 
		
		vo.setWdate(Date.valueOf(request.getParameter("wdate"))); //브라우저를 통해서 서버로 넘어오는 값들은 전부 다  string이다. 근데 wdate은  Date타입으로  db에서 형성함. 
		// 서버에선 문자열 타입으로 받음. 그래서 string으로 들어온 것을 Data객체가 가지고 있는 valueof메소드를 통해
		// date타입으로 바꿔준다.    >>> 문자를 날짜로 변경.
		vo.setTitle(request.getParameter("title"));
		vo.setSubject(request.getParameter("subject"));
		noticeDao.noticeInsert(vo);
      
      // 이곳에 데이터 처리 request.getParameter("id")형식으로 vo 객체에 담아서 처리. 
      return null;
   }

}