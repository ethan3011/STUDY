package HomeWork0330;

public class Choice1 {
	public static void main(String[] args) {
		int number = 55166565;
		int sum = 0;
		
		while(number!=0) {
			sum += number%10;
			number /= 10;
		}System.out.println("각 한자리 숫자의 총 합계는 : " + sum);
	}
}
