package co.bada.bootstrap.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.bootstrap.comm.Command;

public class MainCommand implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		
		return "main/main";  // tiles.xml 에서 wildcard: */* 형식의 예시 중 하나. 
	}

}
