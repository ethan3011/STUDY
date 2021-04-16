package HTA0416.Review6;

import java.util.HashMap;

///*foodsApp1*/
public class HashMapApp {
	
	public static void main(String[] args) {
		
	// foods은 <Key, value>로 이루어져 있다.
	HashMap<String, String> foods = new HashMap<String, String>();
	
	//### Map객체에 key,value 저장하기(put)
	//			key			value
	foods.put("치킨",    "후라이드치킨");
	foods.put("피자", "파파존스피자");
	foods.put("보쌈", "신선보쌈");
	foods.put("짜장", "착짱죽짱");
	foods.put("라면", "진라면");
	foods.put("치킨", "고추바사삭");			// 중복된 Key값이 있으면 마지막 값이 저장된다.
	
	//### Map객체에 저장된 Entry(key와 value의 쌍) 삭제하기 (remove)
	foods.remove("짜장");
	foods.remove("라면");
	
	//### Map객체에 저장된 값 출력해보기 (get)
	String item1 = foods.get("치킨");
	String item2 = foods.get("피자");
	String item3 = foods.get("보쌈");
	String item4 = foods.get("짜장");
	String item5 = foods.get("라면");
	 
	System.out.println("치킨 : " + item1);
	System.out.println("피자 : " + item2);
	System.out.println("보쌈 : " + item3);
	System.out.println("[삭제된]짜장 : " + item4);
	System.out.println("[삭제된]라면 : " + item5);
	System.out.println("=================================================");
	
	}
}
