package HomeWork0414;

public class Review1Product {
	
	private int no;
	private String name;
	private int price;
	private int point;
	
	public Review1Product() {}

	public Review1Product(int no, String name, int price, int point) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.point = point;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
