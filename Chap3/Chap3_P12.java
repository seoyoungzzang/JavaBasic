package Main;

import java.util.Scanner;

public class Chap3_P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		

		
		int choice = 0;
		float temp = 0;
		
		while (true) {
			System.out.println("#Current Converter\n"
					+ "1. Celsius → Fahrenheit\n"
					+ "2. Fahrenheit → Celsius");
		
		choice = scanner.nextInt();
		if (choice < 1 || choice > 2) {
			System.out.println("유효한 숫자를 입력하세요.");
			continue;
		}
	
		break;
		}
		
		temp = scanner.nextInt();
		float result = 0;
	
		if (choice == 1) {
			result = (temp * 9) / 5 + 32;
			System.out.printf("%.2f\n", result);
		} else if (choice == 2) {
			result = (temp - 32) * 5 / 9;
			System.out.printf("%.2f\n", result);
		} 
		
	}

}
