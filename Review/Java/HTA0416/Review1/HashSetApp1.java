package HTA0416.Review1;

import java.util.HashSet;

//1./*HashSetApp1*/
public class HashSetApp1 {
	
	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<String>();

		//### HashSet 객체에 문자열 저장하기 (add)
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("류관순");
		names.add("안중근");
		names.add("정약용");
		
		//### HashSet 객체에 저장된 문자열 출력하기
		System.out.println("### HashSet 객체에 저장된 문자열 출력하기");
		for(String name:names) {
			System.out.println("이름 : " +name);
		}
	}
}