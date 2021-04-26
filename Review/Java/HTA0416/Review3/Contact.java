package HTA0416.Review3;

/*Contact*/
public class Contact {

	private String name;
	private String tel;
	private String email;
	
	//기본생성자
	public Contact() {}
	
	//기본생성자 초기화
	public Contact(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	//getter,setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//hashcode, equals 생성
	// hashSet은 중복되는 값을 허용하지 않으나 객체의 주소가 같은걸 허용 안하는것이기 때문에
	// 여러개의 참조변수가 있다면 equals 를 생성해줘야 중복된 값이 주소가 달라도 같은 값이므로 저장되지 않는다. 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}
	
	

	
	

}
