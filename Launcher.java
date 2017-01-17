package drone_delivery_system;

import java.util.Scanner;

public class Launcher {
	private static Scanner scanner;
	public static void main(String[] args) {
		runSystem();
	}

	private static void runSystem() {
		String request;
		do {
			request = scanner.nextLine();
			parseRequest(request);
			//RequestManager rm = new RequestManager();
			//rm.checkIfRequestPossible();
		} while (!request.equals("exit"));
	}

	private static void parseRequest(String request) {
		//TODO
	}
}
