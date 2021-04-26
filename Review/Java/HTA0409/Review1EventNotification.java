 package HTA0409;

/*EventNotification class*/

public class Review1EventNotification {
	
	//EventNotification객체가 의존하는 객체의 주소값을 저장할 참조변수 정의(Mail,Messenger,SNS)
	private Review1Messenger messenger;
	private Review1Mail mail;
	private Review1SNS sns;

	//setter 메소드 정의
	
	public void setMessenger(Review1Messenger messenger) {
		this.messenger = messenger;
	}
	public void setMail(Review1Mail mail) {
		this.mail = mail;
	}
	public void setSns(Review1SNS sns) {
		this.sns = sns;
	}
	
	//notice 메소드 매개변수(from,to,title,content)
	public void notice(String from, String to, String title, String content) {
		messenger.send(to, from, content);
		mail.sendMail(from, to, title, content);
		sns.post(title, from, content);
	}
}
