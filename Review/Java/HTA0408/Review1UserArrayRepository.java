package HTA0408;

/*UserArrayRepository implements UserRepository class*/
public class Review1UserArrayRepository implements Review1UserRepository{
	
	//private User[100] 배열객체 생성
	private Review1User[] users = new Review1User[100];
	
	//private position 0으로 초기화
	private int position = 0;

	//기본생성자에 배열 객체 생성 (테스트용 3개)
	public Review1UserArrayRepository(){
		users[position++] = new Review1User("kim", "김첨지");
		users[position++] = new Review1User("hong", "홍치킨");
		users[position++] = new Review1User("nam", "남피자");
	}

	//새 사용자 등록
	@Override
	public void saveUser(Review1User user) {
		users[position++] = user;
	}
	
	//유저 정보 삭제
	@Override
	public void deleteUser(String id) {
		int foundIndex = -1;
		for(int i=0; i<position; i++) {
			Review1User user = users[i];
			if(user.getId().equals(id)) {
				foundIndex = i;
				break;
			}
		}
		
		if(foundIndex != -1) {
			
			if(foundIndex == position-1) {
				users[foundIndex] = null;
				position--;
			}else {
				users[foundIndex] = users[position-1];
				users[position-1] = null;
				position--;	
			}
		}
	}
	
	//유저 정보 변경
	@Override
	public void changeUserInfo(Review1User user) {
		Review1User savedUser = this.searchUserInfo(user.getId());
		
		if(savedUser != null) {
			savedUser.setId(user.getId());
			savedUser.setName(user.getName());
		}
	}

	//사용자 정보 조회
	@Override
	public Review1User searchUserInfo(String id) {
		Review1User user = null;
		
		for(Review1User item :users) {
			if(item == null){
				break;
			}
			if(item.getId().equals(id)) {
				user = item;
				break;				
			}
		}
		return user;
	}	
}