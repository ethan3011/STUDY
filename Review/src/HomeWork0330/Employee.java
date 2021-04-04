package HomeWork0330;

class Employee {
	/*
	 * Employee.java는 사원번호, 사원이름, 소속부서명, 직위, 급여, 커미션지급여부 정보를 저장하는 객체를 위한 클래스다.
	 * 위의 정보를 담는 멤버변수를 정의한다.
	 * 위의 정보를 화면에 출력하는 void printEmployeeInfo() 메소드를 정의한다.
	 */
	
	int eNumber;
	String eName;
	String depart;
	String position;
	int income;
	boolean isExistCommission;
	
	void printEmployeeInfo() {
		System.out.println("사원번호 : " + eNumber);
		System.out.println("사원이름 : " + eName);
		System.out.println("소속부서명 : " + depart);
		System.out.println("직위 : " + position);
		System.out.println("급여 : " + income);
		System.out.println("커미션지급여부 : " + isExistCommission);
	}
}
