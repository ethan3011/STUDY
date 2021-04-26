package HTA0413;

/*ObjectApp3*/
public class Review1ObjectApp3 {
	
	public static void main(String[] args) {
		
		Review1Person p1 = new Review1Person(10, "홍길동", "hong@gmail.com");
		Review1Person p2 = new Review1Person(20, "김유신", "kimyoushint@naver.com");
		Review1Person p3 = new Review1Person(20, "김유신", "kimyoushint@naver.com");
		
		//p1참조변수가 참조하는 객체의 해시코드
		int hashCode1 = p1.hashCode();
		System.out.println(hashCode1);
		
		//p2참조변수가 참조하는 객체의 해시코드 
		int hashCode2 = p2.hashCode();
		System.out.println(hashCode2);
		
		//p3참조변수가 참조하는 객체의 해시코드 
		int hashCode3 = p3.hashCode();
		System.out.println(hashCode3);
	}
}