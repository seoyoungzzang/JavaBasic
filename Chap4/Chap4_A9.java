package Main;

import java.util.Scanner;

public class Chap4_A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String time1 = scanner.next();
		String time2 = scanner.next();

		// Integer.parseInt string을 int로 바꿔줌
		int hour1 = Integer.parseInt(time1.substring(0, 2));
		int hour2 = Integer.parseInt(time2.substring(0, 2));

		int min1 = Integer.parseInt(time1.substring(2, 4));
		int min2 = Integer.parseInt(time2.substring(2, 4));

		int sec1 = Integer.parseInt(time1.substring(4, 6));
		int sec2 = Integer.parseInt(time2.substring(4, 6));

		hour1 = hour1 * 60 * 60;
		hour2 = hour2 * 60 * 60;

		min1 = min1 * 60;
		min2 = min2 * 60;

		int diff = 0;
		diff = (hour2 - hour1) + (min2 - min1) + (sec2 - sec1);
		System.out.println(diff + "s");
	}

}
