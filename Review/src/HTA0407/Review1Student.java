package HTA0407;

/*Student class - Person 상속*/
public class Review1Student extends Review1Person{
	

	//private 멤버변수 grade, dept 생성
	private String grade;
	private String dept;
	
	//멤버변수 getter 생성
	public String getGrade() {
		return grade;
	}
	public String getDept() {
		return dept;
	}
	
	//기본생성자 생성
	public Review1Student() {} 
	
	//기본생성자 매개변수 name, grade, dept 생성 (super클래스에 name을 받을것)
	public Review1Student(String name, String grade, String dept) {
		super(name);
		this.grade = grade;
		this.dept = dept;
	}
	
	//기본생성자 매개변수 name, email, tel, grade, dept생성 (super클래스에 name,email,tel을 받을 것)
	public Review1Student(String name, String email, String tel, String grade, String dept) {
		super(name,email,tel);
		this.grade = grade;
		this.dept = dept;
	}

	//기본생성자 매개변수 grade,dept
	public Review1Student(String grade, String dept) {
		this.grade = grade;
		this.dept = dept;
	}
	
	//displayInfo() 메소드 생성 (상위 클래스의 displayInfo(), 학년,학과 출력)
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("학년 : " + grade);
		System.out.println("학과 : " + dept);
	}
}
