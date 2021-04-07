package HTA0407;

/*PersonApp class*/
public class Review1PersonApp {
	
	public static void main(String[] args) {
		//Student 객체 생성 후 객체값 입력
		Review1Student student = new Review1Student("이김치", "kimchi@korea.com", "010-1111-2222","3", "김치담금학과");
		
		//출력
		student.displayInfo();
		System.out.println();
		
		//Professor 객체 생성 후 객체값 입력
		Review1Professor professor = new Review1Professor("홍짜장","hong@jjajang.com","010-3333-4444","간짜장학과","조교수");
		
		//출력
		professor.displayInfo();
	}
}

