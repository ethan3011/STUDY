package HTA0414;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/*DateFormatApp*/
public class Review3DateFormatApp {

	public static void main(String[] args) {

		Date today = new Date();
		System.out.println("날짜 시간정보 : " + today);
		
		//SimpleDateFormat 객체 생성으로 아래의 값들 출력하기
		//2021-04-14
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("출력하기 : " + sf.format(today));
		
		//2021년 4월 14일 수요일
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy년 M월 dd일 EEEE");
		System.out.println("출력하기 : " + sf2.format(today));
		
		//hh(시):mm(분):ss(초)
		SimpleDateFormat sf3 = new SimpleDateFormat("hh:mm:ss");
		System.out.println("출력하기 : " + sf3.format(today));
		
		//(오전/오후) hh시 mm분 ss초
		SimpleDateFormat sf4 = new SimpleDateFormat("a hh시 mm분 ss초");
		System.out.println("출력하기 : " + sf4.format(today));
		
		//(AM/PM) hh:mm:ss
		SimpleDateFormat sf5 = new SimpleDateFormat("a hh:mm:ss",Locale.US);
		System.out.println("출력하기 : " + sf5.format(today));
	}
}