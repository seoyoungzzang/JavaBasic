package Main;

import java.util.Scanner;

public class Chap3_P13_ExtractingWordformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// text와 word 입력받음
		String text = scanner.nextLine();
		String word = scanner.nextLine();

		int count = 0;
		int num = 0;
		int min = 1000;
		
		// 1번째 for : word의 길이만큼 루프
		for (int j = 0; j < word.length(); j++) {
			char wo = word.charAt(j);
			count = 0;
			num = 0;
			
			// 2번째 for : text의 길이만큼 루프 / word의 알파벳이 text의 알파벳과 같으면 count++
			for (int i = 0; i < text.length(); i++) {
				char te = text.charAt(i);
				if (word.charAt(j) == te) {
					count++;
				}
			}
			
			// 3번째 for : word의 길이만큼 루프 / word의 알파벳 중 같은 것이 몇개 있는지 num++ / 예를 들어 cool의 o는 2개
			for (int k = 0; k < word.length(); k++) {
				if (wo == word.charAt(k)) {
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
