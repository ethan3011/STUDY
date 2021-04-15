package HTA0415;

import java.util.ArrayList;
import java.util.Iterator;

/*ArrayListApp3*/
public class Review3ArrayListApp3 {

	public static void main(String[] args) {
		
		// 3.ArrayList - Iterator
		ArrayList<String> names = new ArrayList<String>();
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("유관순");
		names.add("안창호");
		names.add("유관순");	
		names.add("안중근");

		//### 이름에 '이'가 포함된 사람을 삭제하기 (Iterator, while, hasNext, next)
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			if(name.startsWith("이")) {
				iter.remove();
			}
		}
		
		//향상된 for문으로 사람이름 출력하기
		for(String name:names) {
			System.out.println(name);
		}
	}
}