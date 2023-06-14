package Main;

import java.util.Scanner;

public class Chap4_A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		int vowl = 0;
		int conso = 0;

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				vowl++;
			} else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				conso++;
			}
		}
		System.out.println("Num. of Consonant : " + conso);
		System.out.println("Num. of Vowels : " + vowl);

	}

}
