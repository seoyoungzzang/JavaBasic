package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Chap5_A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		String[] text = word.split(" ");
		Arrays.sort(text);

		for (int i = 0; i < text.length; i++) {
			words.add(text[i]);
		}
		// 위에서 Array.sort로 정렬해줘서 다시 sort할 필요 없음
		Collections.reverse(words);
		System.out.println(words);
	}

}
