package Main;

import java.util.Scanner;

public class Chap4_A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("#Conditions\n" + "1. The String length should be over 10\n"
				+ "2. The String length should be under 20 'k'\n" + "3. The String should contains the character 'k'\n"
				+ "4. The String should contains the character 'l'\n"
				+ "5. The String should not contains the character 'y'\n"
				+ " -> ");

		String str = scanner.nextLine();

		if (str.length() > 10 && str.length() < 20 && str.contains("k") && str.contains("l") && !str.contains("y")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

}
