/*
 * 내포된 if문 사용하기
 * 고객명, 고객등급, 총구매금액을 입력받는다.
 * 고객등급이 1등급인 경우, 총구매금액의 3%를 적립포인트를 지급한다.
 * 	단, 총구매금액이 100만원을 초과하는 경우, 
 * 	100만원을 제외한 나머지 금액에 대해서는 5%를 적립한다.
 * 그 외는 총구매금액에 관계없이 총구매금액의 1%를 적립포인트로 지급한다.
 * 
 * 고객명, 고객등급, 총구매금액, 적립포인트를 출력한다.
 * 
 */
import java.util.Scanner;
public class Review5 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("고객명을 입력하세요.");
	String name = scan.nextLine();
	System.out.println("고객등급을 입력하세요.");
	int level = scan.nextInt();
	System.out.println("총구매금액을 입력하세요.");
	
	int totalPrice = scan.nextInt();
	int savePoint = 0;
	
	if(level == 1) {
		if(totalPrice > 1000000) {
			savePoint = (int)((totalPrice - 1000000)* 0.05) + 30000;
		}else savePoint = (int)(totalPrice * 0.03);
	}else savePoint = (int)(totalPrice * 0.01);
	
	System.out.println("고객명 : " + name);
	System.out.println("고객등급 : " + level);
	System.out.println("총구매금액 : " + totalPrice);
	System.out.println("적립포인트 : " + savePoint);
	scan.close();
	
	}
}
