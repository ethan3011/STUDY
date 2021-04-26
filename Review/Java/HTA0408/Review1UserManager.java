package HTA0408;

/*UserManager class*/
public class Review1UserManager {
	
	//사용자정보 등록/삭제/변경/조회 기능을 제공하는 객체에 대한 표준(인터페이스)사용

	//private UserRepository 참조할 참조변수
	private Review1UserRepository repo;
	
	//setter 생성
	public void setRepo(Review1UserRepository repo) {
		this.repo = repo;
	}
	//기본생성자
	public Review1UserManager() {}
	

	//기본생성자 UserRepository 매개변수
	public Review1UserManager(Review1UserRepository repo) {
		this.repo = repo;
		
	}

	//새 사용자 등록하기 (매개변수 id, name)
	public void addNewUser(String id, String name) {
		Review1User savedUser = repo.searchUserInfo(id);
		
		if(savedUser != null) {
			System.out.println("[오류] 이미["+name+"] 이름으로 생성된 아이디가 있습니다.");
			return;
		} 
		Review1User user = new Review1User(id, name);
		repo.saveUser(user);
		System.out.println("[성공] ID: " +id+ " / NAME : " + name + " 으로 새로운 계정이 생성되었습니다.");
	}
	
	//사용자 정보 삭제하기 (매개변수 id)
	public void deleteuser(String id) {
		Review1User savedUser = repo.searchUserInfo(id);
		if(savedUser == null) {
			System.out.println("[에러] ["+id+"]는 존재하지 않는 아이디 입니다.");
		}else {
			repo.deleteUser(id);
			System.out.println("[성공] ID : ["+id+"]는(은) 삭제되었습니다.");
		}
	}

	//사용자 정보 조회하기 (매개변수 id)
	public Review1User searchUser(String id) {
		Review1User savedUser = repo.searchUserInfo(id);
			return  savedUser;
	}
	
	//사용자 정보 변경하기 (매개변수 user)
	public void changeUserInfo(Review1User user) {
		Review1User savedUser = repo.searchUserInfo(user.getId());
		if(savedUser == null) {
			System.out.println("[오류]입력하신 사용자는 존재하지 않습니다.");
		}else {
			repo.changeUserInfo(user);
			System.out.println("[성공] ["+user.getName()+"]님의 정보는 수정되었습니다.");
		}
	}
}
