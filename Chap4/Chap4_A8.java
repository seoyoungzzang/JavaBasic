package Main;

import java.util.Scanner;

public class Chap4_A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("#Menu\n" + "1. Encoder\n" + "2. Decoder\n" + "3. Exit");

		int choice = scanner.nextInt();
		scanner.nextLine();
		String text = scanner.nextLine();

		if (choice == 1) {
			printEnc(text);
		} else if (choice == 2) {
			printDec(text);
		} else if (choice == 3) {
			System.out.println("Exit");
		} else {
			System.out.println("1 ~ 3 사이의 숫자를 입력하세요.");
		}

	}

	//숫자 -> 영어
	public static void printEnc(String text) {
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			c = (char)(c - '0' + 'a');
			System.out.print(c);
	}

	}

	//영어 -> 숫자
	public static void printDec(String text) {
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			System.out.print(c - 'a');
	}

}
}