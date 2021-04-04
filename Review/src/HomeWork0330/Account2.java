package HomeWork0330;

class Account2 {
	Account2[] accs = new Account2[3];
	int count = 0;
	
	/*
	 * Account2.java 클래스는 예금주, 비밀번호, 잔액정보를 저장하는 객체를 위한 클래스다. 해당 정보를 담는 멤버변수를 정의한다.
	 * Account2.java 클래스는 입금기능, 계좌정보 출력기능을 지원하는 객체를 위한 클래스다. 해당 기능이 지원되는 멤버메소드를 정의한다. 
	 * 입금기능 void deposit(long amount) {....} 전달받은 금액만큼 멤버변수의 잔액을 증가시킨다.
	 * 출금기능 void withdraw(long amount, int password) {....} 전달받은 비밀번호와 멤버변수의 비밀번호가 일치하면 전달받는 금액만큼 멤버변수의 잔액을 감소시킨다. 
	 * 계좌정보 출력기능 void displayInfo() {...} 멤버변수에 저장된 예금주, 잔액정보를 화면에 출력한다.
	 * 
	 */
	
	String name;
	int Password;
	int balance;
	
	// 저장기능
	void createNewmember(String accName, int accPWD, int accBalance) {
		System.out.println("### 신규 가입을 축하합니다. ###");
		System.out.println("예금주 : " + accName);
		System.out.println("비밀번호 : " + accPWD);
		System.out.println("잔액정보 : " + accBalance);
		Account2 newMembers = new Account2();
		
		newMembers.name = accName;
		newMembers.Password = accPWD;
		newMembers.balance = accBalance;
		accs[count] = newMembers;
		count++;
	}
	
	//입금기능
	void deposit(long amount, String accName) {
		for(Account2 DP: accs) {
			if(accName.equals(DP.name)) {
				DP.balance += amount;
//				System.out.println("### 입금이 완료되었습니다. ###");
//				System.out.println("입금액 : " + amount );
//				System.out.println("현재 잔액 : " + DP.balance);
			}
		}	
	}
	
	//출금기능
	void withdraw(long amount, String accName, int accPassword) {
		for(Account2 WD : accs) {
			if(accName.equals(WD.name) && accPassword == WD.Password) {
				WD.balance -= amount;
//				System.out.println("### 출금이 완료되었습니다. ###");
//				System.out.println("출금액 : " + amount );
//				System.out.println("현재 잔액 : " + WD.balance);		
			}
		}
	}
	
	//계좌정보 출력기능
	void displayInfo() {
		for(Account2 infos : accs) {
			System.out.println("### 계좌 정보를 출력합니다. ###");
			System.out.println("예금주 : " + infos.name);
			System.out.println("현재잔액 : " + infos.balance);
			System.out.println("================================================");
		}
	}
}
