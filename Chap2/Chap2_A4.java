package Main0320;

import java.util.Scanner;

public class Chap2_A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = n; j > i + 1; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
