package VoucherWeb.vo;

public class User {
	private String id;
	private String password;
	private String name;
	private int balance;
	private int point;
	private String grade;
	
	public User() {}
	
	public User(String id, String password, String name, int balance, int point, String grade) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.balance = balance;
		this.point = point;
		this.grade = grade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
