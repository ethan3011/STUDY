package HTA0408;

/*UserManagerApp class*/
public class UserManagerApp {
	
	//main
	public static void main(String[] args) {

		//UserRepository의 구현객체 생성하기
		UserRepository repoArr = new UserArrayRepository();
		UserRepository repoArr2 = new UserArrayRepository();
				
		//UserManager객체 생성
		UserManager usermanager = new UserManager();
		
		// 방법1
		//setter 메소드를 이용해서 UserRepository구현객체를 UserManager의 repo변수에 전달하기
		usermanager.setRepo(repoArr);
		
		//### 아이디로 사용자 조회하기
		System.out.println("###아이디로 사용자 조회하기");
		User user1 = usermanager.searchUser("kim");
		if(user1 != null) {
			System.out.println("조회하신 아이디는 ID : "+user1.getId() + "/ NAME : "+user1.getName()+ " 입니다.");
		}else {
			System.out.println("[오류] 입력하신 ID는 존재하지 않습니다.");
		}
		
		//### 신규 사용자 등록하기
		System.out.println("###신규 사용자 등록하기");
		usermanager.addNewUser("hwang", "황갑수");
		
		//### 등록된 사용자 삭제하기
		System.out.println("###등록된 사용자 삭제하기");
		usermanager.deleteuser("hong");
	
		//### 다른 사용자 그대로 있는지 확인하기
		System.out.println("### 다른 사용자 그대로 있는지 확인하기");
		User user2 = usermanager.searchUser("kim");
		if(user2 != null) {
			System.out.println("조회하신 아이디는 ID : "+user2.getId() + " / NAME : "+user2.getName()+ " 입니다.");
		}else {
			System.out.println("[오류] 입력하신 ID는 존재하지 않습니다.");
		}
		User user3 = usermanager.searchUser("hwang");
		if(user3 != null) {
			System.out.println("조회하신 아이디는 ID : "+user3.getId() + " / NAME : "+user3.getName()+ " 입니다.");
		}else {
			System.out.println("[오류] 입력하신 ID는 존재하지 않습니다.");
		}
		User user4 = usermanager.searchUser("nam");
		if(user4 != null) {
			System.out.println("조회하신 아이디는 ID : "+user4.getId() + " / NAME : "+user4.getName()+ " 입니다.");
		}else {
			System.out.println("[오류] 입력하신 ID는 존재하지 않습니다.");
		}
		
		// 방법2
		UserManager usermanager2 = new UserManager(repoArr2);
		
		//### 아이디로 사용자 조회하기
		System.out.println("### 아이디로 사용자 조회하기");
		User user9 = usermanager2.searchUser("kim");
		if(user9 != null) {
			System.out.println("조회하신 아이디는 ID : " + user9.getId() + " / NAME : " + user9.getName() + " 입니다.");
		}else {
			System.out.println("[오류] 입력하신 ID는 존재하지 않습니다.");
		}
		
		//### 신규 사용자 등록하기
		System.out.println("###신규 사용자 등록하기");
		usermanager2.addNewUser("gam", "감튀");
		
		
		//### 등록된 사용자 삭제하기
		System.out.println("###등록된 사용자 삭제하기");
		usermanager2.deleteuser("gam");		
		
		//### 다른 사용자 그대로 있는지 확인하기
		System.out.println("### 다른 사용자 그대로 있는지 확인하기");
		User user8 = usermanager2.searchUser("gam");
		if(user8 != null) {
			System.out.println("[성공]"+"\n"+"ID : " + user8.getId() + "\n" + "NAME : " + user8.getName());
		}else {
			System.out.println("[오류] 입력하신 아이디는 존재하지 않습니다.");
			System.out.println();
		}
		
		User user7 = usermanager2.searchUser("kim");
		if(user7 != null) {
			System.out.println("[성공]"+"\n"+"ID : " + user7.getId() + "\n" + "NAME : " + user7.getName());
			System.out.println();
		}else {
			System.out.println("[오류] 입력하신 아이디는 존재하지 않습니다.");
		}
		
		User user6 = usermanager2.searchUser("nam");
		if(user6 != null) {
			System.out.println("[성공]"+"\n"+"ID : " + user6.getId() + "\n" + "NAME : " + user6.getName());
			System.out.println();
		}else {
			System.out.println("[오류] 입력하신 아이디는 존재하지 않습니다.");
		}
		
	}
}
