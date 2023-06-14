package Main0320;

import java.util.Scanner;

public class Chap2_A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		int sum = num1 * num2;

		for (int i = 1; i <= sum; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.println(i);
				break;
			}
		}
	}

}
