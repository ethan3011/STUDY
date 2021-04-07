package HTA0407;
/*Deposit class - AbstractBanking 상속*/
public class Review4Deposit extends Review4AbstractBanking{
	
	//job override
	@Override
	public void job() {
		//입금액을 입력받는다
		//금액을 확인한다
		//잔액을 증가시킨다
		//입금결과를 표시한다
		System.out.println("입금액을 입력받는다");
		System.out.println("금액을 확인한다");
		System.out.println("잔액을 증가시킨다");
		System.out.println("입금결과를 표시한다");
	}
}
