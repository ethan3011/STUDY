package HTA0423.vo;

public class User {

	private String id;			// 아이디
	private String name;		// 이름
	private String password;	// 비밀번호
	private int point;			// 적립된 포인트
	private String grade;		// 사용자 등급(일반, 로얄, 골드, 플래티넘)
	
	public User() {}

	public User(String id, String name, String password, int point, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.point = point;
		this.grade = grade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
