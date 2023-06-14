package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap6_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		System.out.println("이름을 입력하세요.");
		while (true) {
			String name = scanner.nextLine();
			if (name.equals("exit")) {
				if (names.size() <= 10) {
				} else {
				}
				break;
			}
			names.add(name);
		}
		System.out.println(names);

		System.out.println("점수를 입력하세요.");
		while (true) {
	
			try {
				int score = scanner.nextInt();
				if (score == -1) {
					if (scores.size() <= 10) {
					} else {
					}
					break;
				}
				scores.add(score);
			} catch (InputMismatchException e) {
				System.out.println("Error");
				break;
			}
			System.out.println(scores);

			Collections.sort(names);
			System.out.println("오름차순 : " + names);
			Collections.reverse(names);
			System.out.println("내림차순 : " + names);

			Collections.sort(scores);
			System.out.println("오름차순 : " + scores);
			Collections.reverse(scores);
			System.out.println("내림차순 : " + scores);


		}

	}
}
