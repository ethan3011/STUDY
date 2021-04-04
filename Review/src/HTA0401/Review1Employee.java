package HTA0401;
// Employee class 생성
public class Review1Employee {
	
	// 멤버변수 (직원번호, 직원이름, 소속부서, 직원직위, 직원급여, 커미션지급율)
	int no;
	String name;
	String dept;
	String position;
	int salary;
	double commission;


	// 기본생성자
	public Review1Employee() {}

	// 직원번호, 직원이름, 직원급여를 초기화하는 작업을 수행하는 중복 생성자
	//﻿ Generate Constructor using Fields 사용
	public Review1Employee(int no, String name, int salary) {
		this.no = no;
		this.name = name;
		this.salary = salary;
	}
	

	// 멤버변수 전체를 초기화하는 작업을 수행하는 중복 생성자
	// ﻿Generate Constructor using Fields 사용
	public Review1Employee(int no, String name, String dept, String position, int salary, double commission) {
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.position = position;
		this.salary = salary;
		this.commission = commission;
	}

	// 정보 출력 메소드
	void printAllEmployee() {
		System.out.println("### 직원정보 출력 ###");
		System.out.println("직원번호 : " + no);
		System.out.println("직원이름 : " + name);
		System.out.println("소속부서 : " + dept);
		System.out.println("직원직위 : " + position);
		System.out.println("직원급여 : " + salary);
		System.out.println("커미션지급율 : " + commission);
	}
}
