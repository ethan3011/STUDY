package HTA0414;

import java.util.Date;
/*DateApp*/
public class Review2DateApp {

	public static void main(String[] args) {
		//자바가 실행되고 있는 시스템의 현재 날짜와 현재 시간정보를 가진 객체가 생성 후 출력
		Date date = new Date();
		
		//유닉스타입값 조회하기(getTime())
		long unixTime = date.getTime();
		System.out.println("유닉스 타임값 : " + unixTime);
		
		//유닉스타임값 조회하기2(currentTimeMillis())
		long unixTime2 = System.currentTimeMillis();
		System.out.println("유닉스 타임값 : " + unixTime2);
	}
}