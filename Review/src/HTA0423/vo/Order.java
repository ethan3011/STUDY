package HTA0423.vo;

public class Order implements Comparable<Order>{

	private String userId;		// 주문한 사용자 아이디
	private int bookNo;			// 주문한 책번호
	private int amount;			// 주문수량
	
	public Order() {}
	public Order(String userId, int bookNo, int amount) {
		this.userId = userId;
		this.bookNo = bookNo;
		this.amount = amount;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public int compareTo(Order other) {
		return this.bookNo - other.bookNo;
	}
}
