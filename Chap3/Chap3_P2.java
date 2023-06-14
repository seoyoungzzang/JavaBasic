package Main;

import java.util.Scanner;

public class Chap3_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		
		//소문자 문자열을 아스키코드를 이용해서 대문자로 변환
		String text = scanner.nextLine();
		
		
		for (int i = 0; i < text.length(); i++) {
//			System.out.print(text.charAt(i));
			char c = text.charAt(i); //한 글자씩 출력
			
			//소문자인 경우
			if (c >= 'a' && c <= 'z') { 
				c = (char)(c - 'a' + 'A');
			//대문자인 경우	
			} else if (c >= 'A' && c <= 'Z') {
				c = (char)(c + 'a' - 'A');
			}
		
			System.out.print(c);
		}
		
//		//교수님 버전
//		for (int i = 0; i <text.length(); i++) {
//			int c = (int)text.charAt(i);
//			
//			if (c >= 65 && c <= 65 + 26) {
//				c = c + 32;
//			} else if (c >= 97 && c <= 97 + 26) {
//				c = c - 32;
//			} else if (c == 32) {
//				c = c;
//			} else {
//				System.out.print(c);
//			}
//			
//			System.out.print((char)c);
//		}
		
		
		
		
	}

}
