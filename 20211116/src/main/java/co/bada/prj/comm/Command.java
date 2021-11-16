package co.bada.prj.comm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	public String run(HttpServletRequest request, HttpServletResponse response);  
		//전달인자는 server가 가지고 있는 request와 response를 통해서 받는다. 
		//세션객체는 server에 보관. request는 요청을 처리하는 데 사용, response는 응답을 처리할 때 사용. 그리고 끊긴다. 
		//또 요청이 들어와서 같은 사람이라면, session을 제외하고 request와 response객체만 다시 생성. 
		//request와 response 객체는 server가 자동으로 생성해준다. 
}
