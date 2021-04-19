package HomeWork0419;

public class Course {
	
	private int no;
	private String name;
	private int quota;
	private int registeredCount;
	
	public Course() {}
	
	public Course(int no, String name, int quota) {
		this.no = no;
		this.name = name;
		this.quota = quota;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

	public int getRegisteredCount() {
		return registeredCount;
	}

	public void setRegisteredCount(int registeredCount) {
		this.registeredCount = registeredCount;
	}
}
