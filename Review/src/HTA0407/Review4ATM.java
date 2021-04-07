package HTA0407;

/*ATM class*/
public class Review4ATM {
	
	//AbstractBanking클래스의 구현객체를 참조하는 참조변수
	Review4AbstractBanking abstractBanking;

	//AbstractBanking 하위객체의 주소값을 전달받는 setter 메소드
	public void setAbstractBanking(Review4AbstractBanking abstractBanking) {
		this.abstractBanking = abstractBanking;
	}
	//뱅킹작업을 실행하는 메소드(뱅킹작업과 관련된 일련의 작업들을 순서대로 실행해주는 process()메소드를 실행)
	public void playProgram() {
		abstractBanking.process();
	}
}
