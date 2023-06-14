package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap6_A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char alpha = scanner.next().charAt(0);

		try {
			for (int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				if (alpha == c) {
					System.out.println(i + 1);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
