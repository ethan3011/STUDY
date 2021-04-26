package HTA0405;

/*Phone class*/
public class Review2Phone {
	

	private String tel;
	
	//getter,setter 생성
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

		//call 메소드 생성 (지정된 번호[tel]로 전화를 겁니다.)
	public void call() {
		System.out.println("지정된 번호["+tel+"]로 전화를 겁니다.");
	}
		//receive 메소드 생성 (전화를 받습니다.)
	public void receive() {
		System.out.println("전화를 받습니다.");
	}
}
