package HTA0331;

public class Review1MethodSampleApp {
	
	public static void main(String[] args) {
		Review1MethodSample sample = new Review1MethodSample();
		System.out.println("### 기본형자료형 타입의 매개변수값 호출 ###");
		//기본자료형 타입의 매개변수를 가지는 메소드 호출하기
		sample.method(10, 5);
		
		
		//참조자료형 타입의 매개변수를 가지는 메소드 호출하기
		System.out.println("### 참조자료형 타입의 매개변수값 호출 ###");
		Review1Mynumber number = new Review1Mynumber();
		
		number.x = 100;
		number.y = 500;
		
		sample.method2(number);
	}
}
