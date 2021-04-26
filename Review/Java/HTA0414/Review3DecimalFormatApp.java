package HTA0414;

import java.text.DecimalFormat;
/*DecimalFormatApp*/
public class Review3DecimalFormatApp {

	public static void main(String[] args) {

		//숫자 3자리마다 ,찍기
		int number = 10000000;
		
		//DecimalFormat 객체 생성 후 아래의 값들 출력하기
		DecimalFormat df = new DecimalFormat("#,###");
		String str1 = df.format(number);
		//결과값 : 10,000,000
		System.out.println("결과값 : " + str1);
		
		//실수 출력하기
		double number2 = 123.456;
		DecimalFormat df2 = new DecimalFormat("0.00");
		String str2 = df2.format(number2);
		//결과값 : 123.46 (3번째 자리에서 반올림되어 값출력됨)
		System.out.println("결과값 : " + str2);
		
		DecimalFormat df3 = new DecimalFormat("0.0000");
		String str3 = df3.format(number2);
		//결과값 : 123.4560
		System.out.println("결과값 : " + str3);

		double value = 1.0/3.0;
		DecimalFormat df4 = new DecimalFormat("#.##");
		String str4 = df4.format(value);
		//결과값 : 0.33
		System.out.println("결과값 : " + str4);
	}
}