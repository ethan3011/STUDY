package HTA0423.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import HTA0423.exception.OrderException;
import HTA0423.exception.UserException;
import HTA0423.repository.BookRepository;
import HTA0423.repository.OrderRepository;
import HTA0423.repository.UserRepository;
import HTA0423.vo.Book;
import HTA0423.vo.Order;
import HTA0423.vo.User;

public class BookStoreService {

	private BookRepository bookRepository = new BookRepository();
	private UserRepository userRepository = new UserRepository();
	private OrderRepository orderRepository = new OrderRepository();
	
	// 로그인 인증을 마친 사용자정보가 저장된다.
	private User loginedUser = null;
	private User adminloginedUser = null;
	
	/**
	 * 모든 책정보를 조회하는 기능.
	 * @return 도서 목록
	 */
	public List<Book> getAllBookList() {
		List<Book> books = bookRepository.getAllBooks();
		return books;
	}
	
	/**
	 * 지정된 카테고리에 해당하는 책 정보들을 조회하는 기능.
	 * @param category 조회할 도서 카테고리
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByCategory(String category) {
		ArrayList<Book> foundBooks = new ArrayList<Book>();
		List<Book> copyBooks = getAllBookList();
		
		for(Book book:copyBooks) {
			if(book.getCategory().equals(category)) {
				foundBooks.add(book);
			}else {
				continue;
			}
		}
		return foundBooks;
	}
	
	/**
	 * 지정된 책 제목을 포함하고 잇는 책 정보들을 조회하는 기능.
	 * @param title 조회할 도서 제목
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByTitle(String title) {
		ArrayList<Book> foundBooks = new ArrayList<Book>();
		List<Book> copyBooks = getAllBookList();
		
		for(Book book :copyBooks) {
			if(book.getTitle().contains(title)) {
				foundBooks.add(book);
			}else {
				continue;
			}
		}
		return foundBooks;
	}
	
	/**
	 * 지정된 가격범위에 속하는 책 정보들을 조회하는 기능.
	 * @param minPrice 최소 가격
	 * @param maxPrice 최대 가격
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByPrice(int minPrice, int maxPrice) {
		ArrayList<Book> foundBooks = new ArrayList<Book>();
		List<Book> copyBooks = getAllBookList();
		
		for(Book book:copyBooks) {
			if(minPrice <= book.getPrice() && book.getPrice() <= maxPrice) {
				foundBooks.add(book);
			}else {
				continue;
			}
		}
		return foundBooks;
	}
	
	/**
	 * 지정된 책번호에 해당하는 책정보를 조회하는 기능.
	 * @param no 조회할 책 번호
	 * @return 도서
	 */
	public Book findBook(int no) {
		Book book = bookRepository.getBookByNo(no);
			return book;
	}
	
	/**
	 * 지정된 책번호의 재고를 변경하는 기능.
	 * @param no 책번호
	 * @param stock 변경된 재고량
	 */
	public void updateBookStock(int no, int stock) {
		Book foundBook = bookRepository.getBookByNo(no);
		if(foundBook == null) {
			// 관리자 계정에서 메인으로 튕기지 않도록 throw를 사용하지 않는다.
			System.out.println("해당 번호의 책이 존재하지 않습니다.");
		}else {
			foundBook.setStock(stock);
			System.out.println("[성공] " + no + " 번의 책 재고가 "+stock +"개로 변경되었습니다.");
		}
	}
	
	/**
	 * 지정된 책정보를 변경하는 기능
	 * @param book 변경할 책정보
	 */
	public void updateBook(Book book) {
		bookRepository.updateBook(book);
	}
	
	/**
	 * 새 사용자정보를 등록하는 기능.
	 * @param user 새 사용자
	 */
	public void addNewUser(User user) {
		User foundUser = userRepository.getUserById(user.getId());
		if(foundUser != null) {
			throw new UserException("이미 등록된 아이디 입니다");
		}else {
			userRepository.insertUser(user);
			System.out.println("[성공] 신규회원 가입을 축하드립니다.");
		}
	}
	
	/**
	 * 지정된 사용자 정보를 새로운 사용자정보로 갱신하는 기능
	 * @param user 새로운 사용자
	 */
	public void updateUser(User user) {
		userRepository.updateUser(user);
	}
	
