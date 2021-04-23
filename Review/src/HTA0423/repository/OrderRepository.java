package HTA0423.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import HTA0423.vo.Order;

public class OrderRepository {

	private List<Order> db = new ArrayList<>();
	
	public OrderRepository() {
		loadData();
	}
	
	/**
	 * 지정된 주문정보를 저장한다.
	 * @param order 주문정보
	 */
	public void insertOrder(Order order) {
		db.add(order);
	}
	
	/**
	 * 모든 사용자의 주문내역을 반환한다.
	 */
	public List<Order> getAllOrders() {
		return db;
	}
	
	
	private void loadData() {
		try (FileReader fr = new FileReader("src/HTA0423/orders.csv");
				BufferedReader br = new BufferedReader(fr);){
			
			String text = null;
			while((text = br.readLine()) != null){
				
				String[] values = text.split(",");
				
				String userId = values[0];
				int booksNo = Integer.parseInt(values[1]);
				int amount = Integer.parseInt(values[2]);
				
				Order order = new Order(userId, booksNo, amount);
				insertOrder(order);
			}
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}
	
	public void saveData() {
		try(PrintWriter pw = new PrintWriter("src/HTA0423/orders.csv")){
			
			for(Order order :db) {
				StringBuilder sb = new StringBuilder();
				
				sb.append(order.getUserId())
				.append(",")
				.append(order.getBookNo())
				.append(",")
				.append(order.getAmount());
				
				String text = sb.toString();
				pw.println(text);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
