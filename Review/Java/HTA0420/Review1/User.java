package HTA0420.Review1;

/*User*/
public class User {
	private String id;
	private String name;
	private String pwd;
	
	//기본생성자
	public User() {}
	
	//생성자 초기화
	public User(String id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	//getter,setter
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
