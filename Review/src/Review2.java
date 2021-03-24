	/*2. Scanner 
	 * 제품명, 가격, 구매수량을 입력받는다.
	 * 출력내용은 제품명, 가격, 구매수량, 총구매가격, 적립포인트다.
	 * 적립포인트는 총구매가격의 1%다. 
	 */
import java.util.Scanner;
public class Review2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제품명을 입력하세요.");
		String productName = scan.nextLine();
		System.out.println("가격을 입력하세요.");
		int price =scan.nextInt();
		System.out.println("구매수량을 입력하세요.");
		int buyTotal =scan.nextInt();
		
		int totalPrice = price * buyTotal;
		int savePoint = (int)(totalPrice * 0.01);
		
		System.out.println("제품명 : " + productName);
		System.out.println("가격 : " + price);
		System.out.println("구매수량 : " + buyTotal);
		System.out.println("총구매가격 : " + totalPrice);
		System.out.println("적립포인트 : " + savePoint);
		scan.close();
		
	}
}