	/**
	 * 지정된 아이디와 비밀번호로 사용자정보를 인증하는 기능.
	 * @param id 아이디
	 * @param password 비밀번호
	 */
	public void login(String id, String password) {
		User foundUser = userRepository.getUserById(id);
			if((foundUser == null)) {
				throw new UserException("아이디가 존재하지 않거나 아이디 혹은 비밀번호가 일치하지 않습니다.");
			}
			if(!(foundUser.getId().equals(id) && foundUser.getPassword().equals(password))) {
				throw new UserException("아이디가 존재하지 않거나 아이디 혹은 비밀번호가 일치하지 않습니다.");				
			}
			loginedUser = foundUser;
			System.out.println("[성공]" +foundUser.getName() +" 님 환영합니다.");
	}
	/**
	 * 
	 * @param id
	 * @param password
	 */
	public void adminLogin(String id, String password) {
		
		User foundUser = userRepository.getUserById(id);
		if((foundUser == null)) {
			throw new UserException("아이디가 존재하지 않거나 아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
		if(!(id.equals("Admin123") && password.equals("Admin123"))) {
			throw new UserException("아이디가 존재하지 않거나 아이디 혹은 비밀번호가 일치하지 않습니다.");				
		}
		adminloginedUser = foundUser;
		System.out.println("[성공]" +foundUser.getName() +" 님 환영합니다.");
}
	
	/**
	 * 로그인된 사용자 정보를 초기화하는 기능.
	 */
	public void logout() {
		loginedUser = null;
	}
	public void loginedUser() {
		loginedUser = null;
	}
	
	/**
	 * 로그인여부를 반환하는 기능
	 * @return 로그인된 사용자정보가 존재하면 true를 반환한다.
	 */
	public boolean isLogined() {
		if(loginedUser != null) {
			return true;
		}
		return false;
	}
	
	public boolean isAdminLogined() {
		if(adminloginedUser != null) {
			return true;
		}
		return false;
	}
	
	/**
	 * 주문하는 기능
	 * @param bookNo 책번호
	 * @param amount 주문수량
	 */
	public void orderBook(int bookNo, int amount) {
		
		if(loginedUser == null) {
			throw new OrderException("로그인이 필요한 서비스입니다.");
		}
		
		Book book = bookRepository.getBookByNo(bookNo);
		if(book == null) {
			throw new OrderException("책번호가 올바르지 않습니다.");
		}
		
		if(book.getStock() < amount) {
			throw new OrderException("재고량이 부족합니다.");
		}
		
		Order order = new Order(loginedUser.getId(), bookNo, amount);
		orderRepository.insertOrder(order);
		book.setStock(book.getStock() - amount);
		int getPoint = (int)((book.getPrice()*amount)*0.01);
		loginedUser.setPoint(loginedUser.getPoint()+getPoint);
		int nowPoint = loginedUser.getPoint();
		
		if(nowPoint > 5000000) {
			loginedUser.setGrade("플레티넘");
		}else if(nowPoint > 1000000) {
			loginedUser.setGrade("골드");
		}else if(nowPoint > 100000) {
			loginedUser.setGrade("로얄");
		}else {
			loginedUser.setGrade("일반");
		}
		System.out.println("[성공]주문이 완료되었습니다.");
	}
	
	/**
	 * 로그인한 사용자의 주문정보를 조회하는 기능
	 * @return 주문 목록
	 */
	public List<Map<String, Object>> getMyOrderList() {
		if(loginedUser == null) {
			throw new UserException("로그인이 필요한 서비스입니다.");
		}
		
		ArrayList<Map<String, Object>> foundUser = new ArrayList<Map<String, Object>>();
		List<Order> orders = orderRepository.getAllOrders();
		
		Iterator<Order> iter = orders.iterator();
		Book bookInfo = new Book();
		
		
		while(iter.hasNext()) {
			Order order = iter.next();
			if(order.getUserId().equals(loginedUser.getId())) {
				bookInfo = bookRepository.getBookByNo(order.getBookNo());
			}
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put("bookNo", bookInfo.getNo());
				map.put("bookTitle", bookInfo.getTitle());
				map.put("amount", order.getAmount());
				map.put("totalPrice", order.getAmount()*bookInfo.getPrice());
				map.put("willSavePoint", (int)(order.getAmount()*bookInfo.getPrice()*0.01));
				foundUser.add(map);
		}
		return foundUser;
	}
	
	/**
	 * 로그인한 사용자의 상세정보를 조회하는 기능
	 * @return
	 */
	public User getMyInfo() {
		if(loginedUser == null) {
			throw new UserException("로그인이 필요한 서비스입니다.");
		}
		return loginedUser;
	}
	
	/**
	 * 모든 정보를 저장하는 기능
	 */
	public void restore() {
		bookRepository.saveData();
		userRepository.saveData();
		orderRepository.saveData();
	}
}