package HTA0401;
//StudentService class 생성
public class Review2StudentService {

		Review2Student student = new Review2Student();
		

		//Student 배열 생성 / positon = 0 초기화
		Review2Student[] Students = new Review2Student[40];
		int position = 0;

		//기본 생성자 초기화
		Review2StudentService(){
			Students[position++] = new Review2Student("홍치킨", 100, 10, 0);
			Students[position++] = new Review2Student("간짜장", 90, 20, 10);
			Students[position++] = new Review2Student("최피자", 80, 30, 20);
			Students[position++] = new Review2Student("이보쌈", 70, 40, 30);
			Students[position++] = new Review2Student("류분식", 60, 50, 40);
		}
		
		// 전체 학생의 성적정보를 출력한다.
		void allScoresStudent(){
			
			for(Review2Student student : Students) {
				if(student == null) {
					break;
				}
				System.out.println("학생이름 : " + student.name);
				System.out.println("국어점수 : " + student.kor);
				System.out.println("영어점수 : " + student.eng);
				System.out.println("수학점수 : " + student.math);
				System.out.println("토탈점수 : " + student.total);
				System.out.println("평균점수 : " + student.average);
				System.out.println("=============================================");
			}
		}
		
		// 지정된 학생의 성적정보를 조회한다.
		void searchMember(String name) {
			
			Review2Student stuinfo = null;
			for(Review2Student student : Students) {
				if(student == null) {
					break;
				}
				if(name.equals(student.name)) {
					stuinfo = student;
				}

			}if(stuinfo == null) {
				System.out.println(name + "은(는) 존재하지 않는 이름 입니다.");
			}else {
				System.out.println("학생이름 : " + stuinfo.name);
				System.out.println("국어점수 : " + stuinfo.kor);
				System.out.println("영어점수 : " + stuinfo.eng);
				System.out.println("수학점수 : " + stuinfo.math);
				System.out.println("토탈점수 : " + stuinfo.total);
				System.out.println("평균점수 : " + stuinfo.average);
				System.out.println("=============================================");
			}

		}
		
		// 학생정보를 등록한다.
		void registerNewStudent(Review2Student newStudent) {
			Students[position++] = newStudent;
		}
		
		
		// 학생정보를 수정한다.
		void editStudent(Review2Student editStudent) {
			Review2Student edinfo = null;
			for(Review2Student student : Students) {
				if(student == null) {
					break;
				}
				if(editStudent.name.equals(student.name)) {
					edinfo = student;
					break;
				}
			}
				
			if(edinfo == null) {
				System.out.println(editStudent.name + " 이(가) 학생 목록에 존재하지 않습니다.");
			}else {
				
				edinfo.name = editStudent.name;
				edinfo.kor = editStudent.kor;
				edinfo.eng = editStudent.eng;
				edinfo.math = editStudent.math;
				edinfo.total = editStudent.total;
				edinfo.average = editStudent.average;
				System.out.println("수정이 완료되었습니다.");
				System.out.println("수정된이름 : " + editStudent.name);
				System.out.println("수정된국어점수 : " + editStudent.kor);
				System.out.println("수정된영어점수 : " + editStudent.eng);
				System.out.println("수정된수학점수 : " + editStudent.math);
				System.out.println("수정된토탈점수 : " + editStudent.total);
				System.out.println("수정된평균점수 : " + editStudent.average);
				System.out.println("=============================================");
			}
			
		}	
}
