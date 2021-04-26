package HTA0420.Review1;

import java.util.ArrayList;
import java.util.Iterator;

public class UserService {

	ArrayList<User> users = new ArrayList<User>();
	
	public UserService() {
		users.add(new User("hong", "홍길동", "1234"));
		users.add(new User("kim", "김유신", "1234"));
		users.add(new User("lee", "이순신", "1234"));
		users.add(new User("kang", "강감찬", "1234"));
		users.add(new User("ryu", "류관순", "1234"));
	}
	
	// 새 사용자(아이디, 이름, 비밀번호 포함) 등록기능
	// 동일한 아이디로 가입된 사용자가 존재하면 UserAlreadyExistsException을 던진다.
	
	public void insertUser(User user) {
		User savedUser = getUserById(user.getId());
		if(savedUser != null) {
			throw new UserAlreadyExistsException(user.getId());
		}
		users.add(user);
	}
	
	// 아이디를 전달받아서 해당 아이디로 가입한 사용자를 반환하는 기능
	// 아이디에 해당하는 사용자가 존재하지 않으면 UserNotFoundException을 던진다.
	public User getUserById(String userId) {
		for(User item :users) {
			if(userId.equals(item.getId())) {
			return item;
			}
		}
		return null;
	}
	
	// 아이디, 이전 비밀번호, 새 비밀번호를 전달받아서 비밀번호를 변경하는 기능
	// 아이디에 해당하는 사용자가 존재하지 않으면 UserNotFoundException을 던진다.
	// 비밀번호가 일치하지 않으면 PasswordMismatchException을 던진다.
	public void changePassword(String id, String oldpwd, String newPwd) {
		User savedUser = getUserById(id);
		if(savedUser == null) {
			throw new UserNotFoundException(id);
		}
		if(!savedUser.getPwd().equals(oldpwd)) {
			throw new PasswordMismatchException(id);
		}
		savedUser.setPwd(newPwd);
	}

	// 아이디를 전달받아서 해당 아이디로 가입한 사용자를 삭제하는 기능
	// 아이디에 해당하는 사용자가 존재하지 않으면 UserNotFoundException을 던진다.
	public void deleteUser(String id, String pwd) {
		User savedUser = getUserById(id);
		if(savedUser == null) {
			throw new UserNotFoundException(id);
		}
		if(!savedUser.getPwd().equals(pwd)) {
			throw new PasswordMismatchException(id);
		}
		
		Iterator<User> iter = users.iterator();
		while(iter.hasNext()) {
			User item = iter.next();
			if(item.getId().equals(id)) {
				iter.remove();
				break;
			}
		}
	}
	
	public User searchUserInfo(String id, String name) {
		User foundUser = getUserById(id);
		if(foundUser == null) {
			throw new UserNotFoundException(id);
		}
		if(!foundUser.getName().equals(name)) {
			throw new UserDifferentName(id);
		}
		if(!foundUser.getId().equals(id)) {
			throw new UserDifferentId(id);
		}
		return foundUser;
	}
}