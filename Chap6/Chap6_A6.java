package Main;

import java.util.Scanner;

public class Chap6_A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);

			System.out.println("");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int N = Math.min(num1, num2);
			int M = Math.max(num1, num2);

			rollDice(N, M, "");
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
		}
	}

	public static void rollDice(int N, int M, String result) {
		try {
			if (N == 0 && M == 0) { // N번 주사위를 던지고, 합이 M이 되었을 때
				System.out.println("(" + result.substring(2) + ")"); // 맨 앞에 있는 ", " 제거
			} else if (N > 0 && M > 0) { // 아직 주사위를 던지지 않은 경우
				for (int i = 1; i <= 6; i++) {
					rollDice(N - 1, M - i, result + ", " + i); // 쉼표 추가
				}
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
