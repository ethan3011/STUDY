package HTA0413;

/*ObjectApp2*/
public class Review1ObjectApp2 {
	
	public static void main(String[] args) {
		
		Review1Person p1 = new Review1Person(10, "홍길동", "hong@gmail.com");
		Review1Person p2 = new Review1Person(20, "김유신", "kimyoushint@naver.com");
		
		//String toString()
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}