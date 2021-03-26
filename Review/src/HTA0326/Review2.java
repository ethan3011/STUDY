package HTA0326;

public class Review2 {
	public static void main(String[] args) {
		
		// 배열에 저장된 값을 대상으로 최소값, 최대값 구하기
		int[] scores = {79, 88, 91, 100, 55, 99};		
		// 최소값을 구할 때는 해당값이 가질 수 있는 가장 큰 값을 초기값으로 지정한다.
		int min = 100;
		// 최대값을 구할 때는 해당값이 가질 수 있는 가장 작은 값을 초기값으로 지정한다.
		int max = 0;
		// 최소값은 변수 min에 저장된 값보다 배열에서 조회한 값이 더 작을 때만 min의 값을 배열의 값으로 바꾼다.
		System.out.println("### 최소값, 최대값 출력하기 ###");
		for(int score : scores) {
			if(score < min) {
				min = score;
			}
		}System.out.println("최소값 : " + min);
		// 최대값은 변수 max에 저장된 값보다 배열에서 조회한 값이 더 클 때만 max의 값을 배열의 값으로 바꾼다.
		for(int score : scores) {
			if(score > max) {
				max = score;
			}
		}System.out.println("최대값 : " + max);
		
		// 최소값은 변수 min에 저장된 값보다 배열에서 조회한 값이 더 작을 때만 min의 값을 배열의 값으로 바꾼다.
		// 최소값은 변수 min에 저장된 값보다 배열에서 조회한 값이 더 작을 때만 min의 값을 배열의 값으로 바꾼다.
		for(int score : scores) {
			if(score < min) {
				min = score;
			}else if(score > max){
				max = score;
			}
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}
}
