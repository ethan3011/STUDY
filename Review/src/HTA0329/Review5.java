package HTA0329;





/*class : Product 생성*/
//상품정보를 표현하는 객체에 대한 설계도를 작성하시오
class Product{															// Product 클래스를 생성한다.

//상품번호, 상품카테고리, 상품명, 제조사, 가격, 재고수량, 절판여부에 대한 멤버변수를 정의하시오.
//(no, category, name, maker, price, stock, isSoldOut)
	int no;																// 멤버변수들을 생성한다.
	String category;
	String name;
	String maker;
	int price;
	int stock;
	boolean isSoldOut;

//멤버메소드를 정의하시오
//상품정보를 화면에 출력하는 void printInfo(){...} 메소드를 작성하시오

	void printInfo() {													// printInfo 메소드를 생성한다.
		System.out.println("########## 상품안내 ##########");				// 메소드들에 값을 대입한다.
		System.out.println("상품번호 : " + no);
		System.out.println("상품카테고리 : " + category);
		System.out.println("상품명 : " + name);
		System.out.println("제조사 : " + maker);
		System.out.println("가격 : " + price);
		System.out.println("재고수량 : " + stock);
		System.out.println("절판여부 : " + isSoldOut);
	}
}

public class Review5 {
	public static void main(String[] args) {
		
//상품정보를 표현하는 객체를 생성하고, 객체의 멤버변수에 적절한 상품정보를 저장한다.
		Product p1 = new Product();									// p1이라는 새로운 객체를 만든 후에 Product 주소값을 대입한다. 
		Product p2 = new Product();									// p2라는 새로운 객체를 만든 후에 Product 주소값을 대입한다.
		Product p3 = new Product();									// p3라는 새로운 객체를 만든 후에 Product 주소값을 대입한다.
	
		p1.no = 3;													// p1 객체안에 있는 멤버변수들에게 값을 대입한다.
		p1.category = "치킨";
		p1.name = "양념치킨";
		p1.maker = "네네";
		p1.price = 18000;
		p1.stock = 15;
		p1.isSoldOut = false;
		
		p2. no = 5;													// p2 객체안에 있는 멤버변수들에게 값을 대입한다.
		p2.category = "피자";
		p2.name = "파파존스피자";
		p2.maker = "파파존스";
		p2.price = 25000;
		p2.stock = 0;
		p2.isSoldOut = true;
		
		p3.no = 11;													// p3 객체안에 있는 멤버변수들에게 값을 대입한다.
		p3.category = "라면";
		p3.name = "진라면매운맛";
		p3.maker = "오뚜기";
		p3.price = 400;
		p3.stock = 1800;
		p3.isSoldOut = false;
		
		//위에서 생성한 상품객체에 저장된 상품정보를 화면에 출력하는 메소드를 실행한다.
		p1.printInfo();												// p1의 메소드를 호출한다.
		p2.printInfo();												// p2의 메소드를 호출한다.
		p3.printInfo();												// p3의 메소드를 호출한다.
		
		//상품정보를 3개 저장하는 배열객체를 생성하기
		Product[] pds = new Product[3];								

		//상품정보를 담을 수 있는 pds객체 3개 생성하기							
		Product pds1 = new Product();								
		pds1.no = 22;
		pds1.category = "치킨";
		pds1.name = "순살두마리 치킨";
		pds1.maker = "호식이 두마리 치킨";
		pds1.price = 23000;
		pds1.stock = 40;
		pds1.isSoldOut = false; 
		
		Product pds2 = new Product();
		pds2.no = 24;
		pds2.category = "피자";
		pds2.name = "페퍼로니 피자";
		pds2.maker = "뉴욕피자";
		pds2.price = 30000;
		pds2.stock = 40;
		pds2.isSoldOut = false; 
		
		Product pds3 = new Product();
		pds3.no = 27;
		pds3.category = "라면";
		pds3.name = "무파마탕면";
		pds3.maker = "농심";
		pds3.price = 1200;
		pds3.stock = 0;
		pds3.isSoldOut = true; 
		
		//배열의 0번째 칸부터 2번째 칸에 생성된 Product객체를 저장하기
		pds[0] = pds1;												//pds[0] 배열에 pds1의 값을 대입한다.
		pds[1] = pds2;												//pds[1] 배열에 pds2의 값을 대입한다.
		pds[2] = pds3;												//pds[2] 배열에 pds3의 값을 대입한다.
		
		//모든상품의 이름을 화면에 출력하기
		System.out.println("0번째 상품의 이름 : " + pds[0].name );
		System.out.println("1번째 상품의 이름 : " + pds[1].name );
		System.out.println("2번째 상품의 이름 : " + pds[2].name );
		
		//모든 상품의 정보를 향상된 for문을 사용해서 출력하기
		
		for(Product Total : pds) {									// Total 변수를 생성후 pds 객체에 있는 0번째부터 값을 한개씩 호출한다.
			int totalNumber = Total.no;								// Total(pds객체의값).no 에 있는 0번째부터 값을 한개씩 호출하여 totalNumber 에 대입한다.
			String totalCategory = Total.category;
			String totalNames = Total.name;
			String totalMaker = Total.maker;
			int totalPrice = Total.price;
			int totalStock = Total.stock;
			boolean totalIsSoldOut = Total.isSoldOut;
			System.out.println("===============================");
			System.out.println("상품번호 : " + totalNumber);			// 한개씩 호출받는 값을 출력한다.
			System.out.println("상품카테고리 : " + totalCategory);
			System.out.println("상품이름 : " + totalNames);
			System.out.println("제조사 : " + totalMaker);
			System.out.println("가격 : " + totalPrice);
			System.out.println("재고수량 : " + totalStock);
			System.out.println("절판여부 : " + totalIsSoldOut);		// 0번째 종료후 1번째, 이후 2번째 값이 호출되어 실행된다.
		}
	}
}
