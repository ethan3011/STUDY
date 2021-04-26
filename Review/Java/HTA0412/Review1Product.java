package HTA0412;

/*Product class*/

public class Review1Product {
	
	//private name, size, price 생성

	private String name;
	private String size;
	private int price;
	
	//생성자(name,size,price) 생성
	public Review1Product(String name, String size, int price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	//getter 생성
	public String getName() {
		return name;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	

}
