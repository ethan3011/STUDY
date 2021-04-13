package HTA0413;

/*ObjectApp1*/
public class Review1ObjectApp1 {
	
	public static void main(String[] args) {
		
		Review1Person p1 = new Review1Person(10, "홍길동", "hong@gmail.com");
		Review1Person p2 = new Review1Person(10, "홍길동", "hong@gmail.com");
		Review1Person p3 = p1;
		Review1Person p4 = p2;
		
		//boolean equals(Object obj) 메소드
		boolean result1 = p1.equals(p2);
		boolean result2 = p2.equals(p1);
		boolean result3 = p1.equals(p3);
		boolean result4 = p2.equals(p4);
		
		//p1이 참조하는 객체와 p2가 참조하는 객체가 같은 객체인가?
		System.out.println("p1이 참조하는 객체와 p2가 참조하는 객체가 같은 객체인가 ?" + result1);
		//p2이 참조하는 객체와 p1가 참조하는 객체가 같은 객체인가? 
		System.out.println("p2이 참조하는 객체와 p1가 참조하는 객체가 같은 객체인가? " + result2);
		//p1이 참조하는 객체와 p3가 참조하는 객체가 같은 객체인가?
		System.out.println("p1이 참조하는 객체와 p3가 참조하는 객체가 같은 객체인가? " + result3);
		//p2이 참조하는 객체와 p4가 참조하는 객체가 같은 객체인가?
		System.out.println("p2이 참조하는 객체와 p4가 참조하는 객체가 같은 객체인가? " + result4);
	}
}