package VoucherWeb.Service;

import java.util.ArrayList;
import java.util.List;

import VoucherWeb.Exception.UserException;
import VoucherWeb.Repository.OrderRepository;
import VoucherWeb.Repository.UserRepository;
import VoucherWeb.Repository.VoucherRepository;
import VoucherWeb.vo.User;
import VoucherWeb.vo.Order;
import VoucherWeb.vo.Voucher;

public class VoucherService {
	
	private User loginedUser = null;
	
	private UserRepository userRepository = new UserRepository();
	private OrderRepository orderRepository = new OrderRepository();
	private VoucherRepository voucherRepository = new VoucherRepository();
	
	public void printAllVoucher() {
		List<Voucher> vouchers = voucherRepository.getAllVoucher();
		for(Voucher item :vouchers) {
			System.out.println("상품번호 : " + item.getVoucherNo());
			System.out.println("상품이름 : " + item.getName());
			System.out.println("퍼블리셔 : " + item.getPublisher());
			System.out.println("판매가격 : " + item.getPrice());
			System.out.println("할인가격 : " + item.getDiscountPrice());
			System.out.println("재고갯수 : " + item.getStock());
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 로그인 기능
	 * @param id 로그인 아이디
	 * @param password 로그인 패스워드
	 */
	public void login(String id, String password) {
		List<User> users = new ArrayList<User>();
		
		for(User user:users) {
			if(user.getId().equals(id) && user.getPassword().equals(password)) {
				loginedUser = user;
				System.out.println(user.getName() + "님 성공적으로 로그인 되었습니다.");
			}
		}
		throw new UserException("아이디 혹은 비밀번호가 올바르지 않습니다.");
	}
	
	
	public void logout() {
		loginedUser = null;
	}
	
	public boolean isLogined() {
		if(loginedUser != null) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void saveAll() {
		userRepository.saveData();
		orderRepository.saveData();
		voucherRepository.saveData();
	}
}
