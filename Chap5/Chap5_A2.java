package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap5_A2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String text = scanner.nextLine();
		String word = scanner.nextLine();

		int count = 0;
		int num = 0;
		int min = 1000;
		
		char[] w = word.toCharArray();
		char[] t = text.toCharArray();

		for (int j = 0; j < word.length(); j++) {
			char wo = w[j];
			count = 0;
			num = 0;

			for (int i = 0; i < text.length(); i++) {
				char te = t[i];
				if (w[j] == te) {
					count++;
				}
			}
			for (int k = 0; k < word.length(); k++) {
				if (w[j] == w[k]) {
					num++;
				}
			}
			count = count / num;
			if (count < min) {
				min = count;
			}
		}
		System.out.println(min);

	}

}
