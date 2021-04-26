package HTA0415;

import java.util.ArrayList;
import java.util.Collections;

/*기존에 있던 Product impl Comparable<Product>*/
//compareTo override (this.no - other.no)
/*ArrayListApp5*/
public class Review5ArrayListApp5 {
	
	public static void printAll(Review2Product item) {
		System.out.println("[### 상품정보 ###]");
		System.out.println("상품번호 : " + item.getNo());
		System.out.println("상품이름 : " + item.getName());
		System.out.println("상품가격 : " + item.getPrice());
		System.out.println("적립포인트 : " + item.getPoint());
		System.out.println();
	}

	public static void main(String[] args) {
		
		ArrayList<Review2Product> products = new ArrayList<Review2Product>();
		products.add(new Review2Product(10,"노트북",1200000,120));
		products.add(new Review2Product(100,"이어폰",400000,45));
		products.add(new Review2Product(160,"스피커",600000,60));
		products.add(new Review2Product(30,"태블릿",1200000,120));
		products.add(new Review2Product(70,"갤럭시",1300000,130));
		products.add(new Review2Product(20,"아이폰",1600000,150));

		//상품번호 기준 오름차순 정렬 sort
		System.out.println("### 상품번호기준 오름차순 정렬");
		Collections.sort(products);
		for(Review2Product item :products) {
			Review5ArrayListApp5.printAll(item);
		}
		
		//순서 뒤집기 reverse
		Collections.reverse(products);
		
		//향상된 for문 출력
		System.out.println("### 상품번호기준 내림차순 출력");
		for(Review2Product item :products) {
			Review5ArrayListApp5.printAll(item);
		}
	}
}