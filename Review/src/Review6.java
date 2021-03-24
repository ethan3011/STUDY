/*
 * 학생이름, 전자계산기, 데이터베이스, 알고리즘 점수를 입력받는다.
 * 학생이름, 각 과목점수, 총점, 평균, 합격여부를 출력한다.
 * 평균이 60점 이상이면 합격이다.
 * 한 과목이라도 40점 미만인 경우는 불합격이다.
 */
import java.util.Scanner;
public class Review6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("전자계산기 점수를 입력하세요.");
		int cal = scan.nextInt();
		System.out.println("데이터베이스 점수를 입력하세요.");
		int data = scan.nextInt();
		System.out.println("알고리즘 점수를 입력하세요.");
		int algo = scan.nextInt();
		
		int totalScore = cal+data+algo;
		int average = totalScore/3;
		String pass = "";
		
		if(average >= 60) {
			if(cal < 40 || data < 40 || algo < 40) {
				pass = "불합격(과목미달)";
			}else {
				pass = "합격";
			}
		}else {
			pass = "불합격";
		}
		System.out.println("학생이름 : " + name);
		System.out.println("전자계산기 점수 : " + cal);
		System.out.println("데이터베이스 점수 : " + data);
		System.out.println("알고리즘 점수 : " + algo);
		System.out.println("총점수 : " + totalScore);
		System.out.println("평균 : " + average);
		System.out.println("합격여부 : " + pass);
		scan.close();
		
	}
}
