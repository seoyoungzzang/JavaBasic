package Main;

import java.util.LinkedList;
import java.util.Queue;

public class Chap5_P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> name = new LinkedList<String>();
		name.offer("kim");
		//kim 출력
		System.out.println(name);
		name.offer("lee");
		//kim에 lee 추가해서 출력
		System.out.println(name);
		//먼저 빠지는 것이 무엇인지 출력
		System.out.println(name.poll());
		//그 다음 빠지는 것이 무엇인지 출력
		System.out.println(name.poll());
		//빈 공간 출력, 남은 것이 없으니까
		System.out.println(name);
	}

}
