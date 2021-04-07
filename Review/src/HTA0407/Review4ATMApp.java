package HTA0407;

import java.util.Scanner;
public class Review4ATMApp {
	
	public static void main(String[] args) {
		final int DEPOSIT = 1;
		final int TRANSFER = 2;
		final int EXIT = 0;
		
	
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		//ATM 객체생성
		Review4ATM atm = new Review4ATM();
		
		//Deposit 객체생성
		Review4Deposit deposit = new Review4Deposit();
		
		//Transfer 객체생성
		Review4Transfer transfer = new Review4Transfer();
		
		//1.입금 2.이체 3.종료 while문 생성
		while(true) {
			System.out.println("=================================================================");
			System.out.println("### 메뉴를 선택하세요 ###");
			System.out.println("1.입금    2.이체    0.종료");
			System.out.println("=================================================================");
			
			//메뉴번호 입력받기
			int menuNo = sc.nextInt();
			
			//메뉴번호에 따라 출력하기
			if(menuNo == DEPOSIT) {
				//입금작업
				atm.setAbstractBanking(deposit);
				atm.playProgram();
				
			}else if(menuNo == TRANSFER) {
				//이체작업
				atm.setAbstractBanking(transfer);
				atm.playProgram();
				
			}else if(menuNo == EXIT) {
				//종료
				System.out.println("[종료]");
				break;
			}
		}sc.close();
	}
}
