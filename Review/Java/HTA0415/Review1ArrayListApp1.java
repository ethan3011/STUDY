package HTA0415;

import java.util.ArrayList;

/*ArrayListApp1*/
public class Review1ArrayListApp1 {

	public static void main(String[] args) {
		
		//ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>();
		
		// ArrayList 객체에 데이터(문자열 데이터) 저장하기 (add)
		names.add("강냉이");
		names.add("강낭콩");
		names.add("강감찬");
		names.add("강");
		names.add("강가");
		names.add("강릉");
		
		// ArrayList 객체에 저장된 데이터 갯수 조회하기 (size)
		System.out.println("ArrayList객체에 저장된 데이터 갯수 : " + names.size());
		
		// ArrayList 객체에 저장된 데이터 전부 출력하기
		System.out.println("### ArrayList 객체에 저장된 데이터 전부 출력하기");
		for(String item :names) {
			
			System.out.println(item);
		}
		
		//ArrayList객체에 "강릉" 데이터가 존재하는지 확인하기 (contain)
		boolean isSaved = names.contains("강릉");
		System.out.println("ArrayList 객체 안에 \"강릉\"이 포함되어 있는가? " + isSaved);
		
		//ArrayList객체에서 "강감찬" 데이터 삭제하기 (remove)
		System.out.println("ArrayList객체에서 \"강감찬\" 데이터 삭제하기");
		names.remove("강감찬");
		for(String item :names) {
			System.out.println(item);
		}
		
		//ArrayList객체에 저장된 모든 데이터 삭제하기 (clear)
		System.out.println("ArrayList객체에 저장된 모든 데이터 삭제하기");
		names.clear();
		for(String item :names) {
			System.out.println(item);
		}
		
		
		// ArrayList가 비어있는지 확인하기 (isEmpty)
		boolean isempty = names.isEmpty();
		System.out.println("ArrayList가 비어있는가? " + isempty);
	}
}
