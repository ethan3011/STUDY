package VoucherWeb.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import VoucherWeb.Exception.VoucherException;
import VoucherWeb.vo.Voucher;


	public class VoucherRepository {
		
		/**
		 * 바우처 기본배열 생성
		 */
		List<Voucher> db = new ArrayList<Voucher>();
		
		
		/**
		 * 기본생성자에 파일에서 바우처정보를 가져오게 한다.
		 */
		public VoucherRepository(){
			loadData();
		}
		
		/**
		 * 모든 바우처 정보를 획득한다.
		 * @return 바우처
		 */
		public List<Voucher> getAllVoucher() {
			return db;
		}
		
		/**
		 * 바우처중에 번호가 같은 바우처정보를 가져온다.
		 * @param name 바우처번호
		 * @return 조회된 객체, 없으면 null을 반환
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
		 * [관리자모드]신규 바우처 객체를 받아서 추가한다.
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
		/**
		 * [관리자모드] 바우처를 삭제한다.
		 * @param voucherNo 삭제할 바우처번호
		 * @param name 삭제할 이름
		 */
		public void deleteVoucher(int voucherNo, String name) {
			Iterator<Voucher> value = db.iterator();
			while(value.hasNext()) {
				Voucher nextValue = value.next();
				if(nextValue.getVoucherNo() == voucherNo && nextValue.getName().equals(name)) {
					value.remove();
				}
			}
		}
		
		/**
		 * [관리자모드]바우처 정보를 변경한다.
		 * @param voucher 변경할바우처
		 */
		public void changeVoucherInfo(Voucher voucher) {
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
		
	/**
	 * 데이터를 불러온다.
	 */
	private void loadData() {
		try(FileReader fr = new FileReader("Java/VoucherWeb/Voucher.csv");
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
	
	/**
	 * 데이터를 저장한다.
	 */
	public void saveData() {
		try(PrintWriter pw = new PrintWriter("Java/VoucherWeb/Voucher.csv");){
			
			for(Voucher voucher : db) {
				StringBuilder sb = new StringBuilder();
				sb.append(voucher.getVoucherNo())
				.append(",")
				.append(voucher.getName())
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
