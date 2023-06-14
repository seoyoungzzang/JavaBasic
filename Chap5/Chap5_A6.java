package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap5_A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> fibo = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();

		for (int i = 0; i < inputNum; i++) {
			if (i == 0) {
				fibo.add(0);
			} else if (i == 1) {
				fibo.add(1);
			} else
				fibo.add(fibo.get(i - 2) + fibo.get(i - 1));
		}
		System.out.println(fibo);
	}

}
