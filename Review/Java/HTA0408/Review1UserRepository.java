package HTA0408;

/*interface UserRepository class*/
public interface Review1UserRepository {

	/**
	 * 사용자정보를 전달받아서 저장소에 저장한다.
	 * @param user 사용자정보가 저장된 User 객체
	 */
	void saveUser(Review1User user);

	/**
	 * 지정된 아이디의 사용자를 저장소에서 삭제한다.
	 * @param id 삭제할 사용자 아이디
	 */
	void deleteUser(String id);
		
	/**
	 * 변경된 정보를 포함하고 있는 사용자정보를 전달받아서 저장소에 반영한다.
	 * @param user 변경된 사용자 정보를 포함하고 있는 User객체
	 */
	void changeUserInfo(Review1User user);

	/**
	 * 지정된 아이디의 사용자정보를 저장소에서 찾아서 반환한다.
	 * @param id 조회할 사용자 아이디
	 * @return 사용자정보를 포함하고 있는 User객체
	 */
	Review1User searchUserInfo(String id);
}
