package HTA0402;

/*BookApp class*/
//book1.no = 100;
//book1.title = "이것이 자바다";
//book1.writer ="신용권";
//book1.publisher = "한빛미디어";
//book1.price = 35000;
//book1.isSoldOut = false;
//book1.discountRate = 0.15;

public class Review1BookApp {
	
	public static void main(String[] args) {
		
		//객체 생성하기 - 기본 생성자 메소드 호출
		Review1Book book0 = new Review1Book();
		
		//Setter 메소드를 사용해서 멤버변수 초기화하기
		book0.setNo(100);
		book0.setTitle("이것이 자바다");
		book0.setWriter("신용권");
		book0.setPublisher("한빛미디어");
		book0.setPrice(35000);
		book0.setSoldOut(false);
		book0.setDiscountRate(0.15);
		
		//생성자를 이용한 멤버변수 초기화
		Review1Book book1 = new Review1Book(300, "라면의 정석", "라면왕", "라면미디어", 10000, false, 0.03);
		
		//Getter 메소드를 이용한 멤버변수의 값 조회
		System.out.println(" 이름 : " + book0.getNo());
		System.out.println(" 제목 : " + book0.getTitle());
		System.out.println(" 저자 : " + book0.getWriter());
		System.out.println(" 출판사 : " + book0.getPublisher());
		System.out.println(" 가격 : " + book0.getPrice());
		System.out.println(" 매진여부 : " + book0.isSoldOut());
		System.out.println(" 할인률 : " + book0.getDiscountRate());
		System.out.println(" 이벤트 : " + book0.getReview1Event());
		System.out.println(" 증정품 : " + book0.getReview1Gift());
		System.out.println("============================================");
		
		System.out.println(" 이름 : " + book1.getNo());
		System.out.println(" 제목 : " + book1.getTitle());
		System.out.println(" 저자 : " + book1.getWriter());
		System.out.println(" 출판사 : " + book1.getPublisher());
		System.out.println(" 가격 : " + book1.getPrice());
		System.out.println(" 매진여부 : " + book1.isSoldOut());
		System.out.println(" 할인률 : " + book1.getDiscountRate());
		System.out.println(" 이벤트 : " + book1.getReview1Event());
		System.out.println(" 증정품 : " + book1.getReview1Gift());
	}
}
