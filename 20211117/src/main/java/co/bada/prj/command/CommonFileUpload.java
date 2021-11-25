package co.bada.prj.command;

import java.io.File;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import co.bada.prj.comm.Command;
import co.bada.prj.notice.service.NoticeService;
import co.bada.prj.notice.service.NoticeVO;
import co.bada.prj.notice.serviceImpl.NoticeServiceImpl;

public class CommonFileUpload implements Command {

	// Apache Commons-fileupload 라이브러리 사용. 스프링 프레임워크 내부에서도 많이 쓰인다.

	private String fileSave = "c:\\FileTest";   // 업로드 파일 저장공간. 
//	private String fileSave = "fileUpload";    // 운영서버에 실제 동작환경을 꾸밀 때
	private String fileName = null;  // 파일명 
	private String pfileName = null;  //물리파일명 
	
	
//	private int fileSize = 1024 * 1024 * 100; // 파일최대 사이즈 100mb
//	private String fileName; // 원본 파일 명
//	private String pfileName; // 물리 파일명
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, String> map = new HashMap<String, String>(); // 데이터 저장 할 공간.
		// 공지사항 저장
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		HttpSession session = request.getSession();
		vo.setId((String) session.getAttribute("id")); // 세션에 저장된 아이디 값. // session의 리턴값은 object이기 때문에 String으로 형변환.
		vo.setName((String) session.getAttribute("name")); // 세션에 저장된 이름 값 >>> 세션에 아이디와 이름을 담았다.
		

		DiskFileItemFactory fileItemFactory = new DiskFileItemFactory(); // 파일저장소 관련 정보
		ServletFileUpload fileUpload = new ServletFileUpload(fileItemFactory); // request객체 parse

		try { // 실제 파일 업로드 하는 부분.
			List<FileItem> items = fileUpload.parseRequest(request); 
			// FileItem 객체는 폼에서 넘어온 multipart 객체형식을 다루는 객체.
			for (FileItem item : items) {
				if (item.isFormField()) {   // formfield가 있으면  map에 담고~
					map.put(item.getFieldName() , item.getString("utf-8")); // field 명과 데이터를 저장 , 한글깨짐방지 
				} else if(!item.isFormField() && item.getSize() >0 ){  // form필드가 아니라 file객체가 들어오면 ~  
					int index = item.getName().lastIndexOf(File.separator); // 마지막 \의 위치.
					fileName = item.getName().substring(index+1); // 실 파일명만 추출
					String extension = fileName.substring(fileName.lastIndexOf("."), fileName.length()); 
					UUID uuid = UUID.randomUUID();  // 고유한 UUID생성 
					String newFileName = uuid.toString() + extension; //uuid를 통한 새로운 파일명으로 변화.ㄴ 
					pfileName = fileSave + File.separator + newFileName;  // c:\\FileTest\파일명
//					map.put("fileName", fileName);  // 원본명 담기. 
//					map.put("pfileName", pfileName); // 물리 파일명 담고~
					File uploadFile = new File(pfileName); // 파일을 열어서 읽고
					item.write(uploadFile); // 파일 업로드가 일어남. 
					
//					if(pfileName 존재하면) {    // 파일 존재 유무 확인 후 동일파일이 존재하면 다른 이름으로 교체 
//						pfileName = pfileName UUID로 변환. 
//					}
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 이곳에 DB처리할 값을 넣어주는 곳.
		vo.setFileName(fileName); // 원본.
		vo.setPfileName(pfileName); // 물리파일명
		vo.setWdate(Date.valueOf(map.get("wdate"))); 
		vo.setTitle(map.get("title"));
		vo.setSubject(map.get("subject"));
		noticeDao.noticeInsert(vo);
		return "noticeList.do";
	}

}
