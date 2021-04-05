package HTA0329;

/*
Scanner sc = new Scanner(System.in);
String value1 = "홍길동";
System.out.print("이름을 입력하세요 : ");
String value2 = sc.next();
*/
// value1변수의 주소값과 value2변수의 주소값을 비교
// value1변수의 문자열과 value2변수의 문자열을 비교
import java.util.Scanner;

public class Review1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value1 = "홍길동";
		System.out.println("이름을 입력하세요 : ");
		String value2 = sc.nextLine();
		
		System.out.println(value1 == value2);				// 데이터 주소값의 비교이므로 false
		System.out.println(value1.equals(value2));			// eqauls를 사용하여 문자열 안의 값을 비교한다.
		System.out.println(value2.equals(value1));			// String 안의 equals 메소드를 이용하였으므로 true
		sc.close();
	} 

}
