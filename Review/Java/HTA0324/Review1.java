package HTA0324; 
	/*
	 * 1. Scanner / 조건연산자 ( 조건식 ? 값1 : 값2; )
	 * 이름, 국어, 영어, 수학점수를 입력받아서 총점, 평균을 계산하고 , 계산된 결과를 화면에 출력한다.
	 * 평균이 90점 이상이면 장학금 지급 대상이 된다.
	 */
import java.util.Scanner;
public class Review1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		int average = total/3;
		String sh = average >= 90 ? "지급대상" : "미지급대상"; 
		
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		System.out.println("장학금 : " + sh);
		scan.close();
		
	}
}
