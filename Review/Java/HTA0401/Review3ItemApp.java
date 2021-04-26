package HTA0401;

import java.util.Scanner;
// 3. ItemService와 ItemApp을 순서대로 하나씩 구현해 간다.
public class Review3ItemApp {
	
	public static void main(String[] args) {
		
		final int PRINT_ALL_PRODUCT = 1;
		final int SEARCH_CATEGORY = 2;
		final int SEARCH_NAME = 3;
		final int SEARCH_MIN_MAX = 4;
		final int SEARCH_NUMBER = 5;
		final int REGISTER_PRODUCT = 6;
		final int DELETE_PRODUCT = 7;
		final int EXIT = 0;
		
Scanner sc = new Scanner(System.in);
		
		//Item객체에 대한 조회/검색/추가/삭제 기능을 제공하는 객체 생성
		Review3ItemService service = new Review3ItemService();
		
		while(true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.전체 2.카테고리 3.이름 4.가격 5.번호 6.등록 7.삭제 0.종료");
			System.out.println("------------------------------------------------");
			
			System.out.print("메뉴번호를 선택하세요 : ");
			int menuNo = sc.nextInt();
			
			if(menuNo == PRINT_ALL_PRODUCT) {
				System.out.println("모든 제품의 정보를 출력합니다.");
				service.printAllItem();

			} else if(menuNo == SEARCH_CATEGORY) {
				System.out.print("카테고리를 입력해주세요 : ");
				String category = sc.next();

				service.printItemByCategory(category);
				
			} else if(menuNo == SEARCH_NAME) {
				System.out.print("이름을 입력해주세요 : ");
				String name = sc.next();
				
				service.printItemByName(name);
				
			} else if(menuNo == SEARCH_MIN_MAX) {
				System.out.print("검색하실 상품의 최소값을 입력해주세요 : ");
				int min = sc.nextInt();
				System.out.print("검색하실 상품의 최대값을 입력해주세요 : ");
				int max = sc.nextInt();
				
				service.printItemByPrice(min, max);
				
			} else if(menuNo == SEARCH_NUMBER) {
				
				System.out.print("상품번호를 입력해주세요 : ");
				int no = sc.nextInt();
				
				service.printItemDetail(no);
				
			} else if(menuNo == REGISTER_PRODUCT) {
				System.out.println("###새로운 상품을 등록합니다 ###");
				System.out.print("새로 등록할 상품번호를 입력해주세요 : ");
				int no = sc.nextInt();
				System.out.print("새로 등록할 상품카테고리를 입력해주세요 : ");
				String category = sc.next();
				System.out.print("새로 등록할 상품이름을 입력해주세요 : ");
				String name = sc.next();
				System.out.print("새로 등록할 상품제조사를 입력해주세요 : ");
				String maker = sc.next();
				System.out.print("새로 등록할 상품가격을 입력해주세요 : ");
				int price = sc.nextInt();
				
				
				Review3Item newItem = new Review3Item(no, category, name, maker, price);
				service.insertItem(newItem);
				
			} else if(menuNo == DELETE_PRODUCT) {
		
				System.out.print("삭제하실 상품의 번호를 입력해주세요 : ");
				int delNo = sc.nextInt();
				
				service.deleteItem(delNo);
				
			} else if(menuNo == EXIT) {
				break;
				
			}
		}sc.close();
	}
}
