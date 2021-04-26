package HTA0401;
// Item 클래스에 생성자를 정의한다.
public class Review3Item {
	
	//상품번호, 카테고리, 상품명, 제조사, 가격
		int no;
		String category;
		String name;
		String maker;
		int price;
		
	//기본생성자 정의하기
		Review3Item(){}
		
	//모든 멤버변수를 초기화하는 생성자를 정의하기
		Review3Item(int no, String category, String name, String maker, int price){
			this.no = no;
			this.category = category;
			this.name = name;
			this.maker = maker;
			this.price = price;
		}
}
