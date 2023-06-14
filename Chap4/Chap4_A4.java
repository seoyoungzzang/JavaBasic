package Main;

import java.util.Scanner;

public class Chap4_A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("#Menu\n" + "1. Encryption\n" + "2. Decryption");
			int choice = scanner.nextInt();
			scanner.nextLine();
			System.out.println("-> " + choice);

			String text = scanner.nextLine();

			if (choice == 1) {
				printEnc(text);
			} else if (choice == 2) {
				printDec(text);
			} else {
				System.out.println("1 또는 2를 입력하세요.");
			}

		}
	}

	// 암호화
	public static void printEnc(String text) {
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c >= 'a' && c < 'z') {
				c = (char) (c + 1);
			} else if (c == 'z') {
				c = 'a';
			}
			System.out.print(c);
		}
		System.out.println();
	}

	// 복호화
	public static void printDec(String text) {
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c > 'a' && c <= 'z') {
				c = (char) (c - 1);
			} else if (c == 'a') {
				c = 'z';
			}
			System.out.print(c);
		}
		System.out.println();
	}

}
