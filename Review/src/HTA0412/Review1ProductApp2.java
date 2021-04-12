package HTA0412;

/*ProductApp2 class*/
public class Review1ProductApp2 {
	
	//main
		public static void main(String[] args) {
			
			Review1Product[] products = new Review1Product[10];
			products[0] = new Review1Product("청바지", "S", 100000);
			products[1] = new Review1Product("반바지", "M", 50000);
			products[2] = new Review1Product("운동용바지", "L", 70000);
			products[3] = new Review1Product("정장바지", "XL", 160000);
			products[4] = new Review1Product("치마", "S", 80000);
			products[5] = new Review1Product("스커트", "M", 120000);
			products[6] = new Review1Product("린넨바지", "L", 30000);
			products[7] = new Review1Product("카고바지", "XL", 200000);
			products[8] = new Review1Product("나팔바지", "S", 110000);
			products[9] = new Review1Product("면바지", "M", 40000);
			
			//사이즈를 기준으로 재정의하는 메소드
			Predicate p1 = new Predicate() {
				//상품의 사이즈가 "S"면 true를 반환하는 익명객체
				@Override
				public boolean test(Review1Product item) {
					return "S".equals(item.getSize());
				}
			};
			
			//사이즈를 기준으로 재정의하는 메소드
			Predicate p2 = new Predicate() {
				@Override
				public boolean test(Review1Product item) {
					//상품의 가격이 5만원이면 true를 반환하는 익명객체
					return item.getPrice() == 50000;
				}
			};
			
			Predicate p3 = new Predicate() {

				@Override
				public boolean test(Review1Product item) {
					return item.getPrice() >= 50000 && item.getPrice() <=100000;
				}
				
			};
			
			Predicate p4 = new Predicate() {

				@Override
				public boolean test(Review1Product item) {
					return "S".equals(item.getSize())&& item.getPrice() >= 50000 && item.getPrice() <100000;
				}
				
			};
			
			//### 사이즈가 S인 상품만 출력
			System.out.println("### 사이즈가 S인 상품만 출력");
			printProducts(products, p1);
			System.out.println();
			
			//### 가격이 5만원인 상품만 출력
			System.out.println("### 가격이 5만원인 상품만 출력");
			printProducts(products, p2);
			System.out.println();
			
			//### 가격이 5만원이상 10만원 이하인 상품만 출력
			System.out.println("### 가격이 5만원이상 10만원 이하인 상품만 출력");
			printProducts(products, p3);
			System.out.println();
			
			//###사이즈가 S고 가격이 5만원 이상 10만원 미안이 상품만 출력
			System.out.println("###사이즈가 S고 가격이 5만원 이상 10만원 미안이 상품만 출력");
			printProducts(products, p4);
			System.out.println();
			
			//### 람다 표현식으로 Predicate인터페이스 구현하기
			System.out.println("### 람다 표현식으로 Predicate인터페이스 구현하기");
			printProducts(products, item -> "M".equals(item.getSize()));
			System.out.println();
			
			//### 사이즈가 XL인 상품만 출력
			System.out.println("### 사이즈가 XL인 상품만 출력");
			printProducts(products, new Predicate() {
				@Override
				public boolean test(Review1Product item) {
					return "XL".equals(item.getSize());
				}
			});
			System.out.println();
		}
	
	//static interface Predicate 생성 boolean타입의 test(Product item)메소드 생성
	public static interface Predicate {
		boolean test(Review1Product item);
	}
	
	//public static void printProducts(Product[] item, Predicate p){
	public static void printProducts(Review1Product[] items, Predicate p) {
		for(Review1Product product : items) {
			//전달받은 Predicate 인터페이스의 구현객체에 구현된 test(item) 메소드를 실행한다.
			if(p.test(product)) {
				System.out.println(product.getName() + ", " + product.getSize() + ", " + product.getPrice());
			}
		}
	}
}
