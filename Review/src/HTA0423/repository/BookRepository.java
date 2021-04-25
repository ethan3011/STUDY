
package HTA0423.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import HTA0423.exception.BookException;
import HTA0423.vo.Book;

public class BookRepository {

	private List<Book> db = new ArrayList<>();
	
	public BookRepository() {
		loadData();
	}
		
	/**
	 * 모든 책정보를 반환한다.
	 * @return 도서 목록
	 */
	public List<Book> getAllBooks() {
		return db;
	}
	
	/**
	 * 지정된 책번호의 책을 반환한다.
	 * @param no 책번호
	 * @return 도서
	 */
	public Book getBookByNo(int no) {
		
		for(Book book:db) {
			if(book.getNo() == no) {
				return book;
			}
		}
		return null;
	}
	
	/**
	 * 지정된 책으로 책정보를 변경한다.
	 * @param book 변경된 책정보를 포함하고 있는 책
	 */
	public void updateBook(Book book) {
		
		Book foundBook = getBookByNo(book.getNo());
		if(foundBook == null) {
			throw new BookException("입력하신 번호의 책이 존재하지 않습니다.");
		}else {
			foundBook.setCategory(book.getCategory());
			foundBook.setTitle(book.getTitle());
			foundBook.setWriter(book.getWriter());
			foundBook.setPublisher(book.getPublisher());
			foundBook.setPrice(book.getPrice());
			foundBook.setDiscountPrice(book.getDiscountPrice());
			foundBook.setStock(book.getStock());			
		}
	}
	
	/**
	 * 책의정보를 로드한다.
	 */
	private void loadData() {
		try(FileReader fr = new FileReader("src/HTA0423/books.csv");
				BufferedReader br = new BufferedReader(fr);) {
			
			String text = null;
			while((text = br.readLine()) != null) {
				// text에 br라인을 또 만들게 되면 두번째 값부터 저장이 되므로 주의 !
				String[] values = text.split(",");
				
				int no = Integer.parseInt(values[0]);
				String category = values[1];
				String title = values[2];
				String writer = values[3];
				String publisher = values[4];
				int price = Integer.parseInt(values[5]);
				int discountPrice = Integer.parseInt(values[6]);
				int stock = Integer.parseInt(values[7]);
				
				Book book = new Book(no, category, title, writer, publisher, price, discountPrice, stock);
				db.add(book);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 책의 정보를 저장한다.
	 */
	public void saveData() {
		try (PrintWriter pw = new PrintWriter("src/HTA0423/books.csv")){
			for(Book book:db) {
				StringBuilder sb = new StringBuilder();
				sb.append(book.getNo())
				.append(",")
				.append(book.getCategory())
				.append(",")
				.append(book.getTitle())
				.append(",")
				.append(book.getWriter())
				.append(",")
				.append(book.getPublisher())
				.append(",")
				.append(book.getPrice())
				.append(",")
				.append(book.getDiscountPrice())
				.append(",")
				.append(book.getStock());
				
				String text = sb.toString();
				pw.println(text);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
