package HTA0419.Review1;

import java.util.HashMap;
import java.util.Set;

/*HashMapApp2*/
public class HashMapApp2 {
	
	public static void main(String[] args) {
		
		HashMap<String, User> users = new HashMap<>();
		users.put("hong", new User("hong","zxcv1234","홍길동"));
		users.put("kim", new User("kim","zxcv1234","김유신"));
		users.put("kang", new User("kang","zxcv1234","강감찬"));
		users.put("lee", new User("lee","zxcv1234","이순신"));
		users.put("ryu", new User("ryu","zxcv1234","유관순"));
		
		//Map객체에 저장된 데이터(객체) 조회하기
		User user1 = users.get("hong");
		User user2 = users.get("kim");
		User user3 = users.get("kang");
		User user4 = users.get("lee");
		User user5 = users.get("ryu");
		
		//Map객체의 모든 key값을 조회하기
		Set<String> keys = users.keySet();
		System.out.println("key 객체모음 : " + keys);
		
		
		//Set<String> keys(조회된 key값)로 Map에 저장된 데이터 전부 조회하기
		for(String item :keys) {
			User k = users.get(item);
			System.out.println("["+item+"]" + k.getName() + ", " + k.getPwd() + ", " + k.getName());
		}
	}
	
	public static class User{
		String id;
		String pwd;
		String name;
		
		public User(String id, String pwd, String name) {
			super();
			this.id = id;
			this.pwd = pwd;
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
