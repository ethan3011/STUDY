package HTA0409;

/*Line impl Messenger class*/
public class Review1Line implements Review1Messenger{

	//send override 매개변수 값 출력
	@Override
	public void send(String to, String from, String text) {
		System.out.println("=========================================================");
		System.out.println("### 라인으로 발송");
		System.out.println("보낸사람  : " + from);
		System.out.println("받는사람  : " + to);
		System.out.println("내용  : " + text);
		System.out.println("=========================================================");
	}
}
