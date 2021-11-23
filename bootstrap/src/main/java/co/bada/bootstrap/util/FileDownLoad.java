package co.bada.bootstrap.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * FileDownLoad Class
 */
@WebServlet("/FileDownLoad")  //controller 안 태우고 바로 처리. 
public class FileDownLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FileDownLoad() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1117프로젝트의 AjaxFileDown servlet 밑부분 복사. doget()에 선언하면 전역에서 사용가능. 
		request.setCharacterEncoding("utf-8"); // 한글 깨짐 방지 처리
		String ofileName = request.getParameter("ofileName");  // original filename 
		String pfileName = request.getParameter("pfileName");  // 물리 filename   >>> 물리적으로 저장된 파일명을 다운로드 실행. 
		InputStream in = null;
		OutputStream	out = null;
		File file = null; 
		try {
			file = new File(pfileName);  // 물리위치에서 파일을 선택하고
			in = new FileInputStream(file); // 읽어 들임
			ofileName = new String(ofileName.getBytes("UTF-8"), "ISO-8859-1"); // 한글 파일명 처리. 
			//System.out.println(fileName + "=====변환 후 파일명");
			response.setHeader("Content-Disposition", "attachment;filename=" + ofileName); // 내려갔을 때 저장되는 이름. 
			out = response.getOutputStream();  // response 객체로 초기화
			byte[] b = new byte[(int)file.length()];  // 메모리에 파일을 담음. 파일 길이만큼 버퍼 만들기.
			int leng = 0; 
			while((leng = in.read(b)) > 0 ) {  //실제 다운로드 함
				out.write(b,0,leng); //   https://m.blog.naver.com/okopok5019/221553342844   
			}
			in.close();  // iostream은 실행 후 반드시 닫아줘야 한다.
			out.flush();
			out.close();  // iostream은 실행 후 반드시 닫아줘야 한다.
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
