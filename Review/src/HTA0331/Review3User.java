package HTA0331;

// User class 생성
	public class Review3User {
		
	// 번호, 이름, 아이디, 비밀번호, 이메일, 전화번호, 나이, 주소, 결혼여부 멤버변수 선언
	int no;
	String name;
	String username;
	String password;
	String email;
	int age;
	String address;
	boolean isMarried;
	
			
	// 생성자 메소드에 위의 멤버변수 값을 초기화하기
	public Review3User() {
		no = 88888;
		name = "Ethan";
		username = "Ethan0331";
		password = "!@#$ETHAN#@!";
		email = "ETHAN0331@MARSO.COM";
		age = 100;
		address = "치킨시 피자로 짜장아파트";
		isMarried = true;
	}
	
	// 생성자 메소드 중복정의
	public Review3User(int duNo, String duName, String duUsername, String duPassword) {
			no = duNo;
			name = duName;
			username = duUsername;
			password = duPassword;
		}
	
	// 정보값출력 메소드
		void viewInfo() {
			System.out.println(" 번호 : " + no);
			System.out.println(" 이름 : " + name);
			System.out.println(" 아이디 : " + username);
			System.out.println(" 비밀번호 : " + password);
			System.out.println(" 이메일 : " + email);
			System.out.println(" 나이 : " + age);
			System.out.println(" 주소 : " + address);
			System.out.println(" 결혼여부 : " + isMarried);
		}
	}
