package HTA0324;
/*
 * 고객명, 고객등급, 총구매금액을 입력받는다.
 * 고객명, 고객등급, 총구매금액, 적립포인트, 보너스포인트를 출력한다.
 * 
 * 등급별 적립포인트는 1등급은 5%, 2등급은 3%, 3등급은 1%다.
 * 보너스포인트 지급기준 
 *       1등급은 300만원 초과한 부분에 대해서 10% 추가포인트 지급
 *       2등급은 150만원 초과한 부분에 대해서 5% 추가포인트 지급
 *       3등급은 100만원 초과한 부분에 대해서 3% 추가포인트 지급  
 */
import java.util.Scanner;
public class Review7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("고객명을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("고객등급을 입력하세요.");
		int level = scan.nextInt();
		System.out.println("총구매금액을 입력하세요.");
		int totalPrice = scan.nextInt();
		
		int savePoint = 0;
		int bonusPoint = 0;
		
		if(level == 1) {
			if(totalPrice > 3000000) {
				bonusPoint = (int)((totalPrice - 3000000)*0.1);
				savePoint = bonusPoint + (int)(3000000 * 0.05);
			}else {
				savePoint = (int)(totalPrice * 0.05);
			}
		}if(level ==2) {
			if(totalPrice > 1500000) {
				bonusPoint = (int)((totalPrice - 1500000)*0.05);
				savePoint = bonusPoint + (int)(1500000 * 0.03);
			}else {
				savePoint = (int)(totalPrice * 0.03);
			}
			
		}if(level ==3) {
			if(totalPrice > 1000000) {
				bonusPoint = (int)((totalPrice - 1000000)*0.03);
				savePoint = bonusPoint + (int)(1000000 * 0.01);
			}else {
				savePoint = (int)(totalPrice * 0.01);
			}
		}
		
		System.out.println("고객명 : " + name);
		System.out.println("고객등급 : " + level);
		System.out.println("총구매금액 : " + totalPrice);
		System.out.println("적립포인트 : " + savePoint);
		System.out.println("보너스포인트 : " + bonusPoint);
		scan.close();
		
	}
}
