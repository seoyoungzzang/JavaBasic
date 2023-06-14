package Main;

public class Chap3_P10_StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello,hi,"; //String으로 text 변수에 헬로,하이, 입력
		System.out.println(text);
		System.out.println(text.length()); //text의 길이 출력
		System.out.println(text.charAt(2)); //text의 3번째 글자 출력, 0부터 시작
		
		char[] c = text.toCharArray(); //text를 배열에 입력
		System.out.println(c[0]); //0번째 글자 출력
		
		System.out.println(text.replace("H", "h")); //H를 h로 변환
		
		String[] t = text.split(","); //text를 ,를 기준으로 나누고 배열에 저장
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
	}

}

/*오류가 발생하는 이유 : t[2]는 없어서*/