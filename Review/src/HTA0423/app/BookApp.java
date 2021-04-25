package HTA0423.app;

import java.text.DecimalFormat;
import java.util.Collections;
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
	private DecimalFormat df = new DecimalFormat("#,###");
	
	// 재귀호출
	public void menu() {
		try {
			
			boolean isLogined = service.isLogined();
			
			if (!isLogined) {
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("1.도서목록  2.로그인  3.회원가입  4.관리자계정  0.종료");
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
					
				} else if (menuNo == 4) {
					System.out.println("아이디를 입력하세요 : ");
					String id = scanner.next();
					System.out.println("비밀번호를 입력하세요 : ");
					String password = scanner.next();
					adminlogin(id, password);
					admin();
				}else if (menuNo == 0) {
					
					exit();
				}
			} else {
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("1.도서목록  2.검색  3.주문  4.내정보  5.주문내역  6.로그아웃  0.종료");
				System.out.println("-----------------------------------------------------------------------");
				
				System.out.print("메뉴 선택 > ");
				int menuNo = scanner.nextInt();
				System.out.println();
				
				if (menuNo == 1) {
					this.displayAllBooks();
				} else if (menuNo == 2) {
					this.searchBook();
				} else if (menuNo == 3) {
					System.out.println("구매하실 책의 번호를 입력해주세요 :");
					int bookNo = scanner.nextInt();
					System.out.println("구매하실 책의 수량을 입력해주세요 : ");
					int amount = scanner.nextInt();
					this.orderBook(bookNo, amount);
					
				} else if (menuNo == 4) {
					this.displayMyInfo();
					
				} else if (menuNo == 5) {
					this.displayMyOrderHistory();
					
				} else if (menuNo == 6) {
					this.logout();
					
				}else if (menuNo == 0) {
					this.exit();
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
		Collections.sort(books);
		System.out.println("책번호"+"\t"+"가격"+"\t"+"할인가격"+"\t"+"재고"+"\t"+"제목");
		System.out.println("====================================================================");
			for(Book book : books) { 
				System.out.println(book.getNo()+"\t"+df.format(book.getPrice()) +"\t"+df.format(book.getDiscountPrice())+"\t"+book.getStock()+"\t"+book.getTitle());
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
	 * 관리자계정 로그인
	 */
	private void adminlogin(String id, String password) {
		service.adminLogin(id, password);
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
			System.out.println("1.제목검색  2.카테고리검색  3.가격검색  4. 번호검색  5.검색종료(뒤로가기)  6.종료하기");
			System.out.println("-----------------------------------------------------------------------");

			System.out.print("검색 메뉴 선택 > ");
			int searchMenuNo = scanner.nextInt();
			System.out.println();
			
			if (searchMenuNo == 1) {
				System.out.println("검색하실 책제목(포함)을 입력해주세요 : ");
				String title = scanner.next();
				this.searchBooksByTitle(title);
				
			} else if (searchMenuNo == 2) {
				System.out.println("검색하실 카테고리를 입력해주세요 : ");
				String category = scanner.next();
				this.searchBooksByCategory(category);
				
			} else if (searchMenuNo == 3) {
				
				System.out.println("검색하실 최소금액을 입력해주세요(이상) : ");
				int minPrice = scanner.nextInt();
				System.out.println("검색하실 최대금액을 입력해주세요(이하) : ");
				int maxPrice = scanner.nextInt();	
				this.searchBooksByPrice(minPrice,maxPrice);

			} else if (searchMenuNo == 4) {
				System.out.println("검색하실 책의 번호를 입력해주세요 : ");
				int no = scanner.nextInt();
				this.findBookByNo(no);
				
			}else if (searchMenuNo == 5) {
				break;
				
			}else if (searchMenuNo == 0) {
				
				exit();
			}
			System.out.println();
		}
	}
	
	private void admin() {
		
		boolean isAdminLogined = service.isLogined();
		if(isAdminLogined) {
		while(true) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.재고변경  2.책정보변경  3.사용자정보변경  4.로그아웃  0.종료");
			System.out.println("-----------------------------------------------------------------------");
			
			System.out.print("검색 메뉴 선택 > ");
			int adminMenuNo = scanner.nextInt();
			System.out.println();
			
			if(adminMenuNo == 1) {
				System.out.println("변경하실 책의 번호를 입력해주세요.");
				int no = scanner.nextInt();
				System.out.println("변경하실 책의 갯수를 입력해주세요.");
				int stock = scanner.nextInt();
				this.updateBookStock(no, stock);
				
			}else if(adminMenuNo == 2) {
				System.out.println("변경하실 책번호를 입력해주세요.");
				int no = scanner.nextInt();
				System.out.println("새로운책의 카테고리를 입력해주세요.");
				String category = scanner.next();
				System.out.println("새로운책의 제목을 입력해주세요.");
				String title = scanner.next();
				System.out.println("새로운책의 저자를 입력해주세요.");
				String writer = scanner.next();
				System.out.println("새로운책의 출판사를 입력해주세요.");
				String publisher = scanner.next();
				System.out.println("새로운책의 가격을 입력해주세요.");
				int price = scanner.nextInt();
				System.out.println("새로운책의 할인가격을 입력해주세요.");
				int discountPrice = scanner.nextInt();
				System.out.println("새로운책의 재고를 입력해주세요.");
				int stock = scanner.nextInt();
			
				this.updateBook(new Book(no, category, title, writer, publisher, price, discountPrice, stock));
				
			}else if(adminMenuNo == 3) {
				System.out.println("변경할 사용자 아이디를 입력해주세요 :");
				String id = scanner.next();
				System.out.println("변경될 사용자 이름을 입력해주세요 :");
				String name = scanner.next();
				System.out.println("변경될 사용자 비밀번호 입력해주세요 :");
				String password = scanner.next();
				System.out.println("변경될 사용자 포인트를 입력해주세요 :");
				int point = scanner.nextInt();
				
				User changeUser = new User(id, name, password, point, "");
				this.updateUser(changeUser);
				
			}else if(adminMenuNo == 4) {
				this.logout();
				break;
			}
			
			else if (adminMenuNo == 0) {
				exit();
			}
			System.out.println();
		}
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
		System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getGrade()+"\t"+df.format(user.getPoint()));
	}
	
	private void updateUser(User user) {
		service.updateUser(user);
	}
	
	/**
	 * 내주문내역 보기
	 */
	private void displayMyOrderHistory() {
		
		List<Map<String, Object>> info = service.getMyOrderList();
		this.displayMyBooksInfo(info);
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
	/**
	 * 입력된 숫자범위(금액) 안에 있는 책을 조회하는 기능
	 * @param minPrice 최소가격(이하)
	 * @param maxPrice 최대가격(이상)
	 */
	private void searchBooksByPrice(int minPrice, int maxPrice) {
		List<Book> books = service.searchBooksByPrice(minPrice, maxPrice);
		this.printBookInfo(books);
	}
	/**
	 * 입력된 글자가 포함된 책을 조회하는 기능
	 * @param title 포함될제목
	 */
	private void searchBooksByTitle(String title) {
		List<Book> books = service.searchBooksByTitle(title);
		this.printBookInfo(books);
	}
	
	/**
	 * 입력된 카테고리와 같은 책들을 표시하는 기능
	 * @param category 카테고리
	 */
	private void searchBooksByCategory(String category) {
		List<Book> books = service.searchBooksByCategory(category);
		this.printBookInfo(books);
	}
	
	/**
	 * 입력된 값과 같은 책을 표시하는 기능
	 * @param no 책번호
	 */
	private void findBookByNo(int no) {
		Book book = service.findBook(no);
		if(book == null) {
			System.out.println("검색결과가 없습니다.");
		}else {
			System.out.println("책번호"+"\t"+"가격"+"\t"+"할인가격"+"\t"+"재고"+"\t"+"제목");
			System.out.println("====================================================================");
			System.out.println(book.getNo()+"\t"+df.format(book.getPrice())+"\t"+df.format(book.getDiscountPrice())+"\t"+book.getStock()+"\t"+book.getTitle());
			System.out.println("====================================================================");
		}
	}
	/**
	 * 책의 번호를 받아 재고를 변경하는 기능
	 * @param no 책번호
	 * @param stock 변경할 책의 재고수
	 */
	private void updateBookStock(int no, int stock) {
		service.updateBookStock(no, stock);
	}
	
	private void updateBook(Book book) {
		service.updateBook(book);
		System.out.println("책번호"+"\t"+"가격"+"\t"+"할인가격"+"\t"+"재고"+"\t"+"제목");
		System.out.println("====================================================================");
		System.out.println(book.getNo()+"\t"+df.format(book.getPrice())+"\t"+df.format(book.getDiscountPrice())+"\t"+book.getStock()+"\t"+book.getTitle());
		System.out.println("====================================================================");
	}
	
	private void printBookInfo(List<Book> books) {
		
		Collections.sort(books);
		if(books.isEmpty()){
			System.out.println("검색결과가 없습니다");
		}else {
			System.out.println("책번호"+"\t"+"가격"+"\t"+"할인가격"+"\t"+"재고"+"\t"+"제목");
			System.out.println("====================================================================");
			for(Book book : books) {
				System.out.println(book.getNo()+"\t"+df.format(book.getPrice())+"\t"+df.format(book.getDiscountPrice())+"\t"+book.getStock()+"\t"+book.getTitle());
			}
			System.out.println("====================================================================");
		}
	}
	
	private void displayMyBooksInfo(List<Map<String, Object>> info) {
		if(info.isEmpty()) {
			System.out.println("구매한 책이 존재하지 않습니다.");
		}else {
		System.out.println("### 내 주문내역 ### ");
		System.out.println("==============================================================");
		for(Map<String, Object> item : info) {
			System.out.println("책번호 : " + item.get("bookNo"));
			System.out.println("책이름 : " + item.get("bookTitle"));
			System.out.println("구매수량 : " + df.format(item.get("amount")));
			System.out.println("총 구매가격 : " + df.format(item.get("totalPrice")));
			System.out.println("예상적립포인트 : " + df.format(item.get("willSavePoint")));
			System.out.println();
		}
		System.out.println("==============================================================");		
		}
	}
}
