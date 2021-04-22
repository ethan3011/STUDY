package HTA0421;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 학생과 관련된 실직적인 업무를 처리하는 기능을 제공한다.
 * 
 * 		모든 학생 조회 기능
 * 		학생정보 검색 기능
 * 		신규학생정보 추가기능
 * 		
 * 대부분의 Service 클래스는 데이터에 대한 직접적인 CRUD 기능을 가지고 있는 Repository 객체가
 * 필요하다.
 */
public class StudentService {
	
	private StudentRepository repository = new StudentRepository();
	
	
	// 모든 학생정보를 제공하는 서비스
	public ArrayList<Student> getAllStudentList(){
		ArrayList<Student> students = repository.getAllStudents();
		return students;
	}
	
	// 이름으로 학생정보를 조회하는 서비스
	public Student findStudent(String name) {
		Student student = repository.getStudentByName(name);
		if(student == null) {
			throw new StudentException("["+name+"]과 일치하는 학생정보가 존재하지 않습니다");
		}
		
		return student;
	}
	
	// 새로운 학생정보를 추가하는 서비스
	public void addNewStudent(Student student) {
		// 동일한 학생이 있는지 확인하고 예외발생시키기
		// 동일한 학생이 없으면 repository의 insertStudent(student) 메소드 실행하기
		repository.insertStudent(student);
	}
	
	// 이름으로 학생정보를 삭제하는 서비스
	public void deleteStudnet(String name) {
		Student student = repository.getStudentByName(name);
		if(student == null) {
			throw new StudentException("["+name+"]과 일치하는 학생정보가 존재하지 않습니다.");
		}
		repository.removeStudentByName(name);
	}
	
	// 성적순으로 학생정보를 정렬해서 제공하는 서비스
	@SuppressWarnings("unchecked")
	public ArrayList<Student> getStudentRanking(){
		ArrayList<Student> originalStudents = repository.getAllStudents();
		if(originalStudents.isEmpty()) {
			throw new StudentException("학생정보가 존재하지 않습니다.");
		}
		// 원본 ArrayList<Student>를 복제한다.
		ArrayList<Student> cloneStudents = (ArrayList<Student>)originalStudents.clone();
		Collections.sort(cloneStudents); 		// 총점에 대한 오름차순으로 정렬됨
		Collections.reverse(cloneStudents);		// 총점에 대한 내림차순으로 정렬됨
		
		return cloneStudents;
	}
	
	// 모든 학생정보를 파일로 저장하는 서비스
	public void saveAllStudentData() {
		repository.saveData();
	}
	
}
