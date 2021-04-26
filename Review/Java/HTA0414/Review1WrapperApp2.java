package HTA0414;

/*WrapperApp2*/
public class Review1WrapperApp2 {

//	1.오토박싱, 오토언박싱/문자열 실수로 변환
	public static void main(String[] args) {
		
		Integer[] scores = {100, 100, 80, 100, 50, 60, 70, 80, 50, 60};
		
		//합계저장할 변수 선언
		Integer sum = new Integer(0);
		
		//향상된 for문에 타입 Integer로 배열의 합계 구하기
		for(Integer item : scores) {
			sum += item;
		}
		
		//합계저장할 변수2 선언
		int sum2 = 0;
		
		//향상된 for문에 기본형 int로 배열의 합계 구하기
		for(int item : scores) {
			sum2 += item;
		}
		
		System.out.println("sum의 합계 : " + sum);
		System.out.println("sum2의 합계 : " + sum2);
	}
}