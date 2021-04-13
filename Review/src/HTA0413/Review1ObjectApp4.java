package HTA0413;

/*ObjectApp4*/
public class Review1ObjectApp4 {
	
	public static void main(String[] args) {
		
		Review1Person p1 = new Review1Person(10, "홍길동", "hong@gmail.com");
		Review1Person p2 = new Review1Person(10, "홍길동", "hong@gmail.com");
		
		// ==연산자로 p1참조변수의 주소값과 p2참조변수의 주소값이 같은지 비교
		boolean test1 = (p1==p2);
		System.out.println("==연산자로 p1참조변수의 주소값과 p2참조변수의 주소값이 같은지 비교 : " + test1);
		
		//boolean equals(Object obj)메소드로 p1참조변수와 p2참조변수가 참조하는 객체가 같은 객체인지 비교
		boolean test2 = p1.equals(p2);
		System.out.println("boolean equals(Object obj)메소드로 p1참조변수와 p2참조변수가 참조하는 객체가 같은 객체인지 비교 : " + test2);
	}
}