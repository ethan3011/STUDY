package HomeWork0414;

public class Review1Order {

	private Review1Product item;		// 주문상품
	private int amount;					// 주문수량
	
	public Review1Order() {}

	public Review1Order(Review1Product item, int amount) {
		super();
		this.item = item;
		this.amount = amount;
	}

	public Review1Product getItem() {
		return item;
	}

	public void setItem(Review1Product item) {
		this.item = item;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
