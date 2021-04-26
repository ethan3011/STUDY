package HTA0331;

// MethodOverloadingSampleApp class 생성
public class Review2MethodOverloadingSampleApp {
	
	public static void main(String[] args) {
		Review2MethodOverloadingSample overloading = new Review2MethodOverloadingSample();
		
		//MethodOverloadingSample에서 만들었던 메소드 사용해보기
		overloading.pluse(6, 5.9);
		System.out.println("==================================================");
		overloading.pluse(1.4, 5);
		System.out.println("==================================================");
		overloading.pluse(5, 10);
		System.out.println("==================================================");
		overloading.pluse(1, 2, 3);
		System.out.println("==================================================");
		overloading.pluse(1.4, 5.9);	
	}
}
