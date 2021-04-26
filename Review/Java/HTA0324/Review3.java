package HTA0324;
/*
 * 3. Scanner / 논리연산자,비교연산자 
 * 고객이름, 고객등급(1,2,3 중 하나다), 누적구매횟수, 당일총구매금액을 입력받는다.
 * 고객이름, 고객등급, 누적구매횟수, 당일총구매금액, 적립포인트, 사은품지급여부를 출력한다.
 * 적립포인트는 1등급고객의 경우 당일구매금액의 3%고, 나머지는 1%다.
 * 사은품지급여부는 등급이 1등급이거나, 누적구매횟수가 5회이상이거나, 당일총구매금액이 30만원이상이면
 * 사은품 지급 대상이다.(사은품 지급 여부는 "지급대상임", "지급대상이아님"으로 출력한다.)
 * 
 * 적립포인트와 사은품지급여부를 계산할 때는 조건식 ? 값1 : 값2;
 * 조건 연산자의 조건식은 true/false가 최종연산결과로 나오는 비교연산자, 논리연산자를 사용한다.
 */
import java.util.Scanner;
public class Review3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("고객이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("고객등급을 입력하세요.");
		int level = scan.nextInt();
		System.out.println("누적구매횟수를 입력하세요.");
		int boughtTillNow = scan.nextInt();
		System.out.println("당일총구매금액을 입력하세요.");
		
		int boughtToday = scan.nextInt();
		int savePoint = (int)(level==1 ? boughtToday*0.03 : boughtToday*0.01);
		String reward = level ==1 || boughtTillNow >= 5 || boughtToday >= 300000 ? "지급대상임" : "지급대상이아님";
		
		System.out.println("고객이름 : " + name);
		System.out.println("고객등급 : " + level);
		System.out.println("누적구매횟수 : " + boughtTillNow);
		System.out.println("당일총구매금액 : " + boughtToday);
		System.out.println("적립포인트 : " + savePoint);
		System.out.println("사은품지급여부 : " + reward);
		scan.close();
		
	}
}
