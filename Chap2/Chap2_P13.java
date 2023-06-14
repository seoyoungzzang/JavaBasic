package Main0320;

import java.util.Scanner;

public class Chap2_P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			i = i + m - 1;
		}
		System.out.println(sum);
	}

}
