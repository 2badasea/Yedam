package co.bada.bootstrap.comm.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bada.bootstrap.comm.Command;

public class Buttons implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "main/buttons";
	}

}
