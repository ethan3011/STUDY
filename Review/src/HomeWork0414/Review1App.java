package HomeWork0414;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Review1App {
	
	
	private static Review1Product findProduct(Review1Product[] products, int productNo) {
		Review1Product foundProduct = null;
		
		for(Review1Product product : products) {
			if(product.getNo() == productNo) {
				foundProduct = product;
			}
		}
		return foundProduct;
	}
	
	private static DecimalFormat numberFormat = new DecimalFormat("#,###");
	
	private static String numberToCurrency(int number) {
		return Review1App.numberFormat.format(number);
	}

	public static void main(String[] args) {
		// 상품정보를 조회할 수 있다.
		// 상품을 구매할 수 있다.
		// 상품구매내역을 출력할 수 있다.
		// 총 구매금액, 총 적립포인트를 출력할 수 있다.
		
/*
	    1. 상품조회
		   - products 배열에 저장된 모든 상품을 출력한다.
		2. 상품구매
		   - 상품번호와 수량을 입력받는다.
		   - 상품번호에 해당하는 상품정보를 조회한다.
		   - 상품번호에 해당하는 상품이 존재하면, 구매정보객체에 상품정보와 구매수량을 저장한다.
		   - 구매정보 배열에 구매정보객체를 저장한다.
		3. 구매내역조회
		   - 구매정보 배열에 저장된 모든 구매정보를 출력한다.
		4. 총계조회
		   - 구매정보 배열에 저장된 구매정보를 사용해서, 총 주문금액, 총 적립포인트를 출력한다.
		   - 총주문금액은 상품가격*구매수량의 총합이다.
		   - 총적립포인트는 상품포인트*구매수량의 총합이다.
*/
		// 상품정보가 저장된 배열
		Review1Product[] products = new Review1Product[10];
		products[0] = new Review1Product(10, "노트북", 1200000, 120);
		products[1] = new Review1Product(20, "이어폰", 400000, 45);
		products[2] = new Review1Product(30, "스피커", 600000, 60);
		products[3] = new Review1Product(40, "태블릿", 1200000, 120);
		products[4] = new Review1Product(50, "갤럭시", 400_000, 130);
		products[5] = new Review1Product(60, "아이폰", 50_000, 150);
		products[6] = new Review1Product(70, "키보드", 65000, 6);
		products[7] = new Review1Product(80, "마우스", 20000, 2);
		products[8] = new Review1Product(90, "헤드폰", 200000, 20);
		products[9] = new Review1Product(100, "모니터", 350000, 30);
		
		// 구매정보가 저장된 배열
		Review1Order[] orders = new Review1Order[100];
		int position = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.상품조회 2.구매 3.구매내역조회 4.총계조회 0.종료");
			System.out.println("-----------------------------------------------");
			
			System.out.println("메뉴번호를 입력 : ");
			int menuNo = sc.nextInt();
			
			if(menuNo == 1) {
				System.out.println("[전체상품조회]");
				for(Review1Product item:products) {
					System.out.println("상품명 : " + item.getNo());
					System.out.println("상품이름 : " + item.getName());
					System.out.println("상품가격 : " + item.getPrice());
					System.out.println("적립포인트 : " + item.getPoint());
					System.out.println();
				}
				
			}else if(menuNo == 2) {
				System.out.println("[상품구매]");
				System.out.println("구매할 상품번호 입력 : ");
				int productNo = sc.nextInt();
				System.out.println("구매할 상품수량 입력 : ");
				int amount = sc.nextInt();
				
				Review1Product product = Review1App.findProduct(products, productNo);
				if(product == null) {
					System.out.println("[안내] 상품번호에 해당하는 상품이 없습니다.");
				}else {
					// 주문정보 생성
					Review1Order order = new Review1Order();
					order.setItem(product);
					order.setAmount(amount);
					
					//주문배열에 저장하기
					orders[position++] = order;
					System.out.println("[안내] 주문이 완료되었습니다.");
				}
				
			}else if(menuNo == 3) {
				
				System.out.println("[구매 내역]");
				if(position == 0) {
					System.out.println("[안내] 주문내역이 존재하지 않습니다.");
				}else {
					for(Review1Order order : orders) {
						if(order == null) {
							break;
						}
						System.out.println("주문상품이름: " + order.getItem().getName());;
						System.out.println("주문상품가격 : " + numberToCurrency(order.getItem().getPrice()));;
						System.out.println("주문수량 : " + order.getAmount() + "개");
						System.out.println();
					}
				}
				
			}else if(menuNo == 4) {
				int totalOrderPrice = 0;
				int totalOrderCount = 0;
				int totalSavePoint = 0;
				
				if(position > 0) {
					for(Review1Order order :orders) {
						if(order == null) {
							break;
						}
						totalOrderPrice += order.getOrderPrice();
						totalSavePoint += order.getSavePoint();
						totalOrderCount++;
					}
				}
				System.out.println("총 구매금액 : " + numberToCurrency(totalOrderPrice) + "원");
				System.out.println("총 적립포인트 : " + numberToCurrency(totalSavePoint) + "원");
				System.out.println("총 구매건수 : " + numberToCurrency(totalOrderCount) + "원");
				
				
			}else if(menuNo == 0) {
				System.out.println("[종료]");
				break;
			}
		}
		sc.close();
	}
}