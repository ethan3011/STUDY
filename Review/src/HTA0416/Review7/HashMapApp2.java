package HTA0416.Review7;

/*HashMapApp2 */
public class HashMapApp2 {
	
	public static void main(String[] args) {
		
	//MessageNotification1 객체생성
		MessageNotification1 noti1 = new MessageNotification1();
		
	//Customer c1,c2,c3 객체 생성
		Customer c1 = new Customer("이순신", new String[] {"sms", "katalk"});
		Customer c2 = new Customer("강감찬", new String[] {"email"});
		Customer c3 = new Customer("류관순", new String[] {"sms", "email", "katalk"});
		
	//출력
		noti1.notice(c1, "진라면", "진라면 무료 10박스 증정", "이번달 VIP회원님께 무료로 진라면 5박스를 지급해드립니다.");
		noti1.notice(c2, "김치라면", "김치라면 무료 10박스 증정", "이번달 VIP회원님께 무료로 김치라면 7박스를 지급해드립니다.");
		noti1.notice(c3, "삼양라면", "삼양라면 무료 10박스 증정", "이번달 VIP회원님께 무료로 삼양라면 10박스를 지급해드립니다.");
	}
}
