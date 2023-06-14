package Main0320;

import java.util.Scanner;

public class Chap2_A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = n; j > i + 1; j--) {
				System.out.print("**");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
