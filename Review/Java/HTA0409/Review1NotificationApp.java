 package HTA0409;




/*﻿NotificationApp class*/
public class Review1NotificationApp {
	
	//main
	public static void main(String[] args) {
		
		//xxxNotification객체 생성
		Review1EventNotification event = new Review1EventNotification();
		Review1OrderNotification order = new Review1OrderNotification();
		
		//Mail, Messenger, SNS 구현 객체 생성
		Review1GoogleMail gmail = new Review1GoogleMail();
		Review1KakaoTalk kakao = new Review1KakaoTalk();
		Review1Line line = new Review1Line();
		Review1Instagram insta = new Review1Instagram();
		Review1Facebook facebook = new Review1Facebook();
		
		//EventNotification객체에 Mail, Messenger, SNS 구현객체의 주소값 전달하기
		event.setMail(gmail);
		event.setMessenger(kakao);
		event.setSns(facebook);
		
		//OrderNotification객체에 Mail, Messenger 구현객체의 주소값 전달하기
		order.setMail(gmail);
		order.setMessenger(line);
		
		//이벤트 안내 보내기
		event.notice("구글", "구글회원", "구글을 이용해주셔서 감사합니다.", "구글을 이용해주시는 모든 회원님께 구글드라이브 용량 30GB를 무료로 제공됩니다.");
		
		//주문내역 보내기
		order.NoticeOrderInfo("쿠팡", "구매자", "배송지연을 안내드립니다", "코로나19로 인하여 배송이 지연되고 있습니다. 양해 부탁드립니다.");
		
	}
}
