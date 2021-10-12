package co.bada.prj.member.serviceImpl;

import co.bada.prj.comm.Command;
import co.bada.prj.comm.UseScanner;
import co.bada.prj.member.service.MemberVO;

public class MemberDelete implements Command {

	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		String id = UseScanner.readString("삭제할 id를 입력해주세요");
		vo.setId(id);
		int nVO = memberService.memberDelete(vo);
		if(nVO != 0) {
			System.out.println("삭제 되었습니다.");
		}else {
			System.out.println("삭제중 오류가 발생하여 중단합니다.");
		}
	}

}
