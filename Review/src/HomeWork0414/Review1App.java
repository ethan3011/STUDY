package HomeWork0414;

import java.text.DecimalFormat;
import java.util.Scanner;

import HTA0324.Review1;
import HomeWork0413.Review3Product;

public class Review1App {
	
//	private static DecimalFormat numberFormat = new DecimalFormat("#,###");
	
//	private static String numberToCurrency(int number) {
//		return Review1App.numberFormat.format(number);
//	}
//	
	
	private static void PrintAllReview1Orders(Review1Order[] orders) {
		int totalPrice = 0;
		double totalSavePoint = 0;
		
		for(Review1Order order :orders) {
			if(order != null) {
				totalPrice = order.getItem().getPrice()*order.getAmount();
				totalSavePoint = order.getItem().getPoint()*order.getAmount();
				
				System.out.println(order.getItem().getName() + "의 상품의 총 주문금액 : " + totalPrice);	
				System.out.println(order.getItem().getName() + "의 상품의 총적립포인트 : " + totalSavePoint);
				System.out.println();
			}
		}
	}

	private static void printAllOrdered(Review1Order order) {
		System.out.println("###구매한 상품내역 ");
		System.out.println("구매하신 상품명 : " + order.getItem().getName());
		System.out.println("구매하신 상품번호 : " + order.getItem().getNo());
		System.out.println("구매하신 상품가격 : " + order.getItem().getPrice());
		System.out.println("구매하신 상품포인트 : " + order.getItem().getPoint());
		System.out.println("구매 갯수 : " + order.getAmount());		
		System.out.println();
	}
	
	private static void printAllProducts(Review1Product product){
		System.out.println("### 상품정보 ###");
		System.out.println("상품번호 : " + product.getNo());
		System.out.println("상품이름 : " + product.getName());
		System.out.println("상품가격 : " + product.getPrice());
		System.out.println("포인트적립 : " + product.getPoint());
		System.out.println();
	}

	public static void main(String[] args) {
		// 상품정보를 조회할 수 있다.
		// 상품을 구매할 수 있다.
		// 상품구매내역을 출력할 수 있다.
		// 총 구매금액, 총 적립포인트를 출력할 수 있다.
		
		// 상품정보가 저장된 배열
		Review1Product[] products = new Review1Product[10];
		products[0] = new Review1Product(10, "맥북프로", 2_600_000, 5000);
		products[1] = new Review1Product(20, "애플워치", 600_000, 600);
		products[2] = new Review1Product(30, "갤럭시워치", 450_000, 340);
		products[3] = new Review1Product(40, "아이패드", 800_000, 700);
		products[4] = new Review1Product(50, "TV", 400_000, 400);
		products[5] = new Review1Product(60, "스피커", 50_000, 50);
		products[6] = new Review1Product(70, "키보드", 100_000, 100);
		products[7] = new Review1Product(80, "메인보드", 300_000, 300);
		products[8] = new Review1Product(90, "그래픽카드", 1_000_000, 2000);
		products[9] = new Review1Product(100, "헤드셋", 700_000, 600);
		
		// 구매정보가 저장된 배열
		Review1Order[] orders = new Review1Order[100];
		int position = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.상품조회 2.구매 3.구매내역조회 4.총계조회 0.종료");
			System.out.println("-----------------------------------------------");
			int menuNo = sc.nextInt();
			
			if(menuNo == 1) {
//				 1. 상품조회
//				   - products 배열에 저장된 모든 상품을 출력한다.
				System.out.println("[상품조회]");
				for(Review1Product item : products) {
					printAllProducts(item);
				}
			}else if(menuNo == 2) {
//				2. 상품구매
//				   - 상품번호와 수량을 입력받는다.
				System.out.println("[상품구매]");
				System.out.println("구매하실 상품번호를 입력해주세요.");
				int productNo = sc.nextInt();
				System.out.println("구매하실 수량을 입력해주세요.");
				int stock = sc.nextInt();
				
//				   - 상품번호에 해당하는 상품정보를 조회한다.
//				   - 상품번호에 해당하는 상품이 존재하면, 구매정보객체에 상품정보와 구매수량을 저장한다.
//				   - 구매정보 배열에 구매정보객체를 저장한다.
				for(Review1Product item :products) {
					if(item.getNo() == productNo) {
						orders[position] = new Review1Order(item, stock);
						position++;
					}
				}
		
			}else if(menuNo == 3) {
//				3. 구매내역조회
//				   - 구매정보 배열에 저장된 모든 구매정보를 출력한다.
				System.out.println("[구매내역조회]");
				for(Review1Order item :orders) {
					if(item != null) {
						printAllOrdered(item);
					}
				}
				
			}else if(menuNo == 4) {
//			4. 총계조회
//			   - 구매정보 배열에 저장된 구매정보를 사용해서, 총 주문금액, 총 적립포인트를 출력한다.
//			   - 총주문금액은 상품가격*구매수량의 총합이다.
//			   - 총적립포인트는 상품포인트*구매수량의 총합이다.
				System.out.println("[총계조회]");
				System.out.println("### 구매정보");
				PrintAllReview1Orders(orders);
				
			}else if(menuNo == 0) {
				System.out.println("[종료]");
				System.out.println();
				break;
			}
		}
	}
}