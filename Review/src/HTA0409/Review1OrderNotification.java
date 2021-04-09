 package HTA0409;

/*OrderNotification  class*/
public class Review1OrderNotification {
	
	//OrderNotification객체가 의존하는 객체의 주소값을 저장할 참조변수 정의(Mail,Messenger)
	private Review1Mail mail;
	private Review1Messenger messenger;
	
	//setter 메소드 정의
	public void setMail(Review1Mail mail) {
		this.mail = mail;
	}
	
	public void setMessenger(Review1Messenger messenger) {
		this.messenger = messenger;
	}
	
	//noticeOrderInfo 메소드 매개변수(from,to,title,content)
	public void NoticeOrderInfo(String from, String to, String title, String content) {
		mail.sendMail(from, to, title, content);
		messenger.send(to, from, content);
	}
}
