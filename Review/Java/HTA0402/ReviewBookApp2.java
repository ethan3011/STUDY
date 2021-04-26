package HTA0402;

/*BookApp2 class*/
public class ReviewBookApp2 {
	
	public static void main(String[] args) {
		
		//Book book3 객체 생성
		Review1Book book3 = new Review1Book(200, "김치의 정석", "김치맨", "정석 출판사", 30000, false, 0.015);
		
		//Event event1 객체 생성 (동영상강의 특가)
		Review1Event event1 = new Review1Event("동영상강의 특가", "제작자의 모든 동영상을 시청할수 있습니다.", "8월3일","8월15일", false);
		
		//Event event2 객체 생성 (할인 이벤트)
		Review1Event event2 = new Review1Event("할인 이벤트", "제작자의 모든 동영상을 40% 할인합니다.", "1월16일","1월31일", false);
		
		//Gift gift1 객체 생성
		Review1Gift gift1 = new Review1Gift("책상", 5000);
		
		//Book객체와 Event객체, Book객체와 Gift객체 연결짓기	
		//book3이 참조하는 Book 객체의 event 멤버변수에 event1이 참조하는 Event객체의 주소값을 전달한다.
		book3.setReview1Event(event1);
		//book3이 참조하는 Book 객체의 gift 멤버변수에 gift1이 참조하는 Gift객체의 주소값을 전달한다.
		book3.setReview1Gift(gift1);
		
		//book3이 참조하는 Book객체에 연결된 Event객체의 주소값 조회하기
		Review1Event e = book3.getReview1Event();
		
		//event1, e, book3.getEvent() 주소값이 다 같은지 확인하기
		System.out.println(event1);
		System.out.println(e);
		System.out.println(book3.getReview1Event());
		
		//book3이 참조하는 Book객체에 연결된 Event객체의 정보를 출력하기 (getDescription)
		System.out.println(event1.getDescription());
		System.out.println(e.getDescription());
		System.out.println(book3.getReview1Event().getDescription());
		
		//book3이 참조하는 Book이 할인이벤트 진행중인지 확인해보기
		if(book3.getReview1Event().getTitle().contains("할인")){
			System.out.println("현재 할인 이벤트가 진행중 입니다.");
		}else {
			System.out.println("현재 할인 이벤트가 진행중이 아닙니다.");
		}

	}

}
