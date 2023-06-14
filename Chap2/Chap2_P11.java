package Main0320;

import java.util.Scanner;

public class Chap2_P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();

		if (n > 1) {
			for (int i = 1; i < 10; i++) {
				System.out.println(n + "X" + i + "=" + (i * n));
			}
		} else {
			System.out.println("1보다 큰 수를 입력하세요.");
		}
	}

}
