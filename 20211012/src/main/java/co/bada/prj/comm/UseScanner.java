package co.bada.prj.comm;

import java.util.Scanner;

public class UseScanner {
private static Scanner scanner = new Scanner(System.in);
	
	public static int readInt(String msg) {
		System.out.println(msg);
		int i = scanner.nextInt(); scanner.nextLine();
		return i;
	}
	
	public static String readString(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}

	public static void close() {
		scanner.close();
	}
}
