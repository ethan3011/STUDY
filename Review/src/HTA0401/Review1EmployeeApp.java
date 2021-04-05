package HTA0401;
// EmployeeApp class 생성
public class Review1EmployeeApp {
	
	public static void main(String[] args) {
		
		
		//### 객체 생성후 기본 생성자가 실행되도록 한 경우 출력
		//Employee e1 객체 생성
		//출력
		System.out.println("### 객체 생성후 기본 생성자가 실행되도록 한 경우 출력");
		Review1Employee e1 = new Review1Employee();
		e1.printAllEmployee();
		System.out.println("==============================================================");
		
		//### 객체 생성후 번호, 이름, 급여를 초기화시키는 생성자가 실행되로록 한 경우
		//Employee e2 객체 생성 후 매개변수 입력 (직원번호, 이름, 급여)
		//Employee e3 객체 생성 후 매개변수 입력 (직원번호, 이름, 급여)
		//출력
		System.out.println("### 객체 생성후 번호, 이름, 급여를 초기화시키는 생성자가 실행되로록 한 경우");
		Review1Employee e2 = new Review1Employee(111, "홍치킨", 333);
		e2.printAllEmployee();
		System.out.println("==============================================================");
		Review1Employee e3 = new Review1Employee(222, "김피자", 444);
		e3.printAllEmployee();
		System.out.println("==============================================================");

		//### 객체 생성후 모든 멤버변수를 초기화시키는 생성자가 실행되도록 한 경우
		//Employee e4 객체 생성 후 매개변수 입력 (직원번호, 이름, 부서, 직급, 급여, 커미션율)
		//Employee e5 객체 생성 후 매개변수 입력 (직원번호, 이름, 부서, 직급, 급여, 커미션율)
		//출력
		System.out.println("### 객체 생성후 모든 멤버변수를 초기화시키는 생성자가 실행되도록 한 경우");
		Review1Employee e4 = new Review1Employee(333, "진보쌈", "배달팀", "대리", 555,0.001);
		e4.printAllEmployee();
		System.out.println("==============================================================");
		Review1Employee e5 = new Review1Employee(222, "피자헛", "경영지원팀", "과장", 666,0.003);
		e5.printAllEmployee();
		System.out.println("==============================================================");

	}

}
