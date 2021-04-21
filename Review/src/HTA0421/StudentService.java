package HTA0421;

import java.util.ArrayList;

public class StudentService {
	
	StudentRepository repo = new StudentRepository();
	
	
	// 모든 학생정보를 제공하는 서비스
	public ArrayList<Student> printAllStudentsInfo() {
		ArrayList<Student> students = repo.getAllStudents();
		return students;
	}
	
	
	// 이름으로 학생정보를 조회하는 서비스
	public Student searchStudentByName(String name) {
		return null;
	}
	
	
	// 새로운 학생정보를 추가하는 서비스
	public void addStudentInfo(Student student) {
		repo.addStudent(student);
	}
	
	// 이름으로 학생정보를 삭제하는 서비스
	
	
	
	// 성적순으로 학생정보를 정렬해서 제공하는 서비스
	
	
	
	// 모든 학생정보를 파일로 저장하는 서비스
	public void SavedAllStudentsData() {
		repo.saveData();
	}
}
