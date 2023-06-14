package Main;

import java.util.Scanner;

public class Chap3_P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String[] words = text.split(" ");
		String change = "";

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("a")) {
				char firstChar = Character.toLowerCase(words[i + 1].charAt(0));
				if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
					words[i] = "an";
				}
			}
			if (words[i].equals("an")) {
				char firstChar = Character.toLowerCase(words[i + 1].charAt(0));
				if (firstChar != 'a' && firstChar != 'e' && firstChar != 'i' && firstChar != 'o' && firstChar != 'u') {
					words[i] = "a";
				}
			}

		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");

		}

	}

}
