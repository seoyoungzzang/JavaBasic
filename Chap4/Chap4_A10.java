package Main;

import java.util.Scanner;

public class Chap4_A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String str1 = scanner.next();
		String str2 = scanner.next();

		printtext1(str1);
		printtext2(str2);

		if (printtext1(str1).equals(printtext2(str2))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static String printtext1(String str1) {

		String result1 = "";
		for (int i = (int) 'a'; i < (int) 'z'; i++) {
			for (int j = 0; j < str1.length(); j++) {
				char c = str1.charAt(j);
				if (c == (char) i) {
					result1 = result1 + str1.substring(j, j + 1);
				}
			}
		}
		return result1;
	}

	public static String printtext2(String str2) {
		String result2 = "";
		for (int i = (int) 'a'; i < (int) 'z'; i++) {
			for (int j = 0; j < str2.length(); j++) {
				char c = str2.charAt(j);
				if (c == (char) i) {
					result2 = result2 + str2.substring(j, j + 1);
				}
			}
		}
		return result2;
	}

}
