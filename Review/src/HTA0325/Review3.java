package HTA0325;
// break / continue 
public class Review3 {
	
	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		while(true) {
			if(sum > 10) {
				break;
			}else {
				i++;
				sum += i;
			}
			System.out.println("sum : " + sum);
		}
		
		int pizza = 0;
		
		for(int j=0; j<=10; j++) {
			if(j%2 == 0) {
				continue;
			}else {
				pizza++;
				System.out.println("pizza = " + pizza);
			}
		}
	}
}
