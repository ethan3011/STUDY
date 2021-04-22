package HTA0421;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 사용자와 상호작용하는 클래스다.
 * 		- 사용자에게 이용가능한 메뉴 제공
 * 		- 사용자의 입력정보 처리
 * 		- 사용자가 요청한 데이터 표현
 * 		* 사용자의 요청처리를 위해서 학생정보와 관련된 실질적인 작없이 구현되어 있는
 * 		  Service객체가 필요하다.
 */

public class StudentApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentService service = new StudentService();
		
		while (true) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.전체조회 2.추가 3.검색 4.삭제 5.석차 0.종료");
			System.out.println("---------------------------------------------------------------");
			
			System.out.print("메뉴 선택 > ");
			int menuNo = scanner.nextInt();
			
			System.out.println();
			try {
				if (menuNo == 1) {
					System.out.println("[전체 학생 정보 조회]");
					
					ArrayList<Student> students = service.getAllStudentList();
					if (students.isEmpty()) {
						System.out.println("[안내] 등록된 학생정보가 없습니다.");
					} else {
						System.out.println("===========================================");
						System.out.println("학생명\t총점\t평균");
						System.out.println("-------------------------------------------");
						for (Student student : students) {
							System.out.print(student.getName() + "\t");
							System.out.print(student.getTotal() + "\t");
							System.out.println(student.getAverage());
						}
						System.out.println("===========================================");
					}
					
				} else if (menuNo == 2) {
					System.out.println("[학생 정보 추가]");
					
					System.out.print("이름 입력 > ");
					String name = scanner.next();
					System.out.print("국어점수 입력 > ");
					int kor = scanner.nextInt();
					System.out.print("영어점수 입력 > ");
					int eng = scanner.nextInt();
					System.out.print("수학점수 입력 > ");
					int math = scanner.nextInt();
					
					Student student = new Student(name, kor, eng, math);
					service.addNewStudent(student);
					System.out.println("[안내] 새 학생정보가 추가되어습니다.");
					
				} else if (menuNo == 3) {
					System.out.println("[학생정보 검색]");
					
					System.out.println("검색할 학생이름 입력 >");
					String name = scanner.next();
					
					Student student = service.findStudent(name);
					System.out.println("===========================================");
					System.out.println("학생이름 : " + student.getName());
					System.out.println("국어점수 : " + student.getKor());
					System.out.println("수학점수 : " + student.getEng());
					System.out.println("영어점수 : " + student.getMath());
					System.out.println("총   합 : " + student.getTotal());
					System.out.println("평   균 : " + student.getAverage());
					System.out.println("===========================================");
					
				} else if (menuNo == 4) {
					System.out.println("[학생정보 삭제]");
					
					System.out.println("삭제할 이름 입력 >");
					String name = scanner.next();
					
					service.deleteStudnet(name);
					System.out.println("[안내] 학생정보가 삭제되었습니다.");
					
				} else if (menuNo == 5) {
					System.out.println("[학생 성적 석차별 조회]");
					
					ArrayList<Student> students = service.getStudentRanking();
					System.out.println("===========================================");
					System.out.println("석차\t이름\t총점\tAverage");
					System.out.println("===========================================");
					
					int ranking = 1;
					for(Student student : students) {
						System.out.print(ranking++ + "\t");
						System.out.print(student.getName()+ "\t");
						System.out.print(student.getTotal()+ "\t");
						System.out.println(student.getAverage());
					}
					
				} else if (menuNo == 0) {
					System.out.println("[프로그램 종료]");
					service.saveAllStudentData();
					break;
				}
			} catch (Exception e) {
				System.out.println("[오류] " + e.getMessage());
			}
			System.out.println();
			System.out.println();
		}
		scanner.close();
	}
}
 