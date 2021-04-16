package HTA0416.Review7;

/*Customer*/
public class Customer {
	
	private String name;		//고객명
	private String[] agreeNotificaitonTypes;	//메세지수신동의 종류, "sms", "katalk", "email"
	
	//기본생성자
	public Customer() {}

	//기본생성자 초기화
	public Customer(String name, String[] agreeNotificaitonTypes) {
		super();
		this.name = name;
		this.agreeNotificaitonTypes = agreeNotificaitonTypes;
	}
	
	//getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAgreeNotificaitonTypes() {
		return agreeNotificaitonTypes;
	}

	public void setAgreeNotificaitonTypes(String[] agreeNotificaitonTypes) {
		this.agreeNotificaitonTypes = agreeNotificaitonTypes;
	}
}
