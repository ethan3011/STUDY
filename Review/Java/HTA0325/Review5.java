package HTA0325;
/*
while문을 통한 무한루프
결제, 충전, 종료 서비스 구현하기
코드 작성 후 주석으로 리뷰 해보기 추천! (어떤 식으로 작동되는지..)
*/
import java.util.Scanner;												// Scanner 라는 클래스를 사용하기 위해 호출한다.
public class Review5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);							// 값을 입력받기 위해 scan 라는 객체를 생성한다. 
		int balance = 10000;											// 정수형 변수 balance를 생성후 값을 넣어준다.
				
		while(true) {
			System.out.println("====================");
			System.out.println("원하시는 메뉴를 입력하세요.");
			System.out.println("1.결제 2.충전 0.종료");
			int menuNo = scan.nextInt();								// menuNo로 정수형 변수로 만든후 값을 입력받는다.
			if(menuNo == 1) { 											// menuNo 1번을 입력했을때 실행된다.
				System.out.println("결제하시려는 금액을 입력하세요.");	
				int pay = scan.nextInt();								// 결제할 금액을 입렵받는다.
				if(pay > balance) {										// 입력된 결제금액이 현재잔액보다 클 경우 실행된다.
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 잔액은 " + balance + "원 입니다.");
					System.out.println("정확한 금액을 입력해주세요.");
					System.out.println("초기 메뉴로 다시 되돌아갑니다.");
				}else {													// 입력된 결제금액이 현재잔액보다 작을경우 실행된다.
					balance -= pay;										// 입력된 결제금액을 현재잔액에서 차감한다.
					System.out.println("결제가 완료되었습니다.");
					System.out.println("현재잔액은 " + balance + "원 입니다.");					
				}
			}else if(menuNo == 2) {										//menuNo 2번을 입력했을때 실행된다.
				System.out.println("충전할 금액을 입력하세요.");	
				int topUp = scan.nextInt();								// 충전할금액을 입력받는다.
				balance += topUp;										// 충전할금액을 잔액에 추가한다.
				System.out.println("충전이 완료되었습니다.");
				System.out.println("현재잔액은 " + balance + "원 입니다.");
			}else if(menuNo == 0){										// menuNo 0번을 입력했을때 실행된다.
				System.out.println("이용해주셔서 감사합니다.");
				System.out.println("====================");
				break;													// break 문으로 while무한반복을 멈춘다.
			}else {														// 0, 1, 2 이외의 정수를 입력하게 되면 실행된다.
				System.out.println("[에러] 잘못된 번호를 입력하셨습니다.");
				System.out.println("초기 메뉴로 다시 되돌아갑니다.");			// 0이 입력되지 않았으므로 다시 초기메뉴로 돌아간다.
			}
		}scan.close();
	}
}
