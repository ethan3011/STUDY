package HTA0401;
// ItemService 클래스의 생성자 메소드에서 items 배열에 미리 Item객체를 여러개 저장한다.
public class Review3ItemService {
	
	Review3Item[] items = new Review3Item[100];
	int position = 0;
		
	Review3ItemService(){
		
			//items 배열에 Item객체 5개 등록하기
			//items[position++]=new Item(100, "노트북","맥북", "애플", 1900000);
		items[position++]=new Review3Item(100, "노트북","맥북", "애플", 1900000);
		items[position++]=new Review3Item(200, "핸드폰","삼성갤럭시S21", "삼성", 1500000);
		items[position++]=new Review3Item(300, "카메라","캐논D50", "캐논", 1000000);
		items[position++]=new Review3Item(400, "게임기","플스5", "소니", 800000);
		items[position++]=new Review3Item(500, "팔찌","에르메스클릭아슈", "에르메스", 2500000);
		}
	
		//items 배열에 저장된 모든 Item객체의 번호, 상품명, 가격을 출력한다.
		void printAllItem(){
			for(Review3Item item : items) {
				if(item == null) {
					break;
				}System.out.println("상품번호 : " + item.no);
				System.out.println("상품명 : " + item.name);
				System.out.println("가격 : " + item.price);
				System.out.println("===================================================");
			}
		}
		
		//items 배열에 저장된 Item객체 중에서 전달받은 Category에 속하는 Item객체의 번호, 상품명, 가격을 출력한다.
		void printItemByCategory(String category) {
			Review3Item foundcategory = null;
			
			for(Review3Item item : items) {
				if(item == null) {
					break;
				}
				if(category.equals(item.category)) {
					foundcategory = item;
					break;
				}
			}
			
			if(foundcategory == null) {
				System.out.println(category + " 과(와) 같은 카테고리의 상품은 존재하지 않습니다. ");
			}else {
				System.out.println("### " + category + " 과(와) 같은 카테고리의 상품 리스트 ###");
				System.out.println("상품번호 : " + foundcategory.no);
				System.out.println("상품명 : " + foundcategory.name);
				System.out.println("가격 : " + foundcategory.price);
				System.out.println("===================================================");
			}
			
			
		}
		
		//items 배열에 저장된 Item객체 중에서 전달받은 상품명을 포함하고 있는 Item객체의 번호, 상품명, 가격을 출력한다.
		//.equals(name)은 상품명이 name과 일치하면 true
		//.contains(name)은 상품명에 name이 포함되어 있으면 true
	            void printItemByName(String name) {
	            	
            	Review3Item foundName = null;
    			
    			for(Review3Item item : items) {
    				if(item == null) {
    					break;
    				}
    				if(name.equals(item.name)) {
    					foundName = item;
    					break;
    				}
    			}
    			
    			if(foundName == null) {
    				System.out.println(name + " 과(와) 같은 이름의 상품은 존재하지 않습니다. ");
    			}else {
    				System.out.println("### " + foundName + " 과(와) 같은 이름의 상품 리스트 ###");
    				System.out.println("상품번호 : " + foundName.no);
    				System.out.println("상품명 : " + foundName.name);
    				System.out.println("가격 : " + foundName.price);
    				System.out.println("===================================================");
    			}

		}
		
		//items 배열에 저장된 Item객체 중에서 전달받은 가격범위에 속하는 Item객체의 번호, 상품명, 가격을 출력한다.
		void printItemByPrice(int minPrice, int maxPrice) {
			
			Review3Item mixMax = null;
			
			for(Review3Item item : items) {
				if(item == null) {
					break;
				}
				if(minPrice <= item.price && item.price <= maxPrice) {
					mixMax = item;
					System.out.println("### " + minPrice + " ~ " + maxPrice + " 사이의 상품 리스트 ###");
					System.out.println("상품번호 : " + mixMax.no);
					System.out.println("상품명 : " + mixMax.name);
					System.out.println("가격 : " + mixMax.price);
					System.out.println("===================================================");
				}
			}
			
			if(mixMax == null) {
				System.out.println(minPrice + " ~ " + maxPrice + " 사이의 상품은 존재하지 않습니다. ");
			}
		}
		
		//items 배열에 저장된 Item객체 중에서 전달받은 번호와 일치하는 Item객체의 모든 정보를 출력한다.
		void printItemDetail(int no) {
			
			Review3Item foundNo = null;
			
			for(Review3Item item : items) {
				if(item == null) {
					break;
				}
				if(no == item.no) {
					foundNo = item;
					break;
				}
			}
			
			if(foundNo == null) {
				System.out.println(no + " 과(와) 같은 번호의 상품은 존재하지 않습니다. ");
			}else {
				System.out.println("### " + foundNo + " 과(와) 같은 번호의 상품 리스트 ###");
				System.out.println("상품번호 : " + foundNo.no);
				System.out.println("카테고리 : " + foundNo.category);
				System.out.println("상품명 : " + foundNo.name);
				System.out.println("제조사 : " + foundNo.maker);
				System.out.println("가격 : " + foundNo.price);
				System.out.println("===================================================");
			}
		}
		
		//items 배열에 전달받은 Item 객체를 등록한다.
		void insertItem(Review3Item item) {
			items[position++] = item;
			
		}
		
		// items 배열에서 전달받은 번호에 해당하는 Item객체를 제거한다.
		// 제거된 자리에는 맨마지막번째에 저장된 Item객체를 옮긴다.(조금 어려움)
		void deleteItem(int no) {
			Review3Item delete = new Review3Item();
			Review3Item forNull = null;
			for(Review3Item item : items) {
				if(item == null) {
					break;
				}
				if(item == items[no]) {
					forNull = items[no];
					items[no] = delete;
				}
			}
			if(forNull == null) {
				System.out.println(no + " 번째의 상품은 존재하지 않습니다. ");
			}else {
				System.out.println(no + " 번째의 상품이 삭제되었습니다.");
			}
		}
}
