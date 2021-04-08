package HTA0408;

/*User class*/
public class User {
		
	//private id, name 생성
	private String id;
	private String name;

	//기본생성자 매개변수 id, name
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public User() {}

	//getter, setter 생성
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
}
