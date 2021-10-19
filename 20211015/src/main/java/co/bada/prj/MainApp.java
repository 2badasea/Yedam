package co.bada.prj;

import java.util.Scanner;

import co.bada.prj.member.service.MemberService;
import co.bada.prj.member.service.MemberVO;
import co.bada.prj.member.serviceimpl.MemberServiceImpl;
import co.bada.prj.util.EncryptionSha;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EncryptionSha enc = new EncryptionSha();
		MemberService memberDao = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		String encKey = memberDao.encKey();  //DB에 저장된 암호화 Key값을 가져온다. 
		
		System.out.println("*** 아이디를 입력하세요...");
		member.setId(sc.nextLine());
		System.out.println("**패스워드를 입력하세요...");
		String password = sc.nextLine();
		member.setPassword(enc.sha512(password, encKey)); //입력된 패스워드 암호화. 
		
		member = memberDao.memberLogin(member);
		if(member.getName() != null) {
			System.out.print(member.getName());
			System.out.println("님 환영합니다.");
		} else {
			System.out.println("아이디 또는 패스워드가 틀립니다.");
		}
		System.out.println(member.getName());
		
		sc.close();
	}
		
	}

//		Stack stack = new Stack();
//		stack.push('a');
//		stack.push('b');
//		stack.push('c');
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());

//		System.out.println("===================================="); 
//		Queue queue = new Queue();
//		queue.put(1);
//		queue.put(2);
//		queue.put(3);
//		queue.put(4);
//		queue.put(5);

//		System.out.println(queue.get());
//		System.out.println(queue.get());
//		System.out.println(queue.get());
//		System.out.println(queue.get());
//		System.out.println(queue.get());
//		System.out.println(queue.get());
//		
//		queue.put(8);
//		queue.put(9);
//		
//		System.out.println(queue.get());
//		System.out.println(queue.get());