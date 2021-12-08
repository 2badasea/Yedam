package co.micol.prj.users.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import co.micol.prj.users.mapper.UserMapper;
import co.micol.prj.users.vo.UserVO;

@CrossOrigin(origins = {"http://127.0.0.1:3000"}, maxAge = 3600)
@RestController
public class UserController {

	@Autowired UserMapper mapper;
	
	@GetMapping("/userSelect")
	public List<UserVO> userSelectList(UserVO vo) {
		return mapper.userSelectList();
	}
		
	@PostMapping("/userInsert")
	public UserVO userInsert(UserVO vo) {
		System.out.println(vo+"=======");
		 mapper.userInsert(vo);
		 return vo;
	}
	
	@PostMapping("/userUpdate")
	public UserVO userUpdate(UserVO vo) {
		 mapper.userUpdate(vo);
		 return vo;
	}	
	@GetMapping("/userDelete")
	public UserVO userDelete(UserVO vo) {
		 mapper.userDelete(vo);
		 return vo;
	}		
}
