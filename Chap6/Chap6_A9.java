package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap6_A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while (true) {
			try {
				int n = scanner.nextInt();

				sum = sum + n;
				max = Math.max(max, n);
				min = Math.min(min, n);
				count++;

				if (count > 0) {
					double mean = (double) sum / count;
					System.out.println("Result : " + count + " - Mean " + mean + " Max " + max + " Min " + min);
				} else {
					System.out.println("Error");
				}
			} catch (InputMismatchException e) {
				System.out.println("다시 입력하세요.");
				scanner.nextLine(); //다른 타입 입력했을 때 비워주는 용도
			}
		}

	}

}
