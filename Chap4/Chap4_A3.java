package Main;

import java.util.Scanner;

public class Chap4_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int sum = 0;

		// 1부터 m까지 n의 배수의 합 계산
		for (int i = 1; i <= m; i++) {
			if (i % n == 0) {
				sum = sum + i;
			}
		}
		System.out.print("SUM : " + sum);

		// 1부터 m까지 n의 배수 출력
		System.out.print("(");
		for (int i = 1; i <= m; i++) {
			if (i % n == 0) {
				System.out.print(i);
				if (i < m - n + 1) {
					System.out.print(",");
				}

			}
		}
		System.out.print(")");
	}
}
