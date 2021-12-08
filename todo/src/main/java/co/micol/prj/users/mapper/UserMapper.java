package co.micol.prj.users.mapper;

import java.util.List;

import co.micol.prj.users.vo.UserVO;

public interface UserMapper {
	public List<UserVO> userSelectList();
	public void userInsert(UserVO vo);
	public void userUpdate(UserVO vo);
	public void userDelete(UserVO vo);
} 
