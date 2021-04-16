package HTA0416.Review4;

import java.util.TreeSet;

///*TreeSetApp1*/
public class TreeSetApp1 {
	
	public static void main(String[] args) {
		
		TreeSet<Score> scores = new TreeSet<Score>();
		
		//TreeSet객체 안에 값 저장 (add)
		scores.add(new Score("홍길동", 100, 100, 100));
		scores.add(new Score("강감찬", 90, 10, 100));
		scores.add(new Score("이순신", 0, 80, 20));
		scores.add(new Score("류관순", 10, 30, 70));
		scores.add(new Score("안중근", 40, 60, 30));
		scores.add(new Score("정약용", 50, 20, 100));
		
		//### 성적높은순으로 출력하기
		System.out.println("### 성적높은순으로 출력하기");
		for(Score score:scores) {
			System.out.println("이름 : " + score.getName());
			System.out.println("국어 : " + score.getKor());
			System.out.println("영어 : " + score.getEng());
			System.out.println("수학 : " + score.getMath());
			System.out.println("총점 : " + score.getTotal());
			System.out.println();
		}
	}
}
