package Main;

import java.util.Scanner;

public class Chap4_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		int total = 0;

		while (true) {
			System.out.println("#Menu\n" + "1. Deposit\n" + "2. Withraw");
			int choice = scanner.nextInt();
			System.out.println("-> " + choice);

			int money = scanner.nextInt();

			if (choice == 1) {
				total = balance + money;
				System.out.println("잔액 : " + total);
				balance = total;
			} else if (choice == 2) {
				total = balance - money;
				System.out.println("잔액 : " + total);
				balance = total;
			} else {
				System.out.println("1 또는 2를 입력하세요.");
			}
		}
	}

}
