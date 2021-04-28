package VoucherWeb.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import VoucherWeb.vo.Order;

public class OrderRepository {
	
	
	/**
	 * 주문내역 기본배열 생성
	 */
	List<Order> db = new ArrayList<Order>();
	
	/**
	 * 기본생성자에 파일에서 주문내역 가져오게 한다.
	 */
	public OrderRepository() {
		loadData();
	}
	
	/**
	 * 모든 주문내역을 가져온다.
	 * @return 주문내역
	 */
	public List<Order> AllOrders() {
		return db;
	}

	/**
	 * 지정된 회원의 주문내역을 가져온다.
	 * @param name 검색할 회원이름
	 * @return 조회된 객체, 없을시 null 을 반환
	 */
	public Order getOrderByname(String name) {
		List<Order> orders = AllOrders();
		
		for(Order order:orders) {
			if(order.getName().equals(name)) {
				return order;
			}
		}
		return null;
	}
	
	/**
	 * [관리자모드]새로운 주문을 추가한다.
	 * @param order 신규주문정보
	 */
	public void addOrder(Order order) {
		db.add(order);
	}
	
	/**
	 * [관리자모드] 지정된 주문내역을 삭제한다.
	 * @param name 삭제할 상품이름
	 */
	public void DeleteOrder(String name) {
		Iterator<Order> value = db.iterator();
		
		while(value.hasNext()) {
			Order nextValue = value.next();
			if(nextValue.getName().equals(name)) {
				value.remove();
			}
		}
	}
	
	/**
	 * 데이터를 불러온다.
	 */
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
	
	
	/**
	 * 데이터를 저장한다.
	 */
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
