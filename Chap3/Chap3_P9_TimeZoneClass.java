package Main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Chap3_P9_TimeZoneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone time; //TimeZone 클래스의 인스턴스를 참조하기 위한 변수 선언/time은 TimeZone 클래스의 객체를 참조하기 위한 참조변수 
		Date date = new Date(); //Date 클래스의 새로운 객체를 생성
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z Z");
		
		time = TimeZone.getTimeZone("Asia/Seoul"); //getTimeZone은 특정지역의 시간대를 가져오는 메소드
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
		time = TimeZone.getTimeZone("America/New_York");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
		time = TimeZone.getTimeZone("Hungary/Budapest");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
	}

}


/* System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
1. time.getDisplayName() time 변수 값을 사용해서 해당 시간대의 표시이름을 반환
2. time은 juva.util.TimeZone 클래스의 인스턴스
3. dateFormat.format(date) date 변수 값을 사용해서 dateFormat 객체가 지정한 형식에 따라 날짜와 시간값을 문자로 변환
4. date 는 java.util.Date 클래스의 인스턴스
5. format() 메서드는 해당 날짜와 시간값을 지정된 형식에 맞춰 문자열로 반환 */