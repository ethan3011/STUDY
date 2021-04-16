package HTA0416.Review3;

import java.util.HashSet;

/*HashSetApp3*/
public class HashSetApp3 {
	
	public static void main(String[] args) {
		HashSet<Contact> contacts = new HashSet<Contact>();
		
		//Hashset객체에 값 저장 ("홍길동", "010-1111-1111", "hong@gmail.com")
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		contacts.add(new Contact("홍길동", "010-1111-1111", "hong@gmail.com"));
		
		
		//### 연락처 정보 출력하기 (향상된 for문)
		// 중복된 저장을 피하기 위하여 Contact에 equals를 재정의 하였다.
		for(Contact item:contacts) {
			System.out.println("이름 : " + item.getName());
			System.out.println("연락처 : " + item.getTel());
			System.out.println("이메일 : " + item.getEmail());
		}
	}
}
