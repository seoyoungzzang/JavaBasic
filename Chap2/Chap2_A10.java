package Main0320;

import java.util.Scanner;

public class Chap2_A10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 1000;
		System.out.print("#Menu\n" + "1. Coke - 340\n" + "2. Orange Juice - 500\n" + "3. Milk - 650\n"
				+ "4. Water - 290\n" + "5. Coffee - 170\n" + "-> ");
		int n = scanner.nextInt();
		int result = 0;

		if (n == 1) {
			result = money - 340;
		} else if (n == 2) {
			result = money - 500;
		} else if (n == 3) {
			result = money - 650;
		} else if (n == 4) {
			result = money - 290;
		} else if (n == 5) {
			result = money - 170;
		} else {
			System.out.println("유효한 값을 입력하세요.");
		}

		int rest100 = result / 100;
		int rest50 = (result % 100) / 50;
		int rest10 = (result % 50) / 10;

		System.out.println(
				"The change is " + result + "(100 X " + rest100 + ", 50 X " + rest50 + ", 10 X " + rest10 + ")");
	}

}
