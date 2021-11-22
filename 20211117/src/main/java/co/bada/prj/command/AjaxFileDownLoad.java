package co.bada.prj.command;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.prj.comm.Command;

public class AjaxFileDownLoad implements Command {   // 파일 다운로드 

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		String fileName = request.getParameter("fileName");  // original filename 
		String pfileName = request.getParameter("pfileName");  // 물리 filename   >>> 물리적으로 저장된 파일명을 다운로드 실행. 
		
		//> outputstream에 의해 원본파일명으로 다운로드됨. 
		//파일다운로드 로직 작성.
		InputStream in = null;
		OutputStream out = null;
		File file = null; 
		try {
			file = new File(pfileName);  // 물리위치에서 파일을 선택하고
			in = new FileInputStream(file); // 읽어 드림
			fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1"); // 한글 파일명 처리. 
			
			//System.out.println(fileName + "=====변환 후 파일명");
			response.setHeader("Content-Disposition", "attachment;filename=" + fileName); // 내려갔을 때 저장되는 이름. 
			out = response.getOutputStream();  // response 객체로 초기화
			byte b[] = new byte[(int)file.length()];  // 메모리에 파일을 담음. 파일 길이만큼 버퍼 만들기.
			int leng = 0; 
			while((leng = in.read(b)) > 0 ) {  //실제 다운로드 함
				out.write(b,0,leng); //   https://m.blog.naver.com/okopok5019/221553342844   
			}
			in.close();  // iostream은 실행 후 반드시 닫아줘야 한다. 
			out.close();  // iostream은 실행 후 반드시 닫아줘야 한다. 
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		return "noticeList.do";
	}

}
