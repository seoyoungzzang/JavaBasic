package Main;

import java.util.ArrayList;
import java.util.Collections;

public class Chap5_P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("lee");
		name.add("john");

		//name 3개 출력
		System.out.println(name);
		//name 크기 출력
		System.out.println(name.size());
		//name 배열의 2번째 칸 출력
		System.out.println(name.get(2));
		
		//name 배열의 1번째 칸 삭제
		name.remove(1);
		System.out.println(name);
		
		//1을 park으로 바꿈
		name.set(1,  "park");
		System.out.println(name);
		System.out.println(name.size());
		
		//name 배열에 lee 추가
		name.add("lee");
		System.out.println(name);
		
		//name 오름차순
		Collections.sort(name);
		System.out.println(name);
		
		//name 내림차순
		Collections.reverse(name);
		System.out.println(name);
	}

}
