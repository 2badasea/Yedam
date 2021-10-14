package co.micol.prj;

import co.micol.prj.comm.GB;
import co.micol.prj.comm.Login;
import co.micol.prj.comm.Menu;

public class MainApp {
	
	public static void main(String[] args) {
		Login login = new Login();
		Menu menu = new Menu();
		login.run();
		menu.run();
		GB.sc.close();
	}

}
