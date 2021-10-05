package co.bada.prj;

import java.util.ArrayList; 
import java.util.List;

import co.bada.prj.member.Member;

/**
 * Hello world!
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        Example01 ex = new Example01();
        ex.stringTest();
        // 'd'가 출력된다. 
        
        System.out.println("============DateTest 클래스 실험=============");
        DateTest dateTest = new DateTest();
        dateTest.dateTest();
        
        dateTest.calendarTest();
        
        System.out.println("===================");
        SqlDateTest sd = new SqlDateTest();
        sd.sqlDate();
        
        
        System.out.println("=============컬렉션프레임워크==========");
        
        Member member;
        List<Member> members = new ArrayList<Member>(); //멤버객체를 담을 수 있는 array구조를 만듬. 
        member = new Member("홍길동 ", " 대구", 30);
        members.add(member);  // 리스트에 한 명의 데이터를 담음. 
        member = new Member("이바다 ", " 대구", 30);
        members.add(member);  // 리스트에 한 명의 데이터를 담음.
        member = new Member("조수정 ", " 대구", 53);
        members.add(member);  // 리스트에 한 명의 데이터를 담음.
        member = new Member("이슬비 ", " 대구", 28);
        members.add(member);  // 리스트에 한 명의 데이터를 담음.
        
        for(Member m : members) {
        	m.toString();
        }
        
    }
}
