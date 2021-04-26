package HomeWork0419;

import java.util.Scanner;

public class SchoolApp {

	public static void main(String[] args) {
		SchoolRepo repo = new SchoolRepo();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.과정조회 2.수강신청 3.수강철회 4.수강신청내역조회 0.종료");
			System.out.println("---------------------------------------------");
			
			System.out.println("메뉴를 선택하세요.");
			int menuNo = sc.nextInt();
			System.out.println();
			
			if(menuNo == 1) {
				System.out.println("[전체 개설 과정 조회]");
				repo.displayAllCourse();
				
			}else if(menuNo == 2) {
				System.out.println("[수강 신청]");
				System.out.println("학생번호를 입력하세요.");
				int studNo = sc.nextInt();
				System.out.println("과정번호를 입력하세요.");
				int deptNo = sc.nextInt();
				repo.addRegistration(studNo, deptNo);
				
			}else if(menuNo == 3) {
				System.out.println("[수강 철회]");
				System.out.println("학생번호를 입력하세요.");
				int studNo = sc.nextInt();
				System.out.println("과정번호를 입력하세요.");
				int deptNo = sc.nextInt();
				repo.cancelRegistration(studNo, deptNo);

			}else if(menuNo == 4) {
				System.out.println("[수강신청 내역 조회]");
				System.out.println("학생번호를 입력해 주세요.");
				int studNo = sc.nextInt();
				repo.displayMyRegistrations(studNo);
				
			}else if(menuNo == 0) {
				System.out.println("[프로그램 종료]");
				break;
			}
			System.out.println();
			System.out.println();
			System.out.println();
			
		}sc.close();
	}
}
