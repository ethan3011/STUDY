package HTA0415;

import java.util.ArrayList;
import java.util.Iterator;
/*ArrayListApp4*/
public class Review4ArrayListApp4 {

	public static void main(String[] args) {
		
		//4.ArrayList - Iterator
		ArrayList<Review2Product> products = new ArrayList<Review2Product>();
				
		products.add(new Review2Product(10, "노트북", 200, 2));
		products.add(new Review2Product(20, "핸드폰", 160, 1));
		products.add(new Review2Product(30, "태블릿", 85, 1));
		products.add(new Review2Product(40, "스마트워치", 50, 1));

		//### Iterator를 사용해서 ArrayList객체에 저장된 Review2Product객체 조회하기
		Iterator<Review2Product> iter = products.iterator();
		while(iter.hasNext()) {
			Review2Product p = iter.next();
			System.out.println("상품번호 : " + p.getNo());
			System.out.println("상품이름 : " + p.getName());
			System.out.println("상품가격 : " + p.getPrice());
			System.out.println("적립포인트 : " + p.getPoint());
			System.out.println();
		}

	}
}