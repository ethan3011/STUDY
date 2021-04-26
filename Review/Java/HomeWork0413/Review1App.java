package HomeWork0413;

import java.util.Scanner;
public class Review1App {
	

	public static void main(String[] args) {
		// 학생들의 이름을 입력받아서 배열에 저장하기
	
		// 1. 5명의 학생이름을 저장할 수 있는 배열을 정의한다.
		String[] students = new String[5];
		
		// 2. 키보드 입력을 읽어오는 Scanner객체를 생성한다.
		Scanner sc = new Scanner(System.in);
		
		// 3. 반복문(for문)을 사용해서 5회 반복한다.
		for(int i=0; i<students.length; i++) {
			//		1. 이름을 입력받는다.
			System.out.println("이름을 입력하세요.");
			//		2. 배열에 순서대로 저장한다.
			students[i] = sc.nextLine();
		}
		sc.close();
		// 4. 배열에 저장된 학생들의 이름을 반복문(향상된 for문)을 사용해서 출력한다.
		for(String student :students) {
			System.out.println("학생의 이름 : " + student);
		}
	}
}
