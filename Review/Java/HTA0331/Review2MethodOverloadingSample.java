package HTA0331;

// MethodOverloadingSample class 생성
public class Review2MethodOverloadingSample {
	
	//기본자료형 타입 매개변수를 가진 메소드 정의 후 매개변수 값의 덧셈(합) 출력
	void pluse(int x, double y) {System.out.println("int값 + double값 = " + (x+y));}
	void pluse(double x, int y) {System.out.println("double값 + int값 = " + (x+y));}
	void pluse(int x, int y) {System.out.println("int값 + int값 = " + (x+y));}
	void pluse(int x, int y, int z) {System.out.println("int값 + int값  + int 값 = " + (x+y+z));}
	void pluse(double x, double y) {System.out.println("double값 + double값 = " + (x+y));}
	
}
