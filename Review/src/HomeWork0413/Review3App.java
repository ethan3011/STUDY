package HomeWork0413;

import java.util.Scanner;
public class Review3App {
	
	public static void printProduct(Review3Product product) {
		System.out.println("[### 상품정보 ###]");
		System.out.println("상품번호 : " + product.getNo());
		System.out.println("카테고리 : " + product.getCategory());
		System.out.println("상품이름 : " + product.getName());
		System.out.println("상품가격 : " + product.getPrice());
		System.out.println("상품재고 : " + product.getStock());
		System.out.println("매진여부 : " + product.isSoldOut());
		System.out.println();
	}

	public static void main(String[] args) {
		Review3Product[] products = new Review3Product[10];
		products[0] = new Review3Product(10, "노트북", "맥북에어", 1700000, 5, false);
		products[1] = new Review3Product(20, "노트북", "맥북프로", 2700000, 10, false);
		products[2] = new Review3Product(30, "노트북", "LG그램", 1900000, 40, false);
		products[3] = new Review3Product(40, "스마트폰", "샤오미", 600000, 30, false);
		products[4] = new Review3Product(50, "스마트폰", "아이폰12", 1700000, 30, false);
		products[5] = new Review3Product(60, "스마트폰", "갤럭시S20", 1500000, 100, false);
		products[6] = new Review3Product(70, "시계", "갤럭시워치", 470000, 0, true);
		products[7] = new Review3Product(80, "시계", "애플워치6", 700000, 5, false);
		products[8] = new Review3Product(90, "도서", "자바의 정석", 35000, 100, false);
		products[9] = new Review3Product(100, "도서", "이것이 자바다", 28000, 100, false);
		
		final int ALL_SAERCH = 1;
		final int SEARCH_BY_CATEGORY = 2;
		final int SEARCH_BY_INCLUDE_NAME = 3;
		final int SEARCH_BY_PRICE = 4;
		final int EXIT = 0;
		
		
		// 상품정보를 조회하는 프로그램 작성하기
		
		// 1. 키보드 입력을 읽어오는 Scanner 객체를 생성한다.
		Scanner sc = new Scanner(System.in);
		
		// 2. 반복문(while문)을 사용해서 아래의 작업을 반복 수행한다.
		
		while(true) {
			
			//		1. 메뉴제공 1.전체조회 2.카테고리별조회 3.상품명조회 4.가격조회 0.종료
			System.out.println("### 메뉴를 선택해주세요");
			System.out.println("1.전체조회 2.카테고리별조회 3.상품명조회 4.가격조회 0.종료");
			//		2. 메뉴번호를 입력받는다.
			int menuNo = sc.nextInt();
			
			//		3. 메뉴별 처리를 구현한다.
			// 			- 전체조회는 모든 상품정보를 표시한다.
			if(menuNo == ALL_SAERCH) {
				for(Review3Product item :products) {
					Review3App.printProduct(item);
				}
			}
			
			//			- 카테고리조회는 카테고리를 입력받아서 카테고리가 일치하는 상품만 출력한다.
			else if(menuNo == SEARCH_BY_CATEGORY) {
				System.out.println("카테고리를 입력해주세요.");
				String cate = sc.next();
				
				if(cate.isBlank()) {
					System.out.println("[오류] 카테고리명이 비어있습니다.");
				}else {
					boolean isExist = false;
					for(Review3Product item : products) {
						if(cate.equals(item.getCategory())) {
							isExist = true;
							Review3App.printProduct(item);
						}
					}
					if(!isExist) {
						System.out.println("[안내] 입력한 카테고리와 일치하는 상품이 존재하지 않습니다");
					}	
				}
			}
			
			//			- 상품명조회는 상품명을 입력받아서 그 문자열을 포함하고 있는 상품만 출력한다.
			else if(menuNo == SEARCH_BY_INCLUDE_NAME) {
				System.out.println("상품명을 입력해주세요.");
				String pdsname = sc.next();
				
				for(Review3Product item : products) {
					if(item.getName().contains(pdsname)) {
						Review3App.printProduct(item);
					}
				}			
			}
			
			//			- 가격조회는 최소가격, 최대가격을 입력받아서 해당 범위에 속하는 상품만 출력한다.
			else if(menuNo == SEARCH_BY_PRICE) {
				System.out.println("최소가격을 입력하세요.");
				int minPrice = sc.nextInt();
				System.out.println("최대가격을 입력하세요.");
				int maxPrice = sc.nextInt();
				for(Review3Product item :products) {
					if(item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
						Review3App.printProduct(item);
					}
				}
			}
			
			//			- 종료는 반복문을 탈출한다.
			else if(menuNo == EXIT) {
				System.out.println("[프로그램 종료]");
				break;
			}
		}
		sc.close();
	}
}
