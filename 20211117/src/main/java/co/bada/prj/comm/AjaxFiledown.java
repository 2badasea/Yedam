package co.bada.prj.comm;

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


@WebServlet("/AjaxFiledown")  // 파일다운로드 할 때. .do로 안 하고 별도로 controller을 거치지 않는 servlet을 만들어서 처리했음. 이 과정 복습. 
public class AjaxFiledown extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AjaxFiledown() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");  // 한글깨짐 방지 처리.
		String fileName = request.getParameter("fileName");  // original filename 
		String pfileName = request.getParameter("pfileName");  // 물리 filename   >>> 물리적으로 저장된 파일명을 다운로드 실행. 
		InputStream in = null;
		OutputStream	out = null;
		File file = null; 
		try {
			file = new File(pfileName);  // 물리위치에서 파일을 선택하고
			in = new FileInputStream(file); // 읽어 들임
			fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1"); // 한글 파일명 처리. 
			//System.out.println(fileName + "=====변환 후 파일명");
			response.setHeader("Content-Disposition", "attachment;filename=" + fileName); // 내려갔을 때 저장되는 이름. 
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
			// return은 없다. 여기서 다 끝냈기 때문. 
		
	}
	

}
