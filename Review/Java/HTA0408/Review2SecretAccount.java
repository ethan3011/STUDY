package HTA0408;

/*SecretAccount class - Account 상속 UnCopiable impl */
public class Review2SecretAccount extends Review2Account implements Review2UnCopiable{
	
	//private secretKey 생성
	private int secretKey;
	
	//기본생성자
	Review2SecretAccount(){}
	//전부초기화하는 생성자 + 멤버변수 추가
	Review2SecretAccount(String name, long balance, String password, int secretKey){
		super(name,balance,password);
		this.secretKey = secretKey;
	}
	//getter,setter 생성
	public int getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(int secretKey) {
		this.secretKey = secretKey;
	}
}
