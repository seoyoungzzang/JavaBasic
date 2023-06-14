package Main;

import java.util.Scanner;

public class Chap3_P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		int cash = 0;
		
		while (true) {
			System.out.println("#Current Converter\n"
					+ "1. Won → USD\n"
					+ "2. Won → CNY\n"
					+ "3. Won → EUR");

		choice = scanner.nextInt();
		if (choice < 1 || choice > 3) {
			System.out.println("유효한 숫자를 입력하세요.");
			continue;
		}
		
		cash = scanner.nextInt();
		if (cash <= 0 ) {
			System.out.println("0보다 큰 금액을 입력하세요.");
			continue;
		}
		
		break;
		}
		
		if (choice == 1) {
		    System.out.printf("%.2f\n", (float)cash / 1308.5);
		} else if (choice == 2) {
		    System.out.printf("%.2f\n", (float)cash / 190.35);
		} else if (choice == 3) {
		    System.out.printf("%.2f\n", (float)cash / 1402.38);
		} 

		
	}
}