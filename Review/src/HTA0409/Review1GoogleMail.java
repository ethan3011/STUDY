package HTA0409;

/*GoogleMail impl Mail class*/
public class Review1GoogleMail implements Review1Mail{

	//sendMail override 매개변수 값 출력
	@Override
	public void sendMail(String from, String to, String title, String text) {
		System.out.println("### 구글 메일로 발송");
		System.out.println("=========================================================");
		System.out.println("보낸사람 : " + from);
		System.out.println("받는사람 : " + to);
		System.out.println("제목 : " + title);
		System.out.println("내용 : " + text);
		System.out.println("=========================================================");
	}
}
