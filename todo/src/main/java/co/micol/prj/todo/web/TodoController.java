package co.micol.prj.todo.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.micol.prj.todo.mapper.TodoMapper;
import co.micol.prj.todo.vo.TodoVO;

@Controller
@CrossOrigin(origins = "http://127.0.0.1:5500", maxAge = 3600)
public class TodoController {

	@Autowired TodoMapper mapper;
	
	@ResponseBody
	@GetMapping("/todoSelect")   
	public List<TodoVO> todoSelectList(TodoVO vo) throws InterruptedException {
		//Thread.sleep(2000);
		return mapper.todoSelectList();
	}
	@ResponseBody	
	@PostMapping("/todoInsert")
	public TodoVO todoInsert(TodoVO vo) {
		System.out.println(vo+"=======");
		 mapper.todoInsert(vo);
		 return vo;
	}
	@ResponseBody
	@PostMapping("/todoUpdate")
	public TodoVO todoUpdate(TodoVO vo) {
		 mapper.todoUpdate(vo);
		 return vo;
	}	
	
	@GetMapping("/ajax1")
	public void todoDelete(HttpServletResponse response) throws IOException {
		response.setContentType("application/json"); // 여기서 json타입이란 걸 안 알려주면, ajaxTest.html에서  => dataType:"json" 이걸 추가해준다.  
		response.getWriter().append("{\"name\":\"hong\",\"age\":20}");
		//response.getWriter().append("<font color='red'>test</font>");
	}		
}
