package HTA0329;

//필드 정의하기(제목, 저자, 출판사, 가격)
//메소드 정의하기
class Book{														// Book 이라는 Class를 생성한다.
	String Name;												// name 이라는 String 타입의 변수를 생성한다.
	String Writer;												// Writer 라는 String 타입의 변수를 생성한다. 
	String Publisher;											// Publisher 라는 String 타입의 변수를 생성한다.
	int Price;													// Price 라는 int 타입의 변수를 생성한다.
	
	void infoOfBook(){											// viewOfBooks 라는 메소드를 생성한다.
	System.out.println("제목 : " + Name);							// 제목 + name의 값을 출력한다.
	System.out.println("저자 : " + Writer);						// 저자 + writer의 값을 출력한다.
	System.out.println("출판사 : " + Publisher);					// 출판사 + Publisher의 값을 출력한다.
	System.out.println("가격 : " + Price);						// 가격 + Price의 값을 출력한다.
	}
}

//book1, book2, book3 객체 생성하기
public class Review3 {
	public static void main(String[] args) {
		Book book1 = new Book();								// Book1 객체를 생성후 Book의 주소가 대입된다.
		Book book2 = new Book();								// Book2 객체를 생성후 Book의 주소가 대입된다.
		Book book3 = new Book();								// Book3 객체를 생성후 Book의 주소가 대입된다.
		
//book1, book2, book3 객체의 속성에 값 저장하기
		book1.Name = "치킨은 언제나 옳다";							// book1.name 에 값을 대입한다.
		book1.Writer = "치맥";									// book1.Writer 에 값을 대입한다.
		book1.Publisher = "The cihcken is always right";		// book1.Publisher 에 값을 대입한다.
		book1.Price = 15000;									// book1.Price 에 값을 대입한다.
		
		book2.Name = "피자가 맛있는 이유";							// 위와같음.
		book2.Writer = "Ethan";
		book2.Publisher = "howpossible";
		book2.Price = 18000;
		
		book3.Name = "라면의 정석";
		book3.Writer = "doyouwannaeat";
		book3.Publisher = "정석출판사";
		book3.Price = 9000;
		
		//객체의 기능(Method) 사용하기
		System.out.println("### 책 안내 ###");
		book1.infoOfBook();										// book1의 infoOfBook 의 메소드를 실행한다.
		System.out.println("=====================");
		book2.infoOfBook();										// book2의 infoOfBook 의 메소드를 실행한다.
		System.out.println("=====================");
		book3.infoOfBook();										// book3의 infoOfBook 의 메소드를 실행한다.
		System.out.println("=====================");

	}
}
