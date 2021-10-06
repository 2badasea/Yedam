package co.bada.prj;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	private Map<String, String> map = new HashMap<String, String>(); 
			//key, value타입.  >>> 똑같아야 한다. 좌변우변의 매개타입. 
	
	public void setMap(String id, String password) {   
		map.put(id, password);    //컬렉션 객체(map)에 담아주는 역할. void타입으로 함.
	}
	
	public String getMap(String id) {
		//키 값(id)를 넣으면 (맵 에서 key에 맞는 데이터를 가져온다.)
		return map.get(id);   //
	}
}
