package Main0320;

import java.util.Scanner;

public class Chap2_A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		int min;
		if (num1 < num2) {
			min = num1;
		} else {
			min = num2;
		}

		for (int i = min; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				break;
			}
		}
	}

}
