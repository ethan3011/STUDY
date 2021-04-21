package HTA0421;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		
		while(true) {
			System.out.println("================================================");
			System.out.println("1.전체조회 2.추가 3.검색 4.삭제 5.석차 0.종료");
			System.out.println("================================================");
			System.out.println();
			System.out.println("메뉴 번호를 입력해 주세요.");
			int menuNo = sc.nextInt();
	
			
			try {
				if(menuNo == 1) {
					System.out.println("[전체 학생 조회]");
					ArrayList<Student> students = service.printAllStudentsInfo();
					
					if(students.isEmpty()) {
						System.out.println("[오류] 등록된 회원이 존재되지 않습니다.");
					}else {
						System.out.println("### 학생정보 출력 ");
						System.out.println("-------------------------------------");
						for(Student student : students) {
							//3. 출력
							System.out.println("이름 : " + student.getName());
							System.out.println("국어점수 : " + student.getKor());
							System.out.println("수학점수 : " + student.getEng());
							System.out.println("영어점수 : " + student.getMath());
							System.out.println("총합 : " + student.getTotal());
							System.out.println("평균 : " + student.getAverage());
							System.out.println("-------------------------------------");
							System.out.println();
						}
					}
					
				}else if(menuNo == 2) {
					System.out.println("[학생 추가]");
					System.out.println("이름을 입력하세요.");
					String name = sc.next();
					System.out.println("국어점수를 입력하세요.");
					int kor = sc.nextInt();
					System.out.println("영어점수를 입력하세요.");
					int eng = sc.nextInt();
					System.out.println("수학점수를 입력하세요.");
					int math = sc.nextInt();
					
					Student student = new Student (name, kor, eng, math);
					service.addStudentInfo(student);
					System.out.println("학생등록이 완료되었습니다.");
					
					
				}else if(menuNo == 3) {
					System.out.println("[학생 정보 검색]");
					
					
				}else if(menuNo == 4) {
					System.out.println("[학생 정보 삭제]");
					
					
					
					
				}else if(menuNo == 5) {
					System.out.println("[석차 오름차순 정렬]");
					
					
					
					
				}else if(menuNo == 0) {
					System.out.println("[프로그램 종료]");
					service.SavedAllStudentsData();
					break;
				}
				
				
			}catch(Exception e){
					System.out.println("[오류] : " + e.getMessage());
			}
		}
		sc.close();
	}
}
