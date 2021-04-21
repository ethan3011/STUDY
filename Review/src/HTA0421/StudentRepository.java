package HTA0421;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class StudentRepository {

	ArrayList<Student> students = new ArrayList<Student>();
	
	
	public StudentRepository() {
		loadData();
	}
		
	
	public void loadData() {
		try(FileReader reader = new FileReader("src/HTA0421/Students.txt");
				BufferedReader br = new BufferedReader(reader)){
			
			String text = null;
			while((text = br.readLine()) != null) {
				//1. text변수에 저장된 문자열을 ,를 구분자로 자른다. -> String[]이 획득됨	
				String[] values = text.split(",");
				//2. String[] 배열의 0번째부터 3번째까지 값을 가져와서 적절한 변수에 대입한다.
				String name = values[0];
				int kor = Integer.parseInt(values[1]);
				int eng = Integer.parseInt(values[2]);
				int math = Integer.parseInt(values[3]);
				
				Student student = new Student(name, kor, eng, math);
				
				students.add(student);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		
		// students가 참조하는 ArrayList객체에 저장된 학생정보를 파일로 저장한다.
		public void saveData() {
			try(PrintWriter writer = new PrintWriter("src/HTA0421/Students.txt")) {
				for(Student item : students) {
					StringBuilder sb = new StringBuilder();
					
					sb.append(item.getName()).append(",").append(item.getKor()).append(",").append(item.getEng()).append(",").append(item.getMath());
					
					String text = sb.toString();
					writer.println(text);
				}
			}catch(IOException e) {
				System.out.println("[오류] : " + e.getMessage());
			}
		}
		
		// 모든 학생정보를 반환한다.
		public ArrayList<Student> getAllStudents() {
			return students;
		}
		
		// 지정된 학생정보를 추가한다.
		public void addStudent(Student student) {
			students.add(student);
		}
		
		// 지정된 이름의 학생정보를 반환한다.
		public Student serachUser(String name) {
			return null;
		}
		
		// 지정된 이름의 학생정보를 삭제한다.
		public void deleteUser(String name) {
			
		}
}
