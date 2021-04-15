package HomeWork0415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class App {
	
	public static void sortByReverseTotalScore(ArrayList<Student> student) {
		Collections.sort(student);		// 오름차순 설정
		Collections.reverse(student);	//오름차순으로 된것을 반대로
		System.out.println("=========================================================");
		System.out.println("이름"  + "\t" + "국어" + "\t" +"영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" );
		for(Student item :student) {
			System.out.println(item.getName()  + "\t" + item.getKor()  + "\t" + item.getEng()  + "\t" + item.getMath() + "\t" +item.getTotal() + "\t" +item.getAverage());
		}
		System.out.println("=========================================================");
	}
	
	public static void printNameAndTotalAndAvg(ArrayList<Student> student) {
		Iterator<Student> iter = student.iterator();		// Iterator로 student의 값을 하나씩 저장한다.
		while(iter.hasNext()) {								// iter배열안에 저장된 값이 끝날때까지 true로 반복되게 한다.
			Student s = iter.next();						// 학생의 정보를 Studnet타입의 변수s에 담는다.
			System.out.println("=========================================================");
			System.out.println("학생명 : " + s.getName());	// 출력
			System.out.println("총점 : " + s.getTotal());
			System.out.println("평균 : " + s.getAverage());
			System.out.println();
		}
	}
	
	public static void printAll(ArrayList<Student> student, String studentName) {
		Iterator<Student> iter = student.iterator();		// Iterator로 student의 값을 하나씩 저장한다.
		while(iter.hasNext()) {								// iter배열안에 저장된 값이 끝날때까지 true로 반복되게 한다
			Student s = iter.next();						// 학생의 정보를 Studnet타입의 변수s에 담는다.
			if(s.getName().equals(studentName)) {			// 출력
				System.out.println("=========================================================");
				System.out.println("학생명 : " + s.getName());
				System.out.println("국어점수 : " + s.getKor());
				System.out.println("영어점수 : " + s.getEng());
				System.out.println("수학점수 : " + s.getMath());
				System.out.println("총점 : " + s.getTotal());
				System.out.println("평균 : " + s.getAverage());
				System.out.println();
				System.out.println("=========================================================");
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * 학생성적 관리 프로그램
		 * 1. 학생 성적정보 입력기능
		 * 		- 이름, 국어, 영어, 수학점수를 입력받아서 ArrayList에 저장
		 * 2. 학생 성적정보 전체 조회 기능
		 * 		- ArrayList에 저장된 학생들의 이름, 총점, 평균을 출력한다.
		 * 3. 학생 성적정보 상세 조회 기능
		 * 		- 학생이름을 입력받아서 그 학생의 이름, 국어, 영어, 수학, 총점, 평균을 출력한다.
		 * 4. 학생 성적정보 변경 기능
		 * 		- 하지않음
		 * 5. 학생 성적정보 성적순 출력기능(고득점 -> 저득점:총점기준)
		 * 		- Comparable<T> 혹은 Comparator<T>를 이용해서 총점이 높은 학생부터 낮은 학생순으로 출력한다.
		 * 
		 */
		ArrayList<Student> student = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====================================================================");
			System.out.println("1.학생성적입력 2.전체학생정보조회 3.학생성적조회 4.성적정보변경 5.총학생성적출력 0.종료");
			System.out.println("=====================================================================");
			System.out.println("메뉴를 입력해주세요");
			int menuNo = sc.nextInt();		// 메뉴번호를 받는다
			
			if(menuNo == 1) {
				System.out.println("[학생성적입력]");
				System.out.println("이름을 입력해주세요 : ");
				String name = sc.next();
				System.out.println("국어점수를 입력해주세요 : ");
				int kor = sc.nextInt();
				System.out.println("영어점수를 입력해주세요 : ");
				int eng = sc.nextInt();
				System.out.println("수학점수를 입력해주세요 : ");
				int math = sc.nextInt();
				student.add(new Student(name, kor, eng, math));		// 점수를 입력받아 Student의 생성자에 값을 넣어 초기화한다.
				
			}else if(menuNo == 2){
				System.out.println("[전체학생정보조회]");
				App.printNameAndTotalAndAvg(student);
				
			}else if(menuNo == 3){
				System.out.println("[학생성적조회]");
				System.out.println("학생이름을 입력하세요 : ");
				String studentName = sc.next();						// 학생의 이름을 입력받는다.
				App.printAll(student, studentName);
				
			}else if(menuNo == 4){
				System.out.println("[성적정보변경]");
				
			}else if(menuNo == 5){
				System.out.println("[총학생성적출력]");
				App.sortByReverseTotalScore(student);
				
			}else if(menuNo == 0){
				System.out.println("[종료]");
				break;
			}
		}
	}
}
