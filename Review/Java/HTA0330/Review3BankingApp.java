package HTA0330;

/*BankingApp class 생성*/ 
public class Review3BankingApp {
	public static void main(String[] args) {
		Banking banking = new Banking();
		//신규계좌 등록해보기
		//번호, 예금주, 최초잔액, 비밀번호를 입력받아서 Banking객체의 신규계좌 개설기능에 전달한다.
		banking.createAccount(100, "김치왕", 50000, 1234);
		banking.createAccount(120, "피자왕", 150000, 2345);
		banking.createAccount(150, "치킨왕", 250000, 3456);
		banking.createAccount(180, "보쌈왕", 350000, 4567);
		banking.createAccount(200, "짜장왕", 450000, 5678);
		System.out.println("================================================");
		
		//계좌조회
		Account result1 = banking.checkAccount(100, 1234);
		if(result1 != null) {
			System.out.println("계좌번호 : " + result1.no);
			System.out.println("예금주 : " + result1.name);
			System.out.println("현재잔액 : " + result1.balance);
			System.out.println("비밀번호 : " + result1.Password);
			System.out.println("이율 : " + result1.interestRate);
		}else {
			System.out.println("잘못된 계좌번호/비밀번호 를 입력하였습니다. 다시 확인후 시도해 주세요");
		}
		
		System.out.println("================================================");
		Account result2 = banking.checkAccount(120, 1515);
		if(result2 != null) {
			System.out.println("계좌번호 : " + result2.no);
			System.out.println("예금주 : " + result2.name);
			System.out.println("현재잔액 : " + result2.balance);
			System.out.println("비밀번호 : " + result2.Password);
			System.out.println("이율 : " + result2.interestRate);
		}else {
			System.out.println("잘못된 계좌번호/비밀번호 를 입력하였습니다. 다시 확인후 시도해 주세요");
		}
		
		System.out.println("================================================");
		Account result3 = banking.checkAccount(200, 5678);
		if(result3 != null) {
			System.out.println("계좌번호 : " + result3.no);
			System.out.println("예금주 : " + result3.name);
			System.out.println("현재잔액 : " + result3.balance);
			System.out.println("비밀번호 : " + result3.Password);
			System.out.println("이율 : " + result3.interestRate);
		}else {
			System.out.println("잘못된 계좌번호/비밀번호 를 입력하였습니다. 다시 확인후 시도해 주세요");
		}
		System.out.println("================================================");
		
		// 적금
		banking.Deposit(150, 3456, 80000);
		System.out.println("================================================");
		
		// 이체
		banking.Transfer(150, 3456, 5000, 200);
		System.out.println("================================================");
		
		// 해지금액조회
		int close1 = banking.closeAccount(180, 4567);
		if(close1 != 0) {
			System.out.println("해지패널티는 -10000 원 입니다.");
			System.out.println("현재 해지시 " + close1 + " 원을 돌려받을수 있습니다.");
		}else {
			System.out.println("잘못된 계좌번호/비밀번호 를 입력하였습니다. 다시 확인후 시도해 주세요");
		}
		System.out.println("================================================");
		
		// 비밀번호 변경기능
		banking.changePassword(100, 1234, 1515);
	}
}
