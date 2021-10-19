/*
 * 이 프로젝트는 mybatis기반 복습용. 20211013프로젝트를 클론코딩. 
 */
package co.bada.prj;

import co.bada.prj.comm.Login;
import co.bada.prj.comm.Menu;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Hello BADA");
		
		Login login = new Login();
		Menu menu = new Menu();
		login.run();
		menu.run();
		

	}

}
