package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Chap5_P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] num = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 52, 20 };
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			//비어있는 numbers 배열에 num값들 넣어주기
			numbers.add(num[i]);
		}
		System.out.println("오름차순" + numbers);
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("내림차순" + numbers);
	}
}
