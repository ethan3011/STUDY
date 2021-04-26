package HomeWork0419;

public class Registration {

	private int studNo;
	private int courseNo;
	
	public Registration() {}
	public Registration(int studNo, int courseNo) {
		this.studNo = studNo;
		this.courseNo = courseNo;
	}
	public int getStudNo() {
		return studNo;
	}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	public int getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}
}
