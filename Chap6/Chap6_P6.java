package Main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Chap6_P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);

		System.out.println(dateAndTime);

		Scanner scanner = new Scanner(System.in);
		int inputTime = scanner.nextInt();

		System.out.println(inputTime);

		try {
			Thread.sleep(1000*inputTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		time = new Date();
		dateAndTime = format.format(time);
		System.out.println("time is over(" + dateAndTime + ")");

	}

}
