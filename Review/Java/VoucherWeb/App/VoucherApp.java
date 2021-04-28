package VoucherWeb.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import VoucherWeb.Repository.VoucherRepository;
import VoucherWeb.Service.VoucherService;

public class VoucherApp {
	
	private VoucherService service = new VoucherService();
		public void menu() {
			try {
				boolean isLogined = service.isLogined();
				Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				if(!isLogined) {
					System.out.println("----------------------------------------------------------------------");
					System.out.println("1.바우처목록  2.로그인  3.회원가입  4.관리자모드  0.종료");
					System.out.println("----------------------------------------------------------------------");
					
					System.out.println("메뉴를 선택해주세요.");
					int menuNo = sc.nextInt();
//					int menuNo = Integer.parseInt(br.readLine());
					
					if(menuNo == 1) {
						service.printAllVoucher();
					}else if(menuNo == 2) {
						
					}else if(menuNo == 3) {
						
					}else if(menuNo == 4) {
						
					}else if(menuNo == 0) {
						exit();
					}
					
					
					
				}else {
					
					
					
					
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			menu();
		}
		
		private void exit() {
			System.out.println("[프로그램 종료]");
			service.saveAll();
			System.exit(0);
		}
		
		
		public static void main(String[] args) {
			VoucherApp app = new VoucherApp();
			app.menu();
	}
}
