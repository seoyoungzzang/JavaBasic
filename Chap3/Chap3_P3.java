package Main;

import java.util.Scanner;

public class Chap3_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		String text = scanner.nextLine();
		
		//한글자씩 출력
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
//			System.out.print(c);
			
			//c가 한글일때
			if (c >= 0xAC00 && c <= 0xD7AF) {
				//초중종성이 몇번째 문자인지 알아야하기 때문에 0xAC00을 빼줌
				c = (char)(c-0xAC00);
				//초중종성 구하는 수식
				//ㄱ
				char first = (char)((c / 28 / 21) + 0x1100);
				//ㅏ
				char middle = (char)(((c) / 28 % 21) + 0x1161);
				//종성이 없는 경우가 있으므로 1을 뺌
				char end = (char)((c % 28) + (int)0x11A8 - 1);
				
				System.out.print(first);
				System.out.print(middle);
				if (c % 28 != 0) {
					System.out.print(end);
				} 
			//c가 한글이 아닐때	
			} else {
				System.out.println(c);
			}
		}
		
//		String typo = "최서영";
//		
//		// typo스트링의 글자수 만큼 list에 담아둡니다.
//		for (int i = 0; i < typo.length(); i++) {
//			char comVal = (char) (typo.charAt(i)-0xAC00);
//
//			if (comVal >= 0 && comVal <= 11172){
//				// 한글일경우 
//				
//					// 초성만 입력 했을 시엔 초성은 무시해서 List에 추가합니다.
//					char uniVal = (char)comVal;
//
//					// 유니코드 표에 맞추어 초성 중성 종성을 분리합니다..
//					char cho = (char) ((((uniVal - (uniVal % 28)) / 28) / 21) + 0x1100);
//					char jung = (char) ((((uniVal - (uniVal % 28)) / 28) % 21) + 0x1161);
//					char jong = (char) ((uniVal % 28) + 0x11a7);
//
//					if(cho!=4519){
//						System.out.print(cho+" ");
//					}
//					if(jung!=4519){
//						System.out.print(jung+" ");
//					}
//					if(jong!=4519){
//						System.out.print(jong+" ");
//					}
//					System.out.println((int)cho);
//			} else {
//				// 한글이 아닐경우
//				comVal = (char) (comVal+0xAC00);
//				System.out.print(comVal+" ");
//			}
//		}
//	
//		for (cho = 4352; cho <= 4370; cho++) {
//			System.out.print(cho);
//			System.out.println((int)cho);
//		}
		
		
	}

}
