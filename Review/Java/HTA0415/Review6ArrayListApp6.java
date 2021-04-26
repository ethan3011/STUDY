package HTA0415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import HomeWork0413.Review3Product;




/*ArrayListApp6*/
public class Review6ArrayListApp6 {
	
	public static void printProduct(Review2Product product) {
		System.out.println("[### 상품정보 ###]");
		System.out.println("상품번호 : " + product.getNo());
		System.out.println("상품이름 : " + product.getName());
		System.out.println("상품가격 : " + product.getPrice());
		System.out.println("적립포인트 : " + product.getPoint());
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
		
		
		//### 상품번호순으로 정렬
		Comparator<Review2Product> sortByNo = new Comparator<Review2Product>(){

			@Override
			public int compare(Review2Product o1, Review2Product o2) {
				return o1.getNo() - o2.getNo();
			}
		};
		System.out.println("### 상품번호순으로 정렬");
		Collections.sort(products, sortByNo);
		for(Review2Product item :products) {
			Review6ArrayListApp6.printProduct(item);
		}
		
		//### 이름순으로 정렬 -Comparator, sort(Review2Products,nameComparactor)
		Comparator<Review2Product> sortByName = new Comparator<Review2Product>() {

			@Override
			public int compare(Review2Product o1, Review2Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		System.out.println("### 이름순으로 정렬");
		Collections.sort(products, sortByName);
		for(Review2Product item :products) {
			Review6ArrayListApp6.printProduct(item);
		}
		
		//### 가격순으로 정렬 -Comparator, sort(Review2Products,priceComparactor)
		Comparator<Review2Product> sortByPrice = new Comparator<Review2Product>() {

			@Override
			public int compare(Review2Product o1, Review2Product o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		System.out.println("### 가격순으로 정렬");
		Collections.sort(products, sortByPrice);
		for(Review2Product item :products) {
			Review6ArrayListApp6.printProduct(item);
		}
		
		
		//### 적립포인트순으로 정렬하기 -람다식
		System.out.println("### 적립포인트순으로 정렬하기 -람다식");
		Collections.sort(products, (o1, o2) -> o1.getPoint() - o2.getPoint());
		for(Review2Product item :products) {
			Review6ArrayListApp6.printProduct(item);
		}
	}
}
