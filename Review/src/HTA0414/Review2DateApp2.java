package HTA0414;

import java.util.Calendar;
import java.util.Date;
/*DateApp2*/
public class Review2DateApp2 {

	public static void main(String[] args) {

		//현재 날짜 및 시간정보를 포함하고 있는 Date객체 생성하기
		Date date = new Date();
		System.out.println("Date객체로 현재 날짜 및 시간정보 : " + date);
		
		//현재 날짜 및 시간정보를 포함하고 있는 Calendar객체 생성하기(getInstance())
		Calendar now = Calendar.getInstance();
		System.out.println("Calendar 객체로 현재 날짜 및 시간정보 : " + now);
		
		//특정 날짜와 시간정보를 포함하는 Calendar객체 생성하기(getInstance()/set())
		Calendar setdate = Calendar.getInstance();
		setdate.set(1994, 1, 1, 10, 20, 50);
		System.out.println("Calendar+set 객체로 특정 날짜와 시간정보 : " + setdate);
		
		//Calendar객체로부터 Date객체 조회하기(getTime())
		Date date2 = setdate.getTime();
		System.out.println("Calendar객체로부터 Date객체 조회 : " + date2);
		
		//Calendar객체로부터 유닉스타임 조회하기(getTimeInMillis())
		long unix = setdate.getTimeInMillis();
		System.out.println("Calendar객체로부터 유닉스타임 조회 : " + unix);
		
		//유닉스타임값으로 Date객체 생성하기
		Date date5 = new Date(unix);
		System.out.println("유닉스타임값으로 Date객체 생성하기 : " + date5);
	}
}