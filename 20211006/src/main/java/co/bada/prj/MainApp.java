package co.bada.prj;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import co.bada.prj.vo.DevVO;

import co.bada.prj.vo.Bycle;
import co.bada.prj.vo.Car;
import co.bada.prj.vo.Command;

public class MainApp {

	private static DevVO vo; // VO객체 인스턴스 정의. //static추가. main안에서 써야하므로.
	private static MapTest mapTest; // 4교시 수업용. hashmap. 사용할 객체를 선언.
	
	private static Map<String, Command> map = new HashMap<String, Command>();
	
	
	private static Properties properties = new Properties();//사용할 properties객체 '정의'

	public static void main(String[] args) {
		List<DevVO> list = new ArrayList<DevVO>();
		vo = new DevVO(); //
		vo.setId(1);
		vo.setName("홍길동");
		vo.setAddress("대구광역시 중구");
		vo.setAge(23); // 데이터 하나씩 담아서 객체의 모습을 완성.

		list.add(vo); // ArrayList 구조에 객체 하나를 추가.

		// 하나 더 추가..
		vo = new DevVO(); // 객체 초기화.
		vo.setId(2);
		vo.setName("이바다");
		vo.setAddress("대구광역시 수성구");
		vo.setAge(30); // 데이터 하나씩 담아서 객체의 모습을 완성.
		// 하나 더 추가..
		list.add(vo);

		System.out.println(list.get(0).getId()); // 0번째의 아이디를 출력해라.
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getAddress());
		System.out.println(list.get(0).getAge()); // 0번째의 나이를 출력해라.

		System.out.println("=======toString()메서드 활용.=======");
		// 일일이 출력하는 게 번거로워서 toString()메서드를 만들었엇음.
		list.get(0).toString(); // list가 가지고 있는 첫 번째(index[0]) 요소를 출력한다.
		list.get(1).toString();

		System.out.println("=======일반 for문.==========");
		// 바로 위의 방식과는 또 다른 방식으로, 많은 수를 나열할 때.
		for (int i = 0; i < list.size(); i++) { // 리스트 전체를 출력.
			list.get(i).toString();
		}

		System.out.println("========forEach==========");
		// 위의 방법도 번거로워서 보다 나은 방법 >>> forEach문
		for (DevVO vo : list) { // >> 이것도 list전체를 가져오는 방법. 보다 간결.
			vo.toString(); // 컬렉션 객체를 다룰 땐 보통 읽어오기 때문에 forEach문 주로 사용.
		}

		System.out.println("===========4교시 HashMap=============");
		mapTest = new MapTest();

		mapTest.setMap("bada", "1234");
		mapTest.setMap("seulbi", "9662");
		mapTest.setMap("sujeong", "3811");
		mapTest.setMap("kayoung", "2952");

		String pw = mapTest.getMap("bada"); // 아이디가 bada인 사람의 비밀번호를 알고 싶을 때.
		System.out.println(pw);
		
		////
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("age", 23);
		map.put("id", 6);
		
		int age = map.get("age");
		System.out.println(age);
		System.out.println(map.get("id"));
		
		Map<String, DevVO> mapVo = new HashMap<String, DevVO>();
		DevVO vo = new DevVO();
		vo.setId(1);
		vo.setName("홍길동");
		vo.setAddress("서울");
		vo.setAge(20);
		mapVo.put("홍길동", vo);

		
		
		vo = new DevVO();
		vo.setId(2);
		vo.setName("박수동");
		vo.setAddress("대구");
		vo.setAge(23);
		mapVo.put("박수동", vo);
		
		DevVO vo1 = new DevVO();
		vo1 = mapVo.get("홍길동");
		vo1.toString();
		
//		map.put("car", new Car());          왜 에러가 뜰까. 
//		map.put("bycle", new Bycle());
//		
//		Command command = map.get("car");
//		command.run();
		
		
		System.out.println("==========================="); 
		 	File path = new File("src/main/resources/info.properties");  //파일 경로 설정.
		 	FileReader file;    //파일 내용을 읽어 드리는 객체.
		 	//이런 방식은 db랑 연동할 때 많이 쓰인다. 
		 	try{
		 		file = new FileReader(path);	//프로퍼티 파일을 읽어 들임. 
		 		properties.load(file);			//Properties 객체에 저장. map.put()
		 		System.out.println(properties.getProperty("name"));
		 		System.out.println(properties.getProperty("tel"));
		 		System.out.println(properties.getProperty("address"));
		 		
		 	} catch (Exception e) {
		 		e.printStackTrace();
		 	}
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	

	}

}
