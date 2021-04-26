package HomeWork0330;
/*
 * EmployeeApp.java 에서는 Employee 객체를 생성한다.
 * 생성된 Employee객체의 멤버변수에 사원정보를 입력한다.
 * 생성된 Employee객체의 printEmployeeInfo() 메소드를 호출해서 회원정보를 화면에 출력한다.
 */

public class EmployeeApp {
	public static void main(String[] args) {
	
		Employee emps = new Employee();
		emps.eNumber = 888;
		emps.eName = "홍길동";
		emps.depart = "JAVA 개발";
		emps.position = "프로젝트 매니저";
		emps.income = 7000000;
		emps.isExistCommission = true;
		
		emps.printEmployeeInfo();
	}
}
