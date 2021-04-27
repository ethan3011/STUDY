package VoucherWeb.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import VoucherWeb.vo.User;

public class UserRepository {
	
	List<User> db = new ArrayList<User>();
	
	public UserRepository() {
		loadData();
	}

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
	
	public void saveData() {
		try(PrintWriter pw = new PrintWriter("Java/VoucherWeb/User.csv")){
			
			for(User user:db) {
			StringBuilder sb = new StringBuilder();
			sb.append(user.getId())
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
