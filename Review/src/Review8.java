//1~10까지 출력하기
//구구단 2단 출력하기
//합계 구하기 (1~100 / 1001~2000)
public class Review8 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}System.out.println("===================================");
		
			int dan=2;
			for(int j=1; j<10; j++) {
				System.out.println(dan + " * " + j + " = " + (dan*j));
			}System.out.println("===================================");
			
			int sum=0;
			for(int k=1; k<= 100; k++) {
				sum += k;
			}System.out.println(sum);
			System.out.println("===================================");
			
			int thsum = 0;
			for(int l=1001; l<=2000; l++) {
				thsum += l;
			}System.out.println(thsum);
	}
}
