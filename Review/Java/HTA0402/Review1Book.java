package HTA0402;
//1. getter/setter
/*Book class*/
//private int no;
//private String title;
//private String writer;
//private String publisher;
//private int price;
//private boolean isSoldOut;
//private double discountRate;
//private Event event;
//private Gift gift;

public class Review1Book {
	private int no;
	private String title;
	private String writer;
	private String publisher;
	private int price;
	private boolean isSoldOut;
	private double discountRate;
	private Review1Event event;
	private Review1Gift gift;
	
	public Review1Book(int no,String title, String writer, String publisher, 
		int price, boolean isSoldOut, double discounteRate) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.isSoldOut = isSoldOut;
		this.discountRate = discounteRate;
	}
	
	public Review1Book(int no, String title, String writer, String publisher, int price, boolean isSoldOut,
			double discountRate, Review1Event event, Review1Gift gift) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.isSoldOut = isSoldOut;
		this.discountRate = discountRate;
		this.event = event;
		this.gift = gift;
	}

	public Review1Book() {}
	
	//멤버변수에 대한 getter/setter 메소드 정의하기	
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
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
	
	public boolean isSoldOut() {
		return isSoldOut;
	}
	
	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public Review1Event getReview1Event() {
		return event;
	}
	
	public void setReview1Event(Review1Event event) {
		this.event = event;
	}
	
	public Review1Gift getReview1Gift() {
		return gift;
	}
	
	public void setReview1Gift(Review1Gift gift) {
		this.gift = gift;
	}
}
