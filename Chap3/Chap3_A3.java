package Main;

import java.util.Scanner;

public class Chap3_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String text = scanner.nextLine();
		char[] c = text.toCharArray();
		
		
		//알파벳 갯수만큼 배열 만들고 배열 초기화
		int[] count = new int[26];
		for (int i = 0; i < 26;i++) {
			count[i] = 0;
		}
		
		//소문자를 대문자로 바꿔주기
		for (int i = 0; i < text.length(); i++) {
			if (c[i] >= 'a' && c[i] <= 'z') {
				c[i] = (char)(c[i] - 32);
			}	
		}
		
		//text의 알파벳의 갯수만큼 카운트해주기
		for (int i = 0; i < text.length(); i++) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				count[c[i] - 'A']++;
			} 
		}
		
		//알파벳 갯수대로 출력하기
		for (int i = 0; i < 26; i++) {
			if(count[i] > 0) {
				System.out.println((char)('A' + i) + "-" + count[i]);
			}	
		}
			
	}
}
