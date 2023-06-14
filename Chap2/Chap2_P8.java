package Main0320;

import java.util.Scanner;

public class Chap2_P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int j = 1;
		while (j < 10) {
			switch (j) {
			case 1:
				System.out.println(n + "X" + j + "=" + (n * j));
			case 2:
				System.out.println(n + "X" + (j + 1) + "=" + (n * (j + 1)));
			case 3:
				System.out.println(n + "X" + (j + 2) + "=" + (n * (j + 2)));
			case 4:
				System.out.println(n + "X" + (j + 3) + "=" + (n * (j + 3)));
			case 5:
				System.out.println(n + "X" + (j + 4) + "=" + (n * (j + 4)));
			case 6:
				System.out.println(n + "X" + (j + 5) + "=" + (n * (j + 5)));
			case 7:
				System.out.println(n + "X" + (j + 6) + "=" + (n * (j + 6)));
			case 8:
				System.out.println(n + "X" + (j + 7) + "=" + (n * (j + 7)));
			case 9:
				System.out.println(n + "X" + (j + 8) + "=" + (n * (j + 8)));
				break;
			}
			System.out.println("");
			break;
		}
	}

}
