package HTA0408;

/*User class*/
public class Review1User {
		
	//private id, name 생성
	private String id;
	private String name;

	//기본생성자 매개변수 id, name
	public Review1User(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Review1User() {}

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
