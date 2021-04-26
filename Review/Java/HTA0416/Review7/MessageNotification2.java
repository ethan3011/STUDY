package HTA0416.Review7;

import java.util.HashMap;

/*MessageNotification2 */
public class MessageNotification2 {
	
	HashMap<String, MessageSender> messageSneders = new HashMap<String, MessageSender>();
	
	
	//MessageNotification2() 생성자
	MessageNotification2(){
		
		//HashMap<String, MessageSender> 객체에 MessageSender 인터페이스를 구현한 객체를 저장
		messageSneders.put("sms", new SmsMessageSender());				// SMS구현객체
		messageSneders.put("katalk", new KakaoTalkMessageSender());		// Katalk구현객체
		messageSneders.put("email", new EmailMessageSender());			// Email구현객체
	}
	
	//notice(customer,from,title,content) 메소드 (for문)
	public void notice(Customer customer, String from, String title, String content) {	// 메소드생성
		String[] messageTypes = customer.getAgreeNotificaitonTypes();					// customer에 회원이 동의한 방식들(배열안에 있는 값들)을 담는 객체를 생성
		for(String item :messageTypes) {												// for문으로 담긴 회원이 동의한 방식들을 item으로 하나씩 호출한다.
			MessageSender sender = messageSneders.get(item);							// 부모클래스 MessageSender타입의 sender 에 구현객체로부터 전달받은 item의 값을 get 메소드로 호출한다.
			sender.sendMessage(from, customer.getName(), title, content);				// 부모클래스 MessageSender타입의 sender 에서 sendMessage메소드를 실행한다.(실제로는 오버라이딩 된 각 구현객체들의 기능들이 실행된다)
		}
	}
}
