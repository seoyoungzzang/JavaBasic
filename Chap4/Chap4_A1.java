package Main;

import java.util.Scanner;

public class Chap4_A1 {
	int n, m;
	String result = "";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		printResult(n, m);
	}

	public static void printResult(int n, int m) {
		int[] dice = new int[n]; // 받은 n의 크기인 배열 생성
		int sum = 0; // 주사위 총 눈금수
		String result = ""; //

		while (dice[0] <= m - n + 1) {
			// 첫 번째 주사위 값이 1~6 사이인 경우에만 계산
			if (dice[0] >= 1 && dice[0] <= 6) {
				// 주사위 값 계산
				sum = 0;
				for (int i = 0; i < n; i++) {
					sum += dice[i];
				}
				if (sum == m) {
					// 결과값 누적
					result += "(";
					for (int i = 0; i < n; i++) {
						result += dice[i];
						if (i != n - 1) {
							result += ",";
						}
					}
					result += ")\n";
				}
			}

			// 다음 주사위 값 계산을 위한 연산
			dice[n - 1]++;
			for (int i = n - 1; i > 0; i--) {
				if (dice[i] > 6) {
					dice[i] = 1;
					dice[i - 1]++;
				} else {
					break;
				}
			}
		}

		// 결과 출력
		System.out.println(result);
	}
}