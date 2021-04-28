package VoucherWeb.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import VoucherWeb.vo.User;

public class UserRepository {
	
	/**
	 * 유저 기본배열 생성
	 */
	List<User> db = new ArrayList<User>();
	
	/**
	 * 기본생성자에 파일에서 유저정보를 가져오게 한다.
	 */
	public UserRepository() {
		loadData();
	}
	
	/**
	 * 모든 유저 정보를 가져온다
	 * @return 모든유저정보
	 */
	public List<User> getAllUser() {
		return db;
	}
	
	/**
	 * [관리자모드]신규 유저를 추가한다.
	 * @param user 신규유저정보
	 */
	public void addNewUser(User user) {
		db.add(user);
	}
	
	/**
	 * [관리자모드]유저정보를 삭제한다.
	 * @param id 삭제할 유저아이디
	 * @param password 삭제할 유저비밀번호
	 */
	public void deleteUser(String id, String password) {
		Iterator<User> value = db.iterator();
		
		while(value.hasNext()) {
			User nextValue = value.next();
			if(nextValue.getId().equals(id) && nextValue.getPassword().equals(password)) {
				value.remove();
			}
		}
	}
	
	/**
	 * 이름으로 조회된 유저정보를 가져온다.
	 * @param name 조회할 이름
	 * @return 조회된 객체, 없을시 null 을 반환
	 */
	public User getUserByName(String name) {
		List<User> users = getAllUser();
		for(User user:users) {
			if(user.getName().equals(name)) {
				return user;
			}
		}
		return null;
	}
	

	/**
	 * 데이터를 불러온다.
	 */
	private void loadData() {
		try(FileReader fr = new FileReader("Java/VoucherWeb/User.csv");
				BufferedReader br = new BufferedReader(fr)){
			
			String text = null;
			while((text=br.readLine()) != null){
				
				String[] value = text.split(",");
				
				String id = value[0];
				String password = value[1];
				String name = value[2];
				int balance = Integer.parseInt(value[3]);
				int point = Integer.parseInt(value[4]);
				String grade = value[5];
				
				User user = new User(id, password, name, balance, point, grade);
				db.add(user); 
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 데이터를 저장한다.
	 */
	public void saveData() {
		try(PrintWriter pw = new PrintWriter("Java/VoucherWeb/User.csv")){
			
			for(User user:db) {
			StringBuilder sb = new StringBuilder();
			sb.append(user.getId())
			.append(",")
			.append(user.getPassword())
			.append(",")
			.append(user.getName())
			.append(",")
			.append(user.getBalance())
			.append(",")
			.append(user.getPoint())
			.append(",")
			.append(user.getGrade());
			
			String text = sb.toString();
			pw.println(text);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
