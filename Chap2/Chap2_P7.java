package Main0320;

import java.util.Scanner;

public class Chap2_P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number do you want?");
		int n;
		n = scanner.nextInt();
		for (int i = 2; i < 10; i++) {
			System.out.println(n + "X" + i + "=" + (n * i));
		}
	}

}
