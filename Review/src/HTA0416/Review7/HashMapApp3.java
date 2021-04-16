package HTA0416.Review7;

/*HashMapApp3 */
public class HashMapApp3 {
	
	public static void main(String[] args) {
		// noti의 notice메소드를 사용하기 위하여 객체를 생성한다.
		MessageNotification2 noti = new MessageNotification2();
		
		
		//Customer c1,c2,c3 객체 생성
		Customer c1 = new Customer("이진숙", new String[] {"sms", "katalk"});
		Customer c2 = new Customer("김남봉", new String[] {"email"});
		Customer c3 = new Customer("정찬식", new String[] {"sms", "email", "katalk"});
		
		//출력
		noti.notice(c1, "훌랄라바베큐", "모든 바베큐 포장할인 50% 이벤트", "이벤트 기간 내 방문후 포장해서 사시면 50%를 할인된 가격에 드립니다.");
		noti.notice(c2, "또레오레", "모든 양념치킨 포장할인 30% 이벤트", "이벤트 기간 내 방문후 포장해서 사시면 30%를 할인된 가격에 드립니다.");
		noti.notice(c3, "순살두마리치킨", "모든 순살치킨 포장할인 10% 이벤트", "이벤트 기간 내 방문후 포장해서 사시면 10%를 할인된 가격에 드립니다.");
	}
}
