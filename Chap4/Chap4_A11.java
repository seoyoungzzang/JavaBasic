package Main;

import java.util.Scanner;

public class Chap4_A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int ms = scanner.nextInt();
		int kmh = scanner.nextInt();
		float mms = scanner.nextFloat();

		int nkmh = kmh * 36 / 10;
		Float nmms = mms * 1000;

		//System.out.println(ms + "\n" + nkmh + "\n" + nmms);

		if ((ms > nkmh) && (ms > nmms)) {
			System.out.println(ms + "m/s");
		} else if ((nkmh > ms) && (nkmh > nmms)) {
			System.out.println(kmh + "km/h");
		} else if ((nmms > nkmh) && (nmms > ms)) {
			System.out.println(mms + "m/ms");
		}

	}
}
