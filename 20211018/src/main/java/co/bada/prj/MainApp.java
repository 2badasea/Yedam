/*
 * 제출용
 */
package co.bada.prj;

import co.bada.prj.comm.Login;
import co.bada.prj.comm.Menu;

public class MainApp {
	
	public static void main(String[] args) {
		
		Login login = new Login();
		Menu menu = new Menu();
		login.run();
		menu.run();

	}

}
