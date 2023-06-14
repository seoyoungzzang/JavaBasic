package Main;

import java.util.Calendar;

public class Chap3_P5_DateAndTimeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime()); //현재 시간 표시
		System.out.println(calendar.get(Calendar.YEAR)); //현재 연도
		System.out.println(calendar.get(Calendar.YEAR)+1); //현재 연도+1
		System.out.println(calendar.get(Calendar.MONTH)); //전월 (자바는 율리우스력을 따라서 첫 달은 0으로 출력된다.)
		System.out.println(calendar.get(Calendar.MONTH)+1); //현재 월
		System.out.println(calendar.get(Calendar.DATE)); //현재 일
		System.out.println(calendar.get(Calendar.DATE)-7); //현재 일 -7
		System.out.println(calendar.get(Calendar.HOUR));
	}

}
