package VoucherWeb.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import VoucherWeb.vo.Order;

public class OrderRepository {
	
	List<Order> db = new ArrayList<Order>();
	
	public OrderRepository() {
		loadData();
	}

	private void loadData() {
		try(FileReader fr = new FileReader("Java/VoucherWeb/Order.csv");
				BufferedReader br = new BufferedReader(fr)){
			
			String text = null;
			while((text = br.readLine()) != null) {
				
				String[] value = text.split(",");
				
				String userId = value[0];
				String name = value[1];
				int count = Integer.parseInt(value[2]);
				
				Order order = new Order(userId, name, count);
				db.add(order);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveData() {
		try(PrintWriter pw = new PrintWriter("Java/VoucherWeb/Order.csv")){
			
			for(Order order : db) {
				StringBuilder sb = new StringBuilder();
				sb.append(order.getUserId())
				.append(",")
				.append(order.getName())
				.append(",")
				.append(order.getCount());
				
				String text = sb.toString();
				pw.println(text);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
