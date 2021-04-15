package HTA0415;

import java.util.ArrayList;

/*ArrayListApp2*/
public class Review2ArrayListApp2 {

	public static void main(String[] args) {
		
		ArrayList<Review2Product> products = new ArrayList<Review2Product>();
		
		
		//### ArrayList 객체에 Product객체 저장하기
		System.out.println("### ArrayList 객체에 Product객체 저장하기");
		products.add(new Review2Product(10, "후라이드치킨", 15000, 500));
		products.add(new Review2Product(20, "양념치킨", 16000, 510));
		products.add(new Review2Product(30, "고추치킨", 17000, 520));
		products.add(new Review2Product(40, "매운맛치킨", 18000, 530));
		products.add(new Review2Product(50, "간장치킨", 19000, 540));
		
		
		//### ArrayList 객체에 저장된 Product객체의 갯수조회하기
		System.out.println("### ArrayList 객체에 저장된 Product객체의 갯수조회하기");
		int size = products.size();
		System.out.println("객체갯수 : " + size );
		
		
		//### ArrayList 객체에 저장된 Product객체의 정보 출력하기
		System.out.println("### ArrayList 객체에 저장된 Product객체의 정보 출력하기");
		System.out.println("===============================================================================");
		for(Review2Product product :products) {
			System.out.println("상품번호 : " + product.getNo());
			System.out.println("상품이름 : " + product.getName());
			System.out.println("상품가격 : " + product.getPrice());
			System.out.println("적립포인트 : " + product.getPoint());
			System.out.println();
		}
		System.out.println("===============================================================================");
		
		
		//### 특정한 객체를 저장하고 있는지 확인하기
		System.out.println("### 특정한 객체를 저장하고 있는지 확인하기");
		Review2Product tmp = new Review2Product(40, "매운맛치킨", 18000, 530);
		boolean isExist = products.contains(tmp);
		System.out.println("tmp는 products객체에 존재하는가 ? " + isExist);
		
		
		//### ArrayList 객체에 저장된 모든 객체 삭제하기
		System.out.println("### ArrayList 객체에 저장된 모든 객체 삭제하기");
		products.clear();
		
		
		//### ArrayList 객체에 저장된 Product의 갯수
		System.out.println("### ArrayList 객체에 저장된 Product의 갯수");
		System.out.println("갯수 : " + products.size());
	}
}
