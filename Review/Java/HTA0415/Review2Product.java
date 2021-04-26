package HTA0415;

import java.util.ArrayList;

/*Product*/
public class Review2Product implements Comparable<Review2Product>{
	
	private int no;
	private String name;
	private int price;
	private int point;
	
	//기본생성자
	public Review2Product() {}

	//기본생성자 초기화
	
	public Review2Product(int no, String name, int price, int point) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.point = point;
	}
	
	//getter,setter
	
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

	//hashCode,equals override
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		result = prime * result + point;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review2Product other = (Review2Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		if (point != other.point)
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public int compareTo(Review2Product other) {
		return this.no - other.no;
	}
}
