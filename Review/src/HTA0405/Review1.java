package HTA0405;
import HTA0402.*;
//BookApp3 class
//1. 지난번에 했던 Book, Event, Gift class 파일에 이어서

public class Review1 {
	
	public static void main(String[] args) {
		//books 객체 배열 생성(3)
		Review1Book[] books = new Review1Book[3];
		
		//event1 객체 생성 
		Review1Event event1 = new Review1Event("신규가입 이벤트", "신규 가입 고객은 14일간 30% 할인된 가격으로 구매할 수 있습니다.",
												"4월1일", "4월15일", false);
		
		//event2 객체 생성
		Review1Event event2 = new Review1Event("재구매 고객 이벤트", "재구매 고객은 14일간 50% 할인된 가격으로 구매할 수 있습니다.",
												"5월15일", "5월31일",false);
		
		//gift1 객체 생성
		Review1Gift gift1 = new Review1Gift("책꽃이",10000);

		//event1과 gift1이 각각 참조하는 Event 객체와 Gift객체의 주소값을 생성자의 매개변수로 전달
		Review1Book book1 = new Review1Book(100,"김치의 정석","김치맨","정석 출판사",35000,false,0.01,event1,gift1);
	
		//event2가 참조하는 Event객체의 주소값과, 객체를 직접 생성해서 그 객체의 주소값이 생성자의 매개변수로 전달
		Review1Book book2 = new Review1Book(120,"라면의 정석","라면왕","정석 출판사",30000,false,0.03,event2,new Review1Gift("등받이",5000));
		
		//book3가 참조하는 Book객체에 정의된 setter메소드에 직접 생성한 Event객체와 Gift객체의 주소값을 메소드의 매개변수로 전달
		Review1Book book3 = new Review1Book(180, "피자의 정석", "피자킹", "정석 출판사", 27000, false, 0.08);
		book3.setReview1Event(new Review1Event("무료 대여 이벤트", "3년이상 구매해주신 회원님은 책을 1주일간 비용없이 대여할수 있습니다.",
								"6월11일", "6월30일", false));
		book3.setReview1Gift(new Review1Gift("방석", 5000));
				
		//books 참조변수가 참조하는 배열객체의 각각의 칸에 순서대로 위에서 생성한 Book객체의 주소값을 저장하기
		
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;

		//books배열에 저장된 모든 Book객체의 책정보, 해당 이벤트 정보, 사은품정보 출력하기
		for(Review1Book book:books) {
			System.out.println("책 번호 : "+ book.getNo());
			System.out.println("책 이름 : "+ book.getTitle());
			System.out.println("책 저자 : "+ book.getWriter());
			System.out.println("책 출판사 : "+ book.getPublisher());
			System.out.println("책 가격 : "+ book.getPrice());
			System.out.println("책 매진여부 : "+ book.isSoldOut());
			System.out.println("책 할인 : "+ book.getDiscountRate());
			System.out.println("책 이벤트제목 : "+ book.getReview1Event().getTitle());
			System.out.println("책 이벤트설명 : "+ book.getReview1Event().getDescription());
			System.out.println("책 이벤트시작날짜 : "+ book.getReview1Event().getStartDate());
			System.out.println("책 이벤트종료날짜 : "+ book.getReview1Event().getEndDate());
			System.out.println("책 이벤트종료여부 : "+ book.getReview1Event().isClosed());
			System.out.println("책 증정품 : "+ book.getReview1Gift().getName());
			System.out.println("책 증정품가격 : "+ book.getReview1Gift().getPrice());
			System.out.println("==========================================================");
		}
	}
}
