package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap6_A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int checkNum = 0;
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		System.out.println("확인할 숫자를 입력하세요.(0 ~ 9)");
		while (true) {
			try {
				checkNum = scanner.nextInt();
				if (checkNum < 0 || checkNum > 9) {
					throw new IllegalArgumentException("0부터 9까지의 숫자를 입력하세요.");
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				scanner.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println("0부터 9까지의 숫자를 입력하세요.");
				scanner.nextLine();
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			String arrNum = Integer.toString(numbers[i]);
			if (arrNum.contains(Integer.toString(checkNum))) {
				System.out.print(numbers[i] + " ");
			}
		}
	}

}
