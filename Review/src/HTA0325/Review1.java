package HTA0325;
//	for문에 내포된 if문
//	1 ~ 10사이의 정수 중에서 홀수만 출력하기
//	1 ~ 10사이의 정수 중에서 짝수의 총합을 계산하고, 그 결과를 출력하기
//	1 ~ 10사이의 정수 중에서 홀수의 총합과 짝수의 총합을 계산하고, 그 결과를 출력하기

public class Review1 {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0; i<=10; i++) {
			if(!(i%2==0)) {
				sum += i;
			}
		}
		System.out.println("홀수의 총합 : " + sum);
		
		int cal=0;
		for(int i=0; i<=10; i++) {
			if(i%2==0) {
				cal += i;
			}
		}
		System.out.println("짝수의 총합 : " + cal);
		
		int oddSum=0;
		int evenSum =0;
		for(int i=0; i<=10; i++) {
			if(i%2==0) {
				evenSum += i;
			}else {
				oddSum += i;
			}
		}int total = evenSum + oddSum;
		System.out.println("홀수와 짝수의 총합 : " + total);
	}	
}
