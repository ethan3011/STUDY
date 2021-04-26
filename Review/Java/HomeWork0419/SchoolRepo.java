package HomeWork0419;

import java.util.ArrayList;
import java.util.Iterator;

public class SchoolRepo {

	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<Registration> registrations = new ArrayList<Registration>();
	
	public SchoolRepo() {
		students.add(new Student(10, "홍길동", "컴퓨터공학과", 2));
		students.add(new Student(11, "김유신", "컴퓨터공학과", 1));
		students.add(new Student(12, "강감찬", "컴퓨터공학과", 2));
		students.add(new Student(13, "이순신", "정보통학과", 1));
		students.add(new Student(14, "류관순", "정보통신학과", 2));
		
		// 과정등록
		courses.add(new Course(100, "컴퓨터개론", 5));
		courses.add(new Course(101, "소프트웨어공학", 5));
		courses.add(new Course(102, "데이터베이스", 5));
		courses.add(new Course(103, "운영체제", 5));
		courses.add(new Course(104, "컴퓨터구조", 5));
		courses.add(new Course(105, "이산수학", 5));
		courses.add(new Course(106, "프로그래밍 기초", 5));
	}

	// 학생 등록 기능
	// 학생정보를 전달받아서 students가 참조하는 ArrayList 객체에 저장하는 기능
	public void addStudnet(Student student) {
		students.add(student);
	}
	
	// 과정 등록 기능
	// 과정보를 전달받아서 courses가 참조하는 ArrayList객체에 저장하는 기능
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	// 과정 조회 기능
	// courses가 참조하는 ArrayList객체에 저장된 모든 과정정보를 출력하는 기능
	public void displayAllCourse() {
	for(Course item :courses) {
		System.out.println("과정번호 : " + item.getNo());
		System.out.println("과정명 : " + item.getName());
		System.out.println("정원 : " + item.getQuota());
		System.out.println("현재신청자수 : " + item.getRegisteredCount());
		System.out.println();
	}
	}
	
	// 과정 신청 기능
	// 학생정보, 과정번호를 전달받아서 registrations가 참조하는 ArrayList객체에 저장하는 기능
	// * 이미 신청한 과목은 신청할 수 없음
	// * 정원이 부족하면 신청할 수 없음
	public void addRegistration(int studentNo, int courseNo) {
		// 1. 학생번호에 해당하는 학생이 그 과정을 신청했는지 확인하기
		// 이미 신청한 과정이면 메소드 실행을 중단
		// 정원이 다 채워졌으면 메소드 실행을 중단
		for(Registration reg : registrations) {
			if(reg.getStudNo() == studentNo && reg.getCourseNo() == courseNo) {
				System.out.println("[안내] 해당 과정은 이미 수강신청한 과정입니다.");
				return; // 메소드 즉시 실행 중단
			}
		}
		Course foundCourse = null;
		for(Course course : courses) {
			if(course.getNo() == courseNo) {
				foundCourse = course;	// 과정번호에 해당하는 과정을 found
				break;	// 반복탈출
			}
		}
		
		if(foundCourse.getQuota() == foundCourse.getRegisteredCount()) {
			System.out.println("[안내] 해당 과정은 모집정원이 다 채워졌습니다.");
			return;
		}
		
		// 수강신청정보 생성, 학번, 과정번호 저장
			for(Student item : students) {
				if(item.getNo() == studentNo) {
					Registration regi = new Registration(studentNo, courseNo);
					// 새 수강신청정보 ArrayList에 저장
					registrations.add(regi);
					
					// 해당과정의 신청자수 1 증가
					foundCourse.setRegisteredCount(foundCourse.getRegisteredCount() + 1);
					System.out.println("[성공]과정이 등록되었습니다.");
				}
			}
	}
	
	// 신청 취소 기능
	// 학생번호, 과정번호를 전달받아서 registrations가 참조하는 ArrayList객체에 해당 과정을 삭제한다.
	public void cancelRegistration(int studentNo, int courseNo) {
		
		// Registration에서 registration 객체 삭제
		Iterator<Registration> iter = registrations.iterator();

		// Iterator를 이용해야함.
		while(iter.hasNext()) {
			Registration A = iter.next();
			if(A.getStudNo() == studentNo && A.getCourseNo() == courseNo) {
				iter.remove();
				System.out.println("해당 과정이 삭제되었습니다.");
			}
		}
	}
	
	// 나의 수강신청과정 조회하기
	// 학번을 전달받아서 그 학생이 수강신청한 과정을 출력하는 기능
	public void displayMyRegistrations(int studentNo) {
		
		System.out.println("###나의 과정명 출력");
		
		for(Registration item : registrations) {
			if(item.getStudNo() == studentNo) {
				for(Course item2 : courses) {
					if(item2.getNo() == item.getCourseNo()) {
						System.out.println("학생번호 : " + item.getStudNo());
						System.out.println("과정번호 : " + item.getCourseNo());
						System.out.println("과정명 : " + item2.getName());
						System.out.println();
					}
				}				
			}
		}
	}
}
