package HTA0402;

/*Gift class*/
// private String name;
// private int price;

public class Review1Gift {
	
	private String name;
	private int price;
	
	// 기본생성자 정의
	public Review1Gift() {}
	
	// 모든 멤버변수를 초기화하는 생성자 정의 
	public Review1Gift (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// getter/setter 메소드 생성
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
