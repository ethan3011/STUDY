package HTA0412;

/*ProductApp class*/
public class Review1ProductApp {

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
		
		//사이즈가 S인 바지만 화면에 출력하기
		productBySize(products, "S");
		System.out.println("=================================================================");
		//가격이 50000원인 바지만 화면에 출력하기
		productByPrice(products, 50000);
		System.out.println("=================================================================");
		productByRange(products, 100000, 200000);
		//사이즈가 M이고 가격이 1만원 이상 5만원이하인 바지만 화면에 출력하기
		System.out.println("=================================================================");
		productBySizeAndRange(products, "M", 10000, 50000);

	}
	
	//배열과 사이즈를 전달받아서 사이즈에 해당하는 상품만 출력하기
	public static void productBySize(Review1Product[] products, String size) {
		for(Review1Product item :products) {
			if(size.equals(item.getSize())) {
				System.out.println(item.getName() + ", " + item.getSize() + ", " + item.getPrice());
			}
		}
	}
	
	//배열과 가격을 전달받아서 가격에 해당하는 상품만 출력하기
	
	public static void productByPrice(Review1Product[] products, int price) {
		for(Review1Product item :products) {
			if(price == item.getPrice()) {
				System.out.println(item.getName() + ", " + item.getSize() + ", " + item.getPrice());
			}
		}
	}
	
	//배열과 최소가격, 최대가격을 전달받아서 해당 가격범위에 속하는 상품만 출력하기
	
	public static void productByRange(Review1Product[] products, int minPrice, int maxPrice) {
		for(Review1Product item:products) {
			if(item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
				System.out.println(item.getName() + ", " + item.getSize() + ", " + item.getPrice());
			}
		}
	}
	
	//배열과 사이즈, 최소가격, 최대가격을 전달받아서 해당 사이즈에 속하고, 해당 가격범위에 속하는 상품만 출력하기
	public static void productBySizeAndRange(Review1Product[] products, String size, int minPrice, int maxPrice) {
		for(Review1Product item :products) {
			if(size.equals(item.getSize()) && item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
				System.out.println(item.getName() + ", " + item.getSize() + ", " + item.getPrice());
			}
		}
	}
}
