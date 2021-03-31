package HTA0330;

/*class : Product 생성*/
//상품정보를 표현하는 객체에 대한 설계도를 작성하시오
class Product{										// Product 클래스를 생성한다.

//상품번호, 상품카테고리, 상품명, 제조사, 가격, 재고수량, 절판여부에 대한 멤버변수를 정의하시오.
//(no, category, name, maker, price, stock, isSoldOut)
	int no;										// 멤버변수들을 생성한다.
	String category;
	String name;
	String maker;
	int price;
	int stock;
	boolean isSoldOut;

//멤버메소드를 정의하시오
//상품정보를 화면에 출력하는 void printInfo(){...} 메소드를 작성하시오

	void printInfo() {								// printInfo 메소드를 생성한다.
		System.out.println("########## 상품정보 ##########");			// 메소드들에 값을 대입한다.
		System.out.println("상품번호 : " + no);
		System.out.println("상품카테고리 : " + category);
		System.out.println("상품명 : " + name);
		System.out.println("제조사 : " + maker);
		System.out.println("가격 : " + price);
		System.out.println("재고수량 : " + stock);
		System.out.println("절판여부 : " + isSoldOut);
	}
}

	public class Review1 {
		public static void main(String[] args) {
			
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
		pds[0] = pds1;								//pds[0] 배열에 pds1의 값을 대입한다.
		pds[1] = pds2;								//pds[1] 배열에 pds2의 값을 대입한다.
		pds[2] = pds3;								//pds[2] 배열에 pds3의 값을 대입한다.
//		######################################### 시작 #########################################		
//		 1. 3월 29일에 복습한 ProductApp2에 이어서 작업
//		### products 배열에 저장된 상품중에서 재고수량이 25개 이상인 상품의 정보만 출력하기
		for(Product overStock:pds) {
			if(overStock.stock >= 25) {
				System.out.println("########## 재고가 25개 이상의 ##########");
				overStock.printInfo();
			}
		}
		
//		//### products 배열에 저장된 상품중에서 제품의 가격이 1만원 이상인 상품의 정보만 출력하기
		for(Product overPrice:pds) {
			if(overPrice.price >= 10000) {
				System.out.println("########## 만원 이상 ##########");
				overPrice.printInfo();
			}
		}
		
		//### products 배열에 저장된 상품중에서 농심에서 제조한 상품정보만 출력하기
		System.out.println("########## 농심 브랜드 ##########");
		for(Product onlyMaker: pds) {
			if("농심".equals(onlyMaker.maker)) {
				onlyMaker.printInfo();
			}

		}
		}
	}
