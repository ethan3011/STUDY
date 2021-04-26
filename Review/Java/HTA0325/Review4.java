package HTA0325;
//while문을 이용해서 무한반복 구현하기
/* 
충전금액 설정
사용금액이 남아있는 충전금액보다 크면, 잔액부족을 표시한다.
사용금액이 남아있는 충전금액보다 작거나 같으면 충전금액에서 사용금액만큼 차감하고,
사용금액과 현재 남아있는 충전금액을 출력한다.
*/
import java.util.Scanner;
public class Review4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int balance = 10000;
		
		while(true) {
			System.out.println("사용금액을 입력하세요.");
			System.out.println("============================");
			int amount = scan.nextInt();
			if(balance < amount) {
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재 잔액은 " + balance + "원 입니다.");
			}else {
				System.out.println("결제를 진행합니다.");
				balance -= amount;
				System.out.println("결제가 완료되었습니다.");
				System.out.println("남은 금액은 " + balance + "원 입니다.");
			}
		}
	}
}
