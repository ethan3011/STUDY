package HYA0330;

/*Banking class 생성*/
class Banking{
	
	Account[] accounts = new Account[5];
	int count = 0;
	//신규계좌 개설(등록) 기능
	void createAccount(int accNo, String accName, long accBalance, int accPWD) {
		Account newMember = new Account();

			System.out.println("### 아래와 같은 정보로 신규 계좌가 개설되었습니다.");
			System.out.println("계좌번호 : " + accNo);
			System.out.println("예금주 : " + accName);
			System.out.println("현재잔액 : " + accBalance);
			System.out.println("비밀번호 : " + accPWD);
			System.out.println("### 가입을 축하드립니다 !");
			System.out.println("================================================");
			Account account = new Account();
		
		    account.no = accNo;
			account.name = accName;
			account.balance = accBalance;
			account.Password = accPWD;
			
			
			newMember.no = account.no;
			newMember.name = account.name;
			newMember.balance = account.balance;
			newMember.Password = account.Password;
			accounts[count] = account;
			count++;
	}
	
	//계좌정보 조회 기능
	Account checkAccount(int accNumber, int accPWD) {
		Account searchAccount = null;
		
		for(Account checkAcc: accounts) {
			if(checkAcc.no == accNumber && checkAcc.Password == accPWD) {
				searchAccount = checkAcc;
				break;
			}
		}return searchAccount;
	}
	
	// 적금 기능
	void Deposit(int accNo, int accPWD, int amountDP) {
		for(Account DP : accounts) {
			if(DP.no == accNo && DP.Password == accPWD) {
				DP.balance += amountDP;
				System.out.println("이번달 적금 저축액은 : " + amountDP + " 입니다.");
				System.out.println("현재 잔액은 : " + DP.balance + " 입니다");
				break;
			}
		}
	}
	
	// 이체 기능 ( Accounts 안에 들어있는 계좌중에 )
	void Transfer(int accNumber, int accPWD, int tfAmount, int otherPartyAccNumber) {
		Account trasnfer = new Account();
		for(Account tf : accounts) {
			if(tf.no == accNumber && tf.Password == accPWD) {
				System.out.println("이체가 성공적으로 완료되었습니다.");
				tf.balance -= tfAmount;
				otherPartyAccNumber += tfAmount;
				System.out.println("이체금액 : " + tfAmount + " 원이 차감되어 현재 잔액은 : " + tf.balance + " 입니다.");
				break;
			}
		}
	}

	// 해지금액 조회기능
	int closeAccount(int accNo, int accPWD) {
		int canGetAmount = 0;
		for(Account NB : accounts) {
			if(NB.no == accNo && NB.Password == accPWD) {
				canGetAmount = (int) (NB.balance -10000);
				break;
			}
		}return canGetAmount;
	}
	
	// 비밀번호 변경기능
	void changePassword(int accNo, int oldPWD, int newPWD) {
		for(Account changePWD : accounts) {
			if(changePWD.no == accNo && changePWD.Password == oldPWD) {
				System.out.println("변경이 완료되었습니다. 변경된 비밀번호는 " + newPWD + " 입니다.");
				break;
			}
		}
	}	
}