package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Chap3_P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		
		Scanner scanner = new Scanner (System.in);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		
		String A = scanner.nextLine();
		String B = scanner.nextLine();

		try {
			Date date1 = dateFormat.parse(A);
			Date date2 = dateFormat.parse(B);
			long diff = date2.getTime() - date1.getTime();
			System.out.println(diff/1000/60/60/24 - 1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}

}
