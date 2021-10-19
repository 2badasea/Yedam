/*
 * 해당 프로젝트는 jdbc기반으로 자바와DB를 연동했던 것. 
 * 10월 8일 프로젝트를 기반으로 클론코딩하였다. 주석이 많음. 
 */
package co.bada.prj;

import co.bada.prj.comm.MainMenu;

public class MainApp {

	public static void main(String[] args) {
		MainMenu mainMenu = new MainMenu();
		mainMenu.run();
	}

}
