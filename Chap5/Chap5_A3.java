package Main;

import java.util.Scanner;

public class Chap5_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 --> 소문자");
		String str = scanner.nextLine();
		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			c[i] = (char) (c[i] - '0' + 'a' - 1);
			System.out.print(c[i]);
		}

	}

}
