package Main;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chap6_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> numbers = new LinkedList<>();
		System.out.println("숫자를 입력하세요.");
		while (true) {

			try {
				int num = scanner.nextInt();

				if (num == -1) {
					System.out.println("Queue가 출력됩니다.");
					break;
				}
				numbers.offer(num);
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
				System.out.println(count);
				break;
			}
		}

	}

}
