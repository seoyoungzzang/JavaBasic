package Main0320;

import java.util.Scanner;

public class Chap2_P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("What operation do you want?\n");
		System.out.println("1. +\n");
		System.out.println("2. -\n");
		System.out.println("3. *\n");
		System.out.println("4. /\n");
		System.out.println("--->\n");

		int op = scanner.nextInt();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		if (op == 1) {
			System.out.println(num1 + num2);
		} else if (op == 2) {
			System.out.println(num1 - num2);
		} else if (op == 3) {
			System.out.println(num1 * num2);
		} else if (op == 4) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("유효한 숫자를 입력하세요.");
		}
	}

}
