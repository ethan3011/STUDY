package HTA0331;


/*MethodSample class 생성*/
public class Review1MethodSample{
	
	//기본자료형 타입 매개변수(x,y)를 가진 method  선언
	void method(int x, int y) {	
		
		//x,y값 출력
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
	}
	
	// 참조자료형 타입 매개변수(MyNumber number)를 가진 method선언
	void method2(Review1Mynumber number) {
		
		//number안의 x,y값 출력
		System.out.println("x의 값 : " + number.x);
		System.out.println("y의 값 : " + number.y);
	}
}




	//number안의 x,y값 출력
	
