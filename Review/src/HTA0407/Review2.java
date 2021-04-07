package HTA0407;

// import static java.lang.Math.*;
//random(), round(), floor(), ceil() 테스트해보기
import static java.lang.Math.*;
public class Review2 {
	
	public static void main(String[] args) {
		
		System.out.println("랜덤 값 : " + random());
		System.out.println("랜덤 값 : " + random());
		System.out.println("랜덤 값 : " + random());
		System.out.println("랜덤 값 : " + random());
		System.out.println("=========================================");
		
		System.out.println("-4.8의 반올림 값 : " + round(-4.8));
		System.out.println("-3.1의 반올림 값 : " + round(-3.1));
		System.out.println("4.8의 반올림 값 : " + round(4.8));
		System.out.println("3.1의 반올림 값 : " + round(3.1));
		System.out.println("=========================================");
		
		System.out.println("-4.8의 내림 값 : " + floor(-4.8));
		System.out.println("-3.1의 내림 값 : " + floor(-3.1));
		System.out.println("4.8의 내림 값 : " + floor(4.8));
		System.out.println("3.1의 내림 값 : " + floor(3.1));
		System.out.println("=========================================");
		
		System.out.println("-4.8의 올림 값 : " + ceil(-4.8));
		System.out.println("-3.1의 올림 값 : " + ceil(-3.1));
		System.out.println("4.8의 올림 값 : " + ceil(4.8));
		System.out.println("3.1의 올림 값 : " + ceil(3.1));
		
		System.out.println("=========================================");
		System.out.println("-4.8의 절댓 값 : " + abs(-4.8));
		System.out.println("-3.1의 절댓 값 : " + abs(-3.1));
		System.out.println("4.8의 절댓 값 : " + abs(4.8));
		System.out.println("3.1의 절댓 값 : " + abs(3.1));
		
		System.out.println("=========================================");
		System.out.println("-4.8 과 3.5 중 최대 값 : " + max(-4.8, 3.5));
		System.out.println("-25 와 18 중 최소 값 : " + min(-25, 18));
		System.out.println("4.5의 2.2 거듭제곱값 : " + pow(4.5, 2.2));
		System.out.println("3.1의 제곱근(루트) 값 : " + sqrt(3.1));
			
		System.out.println("=========================================");
		System.out.println("32.4의 사인값 : " + sin(32.4));
		System.out.println("22.5의 코사인값 : " + cos(22.5));
		System.out.println("3.1의 탄젠트값 : " + tan(3.1));
	}
}
