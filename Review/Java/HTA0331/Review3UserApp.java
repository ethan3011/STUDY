package HTA0331;

//UserApp class 생성
public class Review3UserApp {
	
	public static void main(String[] args) {
		
		//User1 객체 생성
		//정보값출력메소드 실행
		Review3User User1 = new Review3User();
		User1.viewInfo();
		System.out.println("==================================================");
		
		//User2객체 생성
		//기본생성자에 값 추가 후 정보값출력
		Review3User User2 = new Review3User();
		User2.no = 77777;
		User2.name = "치킨왕";
		User2.username = "chicken1004";
		User2.password = "!@#Chicken#@!";
		User2.email = "angsarap@masrap.com";
		User2.age = 77777;
		User2.address = "치킨시 치킨구 치킨로 치킨아파트 치킨동 치킨호";
		User2.isMarried = false;
		User2.viewInfo();
		System.out.println("==================================================");

		//User3객체 생성
		//생성자 중복정의 메소드로 매개변수 입력 후 출력
		Review3User User3 = new Review3User(66666, "피자왕", "Pizzaking", "!@#PIZZA#@!");
		User3.viewInfo();
	}
}
