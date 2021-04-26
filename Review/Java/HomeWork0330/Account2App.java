package HomeWork0330;




public class Account2App {
	
	public static void main(String[] args) {
//		 * Account2 객체를 생성한다.
		Account2 account2 = new Account2();
		
//		 * 생성된 Account2 객체의 멤버변수에 예금주, 비밀번호, 잔액정보를 저장한다.
//		 * 생성된 Account2 객체의 계좌정보를 출력기능을 실행해서 화면에 예금주, 잔액을 출력한다.
		account2.createNewmember("김첨지", 123456, 1000000);
		account2.createNewmember("강태공", 234567, 2000000);
		account2.createNewmember("저팔계", 345678, 3000000);
		
//		 * 생성된 Account2 객체의 입금기능을 실행한다.
//		 * 생성된 Account2 객체의 계좌정보 출력기능을 실행해서 화면에 예금주, 잔액을 출력한다.
		System.out.println("===================입금후 잔액===================");
		account2.deposit(111111, "김첨지");
		account2.deposit(222222, "강태공");
		account2.deposit(333333, "저팔계");
		account2.displayInfo();
		
			
		
		// * 생성된 Account2 객체의 출금기능을 실행한다.
		// * 생성된 Account2 객체의 계좌정보 출력기능을 실행해서 화면에 예금주, 잔액을 출력한다.
		System.out.println("===================출금후 잔액 ===================");
		account2.withdraw(555555, "김첨지", 123456);
		account2.withdraw(444444, "강태공", 234567);
		account2.withdraw(888888, "저팔계", 345678);
		account2.displayInfo();
	}
	
	

}
