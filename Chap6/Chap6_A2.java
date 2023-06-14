package Main;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Chap6_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> numbers = new Stack<>();
		System.out.println("숫자를 입력하세요.");

		while (true) {

			try {
				int num = scanner.nextInt();

				if (num == -1) {
					System.out.println("Stack이 출력됩니다.");
					break;
				}
				numbers.push(num);
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				e.printStackTrace();
				scanner.nextLine();
			}
		}
		System.out.println(numbers);

		int checkNum = scanner.nextInt();
		int count = 0;

		for (int num : numbers) {
			count++;
			if (num == checkNum) {
				System.out.println(numbers.size() - count + 1);
				break;
			}
		}
	}

}
