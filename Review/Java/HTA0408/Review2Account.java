package HTA0408;
/*Account class*/

public class Review2Account {

	//private name, balance, password 멤버변수 생성
	private String name;
	private long balance;
	private String password;
	
	
	//기본생성자
	Review2Account(){}
	
	//전부 초기화하는 생성자
	Review2Account(String name, long balance, String password){
		this.name = name;
		this.balance = balance;
		this.password = password;
	}
	
	//getter,setter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
