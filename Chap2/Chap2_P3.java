package Main0320;

import java.util.Scanner;

public class Chap2_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the 1st number!");
		int money = scanner.nextInt();
		System.out.println("Input the 2st number!");
		int change = scanner.nextInt();

		System.out.println("exchange : " + (money - change));
		int rest = (money - change);
		System.out.println("10,000 : " + (rest / 10000));
		System.out.println("5,000 : " + ((rest % 10000) / 5000));
		System.out.println("1,000 : " + (rest % 5000) / 1000);
		System.out.println("500 : " + ((rest % 1000) / 500));
		System.out.println("100 : " + ((rest % 500) / 100));
		System.out.println("50 : " + ((rest % 100) / 50));
		System.out.println("10 : " + ((rest % 50) / 10));
	}

}
