package VoucherWeb.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import VoucherWeb.Exception.VoucherException;
import VoucherWeb.vo.Voucher;


	public class VoucherRepository {
		List<Voucher> db = new ArrayList<Voucher>();
		
		public VoucherRepository(){
			loadData();
		}
		
		/**
		 * 모든 바우처 정보를 획득한다.
		 * @return 바우처들
		 */
		public List<Voucher> getAllVoucher() {
			return db;
		}
		
		/**
		 * 바우처중 번호가 같은것을 조회한다.
		 * @param name 바우처번호
		 * @return 같은 값이 있으면 바우처, 없으면 null
		 */
		public Voucher getVoucherByNo(int no) {
			for(Voucher voucher :db) {
				if(voucher.getVoucherNo() == no) {
					return voucher;
				}
			}
			return null;
		}
		
		/**
		 * 신규 바우처 객체를 받아서 추가한다.
		 * @param voucher 신규바우처
		 */
		public void AddNewVoucher(Voucher voucher) {
			Voucher foundVoucher = getVoucherByNo(voucher.getVoucherNo());
			
			if(foundVoucher != null) {
				throw new VoucherException("이미 바우처가 등록되어 있습니다.");
			}else {
				System.out.println("새 바우처가 등록되었습니다.");
				db.add(foundVoucher);
			}
		}
		
		
		public Voucher changeVoucherInfo(Voucher voucher) {
			Voucher foundVoucher = getVoucherByNo(voucher.getVoucherNo());
			if(foundVoucher != null) {
				foundVoucher.setVoucherNo(voucher.getVoucherNo());
				foundVoucher.setName(voucher.getName());
				foundVoucher.setPublisher(voucher.getPublisher());
				foundVoucher.setPrice(voucher.getPrice());
				foundVoucher.setDiscountPrice(voucher.getDiscountPrice());
				foundVoucher.setStock(voucher.getStock());
				System.out.println("책 정보 변경이 완료되었습니다.");
			}
			throw new VoucherException("해당 책 정보가 존재하지 않습니다.");
		}
		

	private void loadData() {
		try(FileReader fr = new FileReader("Java/VoucherWeb/VoucherWeb.csv");
			BufferedReader br = new BufferedReader(fr)){
			String text = null;
			
			while((text = br.readLine()) != null){
				String[] value = text.split(",");
				
				int voucherNo = Integer.parseInt(value[0]);
				String name = value[1];
				String publisher = value[2];
				int price = Integer.parseInt(value[3]);
				int discountPrice = Integer.parseInt(value[4]);
				int stock = Integer.parseInt(value[5]);
				
				Voucher voucher = new Voucher(voucherNo, name, publisher, price, discountPrice, stock);
				db.add(voucher);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveData() {
		try(PrintWriter pw = new PrintWriter("Java/VoucherWeb/VoucherWeb.csv");){
			
			for(Voucher voucher : db) {
				StringBuilder sb = new StringBuilder();
				sb.append(voucher.getName())
				.append(",")
				.append(voucher.getPublisher())
				.append(",")
				.append(voucher.getPrice())
				.append(",")
				.append(voucher.getDiscountPrice())
				.append(",")
				.append(voucher.getStock());
				
				String text = sb.toString();
				pw.println(text);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
