package VoucherWeb.vo;

public class Voucher {
	private int voucherNo;
	private String name;
	private String publisher;
	private int price;
	private int discountPrice;
	private int stock;
	
	public Voucher(){}
	
	public Voucher(int voucherNo, String name, String publisher, int price, int discountPrice, int stock) {
		this.voucherNo = voucherNo;
		this.name = name;
		this.publisher = publisher;
		this.price = price;
		this.discountPrice = discountPrice;
		this.stock = stock;
	}

	public int getVoucherNo() {
		return voucherNo;
	}

	public void setVoucherNo(int voucherNo) {
		this.voucherNo = voucherNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
