package HTA0423.app;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import HTA0423.exception.BookStoreException;
import HTA0423.service.BookStoreService;
import HTA0423.vo.Book;
import HTA0423.vo.User;

public class BookApp {

	private BookStoreService service = new BookStoreService();
	private Scanner scanner = new Scanner(System.in);
	
	// 재귀호출
	public void menu() {
		try {
			
			boolean isLogined = service.isLogined();
			
			if (!isLogined) {
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("1.도서목록  2.로그인  3.회원가입  0.종료");
				System.out.println("-----------------------------------------------------------------------");
				
				System.out.print("메뉴 선택 > ");
				int menuNo = scanner.nextInt();
				System.out.println();
				
				if (menuNo == 1) {
					displayAllBooks();
				} else if (menuNo == 2) {
					System.out.println("아이디를 입력하세요 : ");
					String id = scanner.next();
					System.out.println("비밀번호를 입력하세요 : ");
					String password = scanner.next();
					login(id,password);
					
				} else if (menuNo == 3) {
					System.out.println("아이디를 입력하세요 : ");
					String id = scanner.next();
					System.out.println("이름을 입력하세요 : ");
					String name = scanner.next();
					System.out.println("비밀번호를 입력하세요 : ");
					String password = scanner.next();
					register(id, name, password);
				} else if (menuNo == 0) {
					
					exit();
				}
				
			} else {
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("1.도서목록  2.검색  3.주문  4.내정보  5.주문내역 6.로그아웃  0.종료");
				System.out.println("-----------------------------------------------------------------------");
				
				System.out.print("메뉴 선택 > ");
				int menuNo = scanner.nextInt();
				System.out.println();
				
				if (menuNo == 1) {
					displayAllBooks();
				} else if (menuNo == 2) {
					searchBook();
				} else if (menuNo == 3) {
					System.out.println("구매하실 책의 번호를 입력해주세요 :");
					int bookNo = scanner.nextInt();
					System.out.println("구매하실 책의 수량을 입력해주세요 : ");
					int amount = scanner.nextInt();
					orderBook(bookNo, amount);
					
				} else if (menuNo == 4) {
					displayMyInfo();
					
				} else if (menuNo == 5) {
					displayMyOrderHistory();
					
				} else if (menuNo == 6) {
					logout();
					
				} else if (menuNo == 0) {
					exit();
				}
			}
		} catch (BookStoreException e) {
			System.out.println("[오류] " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		menu();
	}
	
	/**
	 * 모든 책 정보 출력하기.
	 */
	private void displayAllBooks() {
		List<Book> books = service.getAllBookList();
		System.out.println("책번호"+"\t"+"가격"+"\t"+"할인가격"+"\t"+"재고"+"\t"+"제목");
		System.out.println("====================================================================");
		if(books.isEmpty()){
			System.out.println("책이 존재하지 않습니다.");
		}else {
			for(Book book : books) {
				System.out.println(book.getNo()+"\t"+book.getPrice()+"\t"+book.getDiscountPrice()+"\t"+book.getStock()+"\t"+book.getTitle());
			}
		}
		System.out.println("====================================================================");
	}
	
	/**
	 * 로그인하기
	 */
	private void login(String id, String password) {
		service.login(id, password);
	}
	
	/**
	 * 회원가입하기
	 */
	private void register(String id, String name, String password) {
		
		User user = new User(id, name, password, 0, "일반");
		service.addNewUser(user);
	}
	
	/**
	 * 도서 검색
	 */
	private void searchBook() {
		while(true) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.제목검색  2.카테고리검색  3.가격검색  0.검색종료(뒤로가기)");
			System.out.println("-----------------------------------------------------------------------");

			System.out.print("검색 메뉴 선택 > ");
			int searchMenuNo = scanner.nextInt();
			System.out.println();
			
			if (searchMenuNo == 1) {
				System.out.println("검색하실 책제목(포함)을 입력해주세요 : ");
				String title = scanner.next();
				List<Book> books = service.searchBooksByTitle(title);
				
				if(books.isEmpty()){
					System.out.println("검색결과가 없습니다");
				}else {
					System.out.println("책번호"+"\t"+"가격"+"\t"+"할인가격"+"\t"+"재고"+"\t"+"제목");
					System.out.println("====================================================================");
					for(Book book : books) {
						System.out.println(book.getNo()+"\t"+book.getPrice()+"\t"+book.getDiscountPrice()+"\t"+book.getStock()+"\t"+book.getTitle());
					}
					System.out.println("====================================================================");
				}
				
			} else if (searchMenuNo == 2) {
				System.out.println("검색하실 카테고리를 입력해주세요 : ");
				String category = scanner.next();
				List<Book> books = service.searchBooksByCategory(category);
				
				if(books.isEmpty()){
					System.out.println("검색결과가 없습니다");
				}else {
					System.out.println("책번호"+"\t"+"가격"+"\t"+"할인가격"+"\t"+"재고"+"\t"+"제목");
					System.out.println("====================================================================");
					for(Book book : books) {
						System.out.println(book.getNo()+"\t"+book.getPrice()+"\t"+book.getDiscountPrice()+"\t"+book.getStock()+"\t"+book.getTitle());
					}
					System.out.println("====================================================================");
				}
				
				
			} else if (searchMenuNo == 3) {
				
				System.out.println("검색하실 최소금액을 입력해주세요(이상)");
				int minPrice = scanner.nextInt();
				System.out.println("검색하실 최대금액을 입력해주세요(이하)");
				int maxPrice = scanner.nextInt();
				
				List<Book> books = service.searchBooksByPrice(minPrice, maxPrice);
						
				if(books.isEmpty()) {
					System.out.println("검색결과가 없습니다");
				}else {
					System.out.println("책번호"+"\t"+"가격"+"\t"+"할인가격"+"\t"+"재고"+"\t"+"제목");
					System.out.println("====================================================================");
					for(Book book : books) {
						System.out.println(book.getNo()+"\t"+book.getPrice()+"\t"+book.getDiscountPrice()+"\t"+book.getStock()+"\t"+book.getTitle());
					}
					System.out.println("====================================================================");
				}
			} else if (searchMenuNo == 0) {
				break;
			}
			System.out.println();
		}
	}
	
	/**
	 * 책 주문하기
	 */
	private void orderBook(int bookNo, int amount) {
		service.orderBook(bookNo, amount);
	}
	
	/**
	 * 내 정보 보기
	 */
	private void displayMyInfo() {
		User user = service.getMyInfo();
		System.out.println("아이디"+"\t"+"이름"+"\t"+ "고객등급"+"\t"+ "포인트");
		System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getGrade()+"\t"+user.getPoint());
	}
	
	/**
	 * 내주문내역 보기
	 */
	private void displayMyOrderHistory() {
		
		List<Map<String, Object>> info = service.getMyOrderList();
		
		System.out.println("### 내 주문내역 ### ");
		System.out.println("==============================================================");
		for(Map<String, Object> item : info) {
			System.out.println("책번호 : " + item.get("bookNo"));
			System.out.println("책이름 : " + item.get("bookTitle"));
			System.out.println("구매수량 : " + item.get("amount"));
			System.out.println("총 구매가격 : " + item.get("totalPrice"));
			System.out.println("예상적립포인트 : " + item.get("willSavePoint"));
			System.out.println();
		}
		System.out.println("==============================================================");		
	}
	
	/**
	 * 로그아웃하기
	 */
	private void logout() {
		System.out.println("[성공] 로그아웃 되었습니다.");
		service.logout();
	}
	
	/**
	 * 종료하기
	 */
	private void exit() {
		System.out.println("[프로그램 종료]");
		service.restore();
		System.exit(0);	// JVM자체를 종료시키는 메소드
	}
	
	public static void main(String[] args) {
		BookApp app = new BookApp();
		app.menu();
	}
}
