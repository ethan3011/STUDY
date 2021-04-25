package HTA0423.vo;

public class Book implements Comparable<Book>{

	private int no;				// 책번호
	private String category;	// 카테고리
	private String title;		// 제목
	private String writer;		// 저자
	private String publisher;	// 출판사
	private int price;			// 가격
	private int discountPrice;	// 할인가격
	private int stock;			// 재고
	
	public Book() {}

	public Book(int no, String category, String title, String writer, String publisher, int price, int discountPrice,
			int stock) {
		super();
		this.no = no;
		this.category = category;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.discountPrice = discountPrice;
		this.stock = stock;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public int compareTo(Book other) {
		return this.no - other.no;
	}
}
