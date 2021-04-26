package HTA0401;
// StudentApp class 생성
import java.util.Scanner;

public class Review2StudentApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int ALL_STUDENT_SEARCH = 1;
		final int SEARCH_ONE_STUDENT = 2;
		final int REGISTER_NEW_STUDENT = 3;
		final int EDIT_STUDENT_INFO = 4;
		final int EXIT = 0;
		
		Review2StudentService service = new Review2StudentService();

		//1.전체조회 2.상세조회 3.등록 4.수정 0.종료 출력하기
		while(true) {
			
			System.out.println("### 번호를 입력해주세요 ###");
			System.out.println("1.전체조회   2.상세조회   3.등록   4.수정   0.종료");
			int menuNo = sc.nextInt();
			
			if(menuNo == ALL_STUDENT_SEARCH) {
				
				System.out.println("### 전체학생조회 ###");
				service.allScoresStudent();
				
			}else if(menuNo == SEARCH_ONE_STUDENT) {
				
				System.out.print("### 조회할 학생이름을 적어주세요");
				String studentname = sc.next(); 
				service.searchMember(studentname);
				
			}else if(menuNo == REGISTER_NEW_STUDENT) {
				System.out.println("###새로운 학생을 등록합니다 ###");
				System.out.println("이름을 입력하세요.");
				String name = sc.next();
				System.out.println("국어점수를 입력하세요.");
				int kor = sc.nextInt();
				System.out.println("영어점수를 입력하세요.");
				int eng = sc.nextInt();
				System.out.println("수학점수를 입력하세요.");
				int math = sc.nextInt();
				
				Review2Student newStudent = new Review2Student(name, kor, eng, math);
				service.registerNewStudent(newStudent);

			}else if(menuNo == EDIT_STUDENT_INFO) {
				System.out.println("### 학생의 정보를 수정합니다 ###");
				System.out.println("이름을 입력하세요.");
				String name = sc.next();
				System.out.println("국어점수를 입력하세요.");
				int kor = sc.nextInt();
				System.out.println("영어점수를 입력하세요.");
				int eng = sc.nextInt();
				System.out.println("수학점수를 입력하세요.");
				int math = sc.nextInt();
				
				Review2Student editStudent = new Review2Student(name, kor, eng, math);
				service.editStudent(editStudent);
				
				
			}else if(menuNo == EXIT) {
				break;
				
			}else {
				System.out.println("[오류] 잘못된 번호를 입력하였습니다.");
			}
		}
	}
}
