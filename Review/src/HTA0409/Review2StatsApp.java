 package HTA0409;

/*﻿StatsApp class*/
public class Review2StatsApp {
	
	//main
	public static void main(String[] args) {


		//StudentRepo 객체생성
		Review2StudentRepo repo1 = new Review2StudentRepo();
		
		//GameRepo 객체생성
		Review2GameRepo repo2 = new Review2GameRepo();
		
		
		//학생 성적에 대한 총점, 평균을 제공하는 Stats 구현객체 얻기
		System.out.println("###학생성적 통계정보 출력");
		System.out.println("학생들의 총점 : " + repo1.getStats().total());
		System.out.println("학생들의 평균 : " + repo1.getStats().average());
		
		//게임 기록에 대한 승리횟수, 승률을 제공하는 Stats 구현객체 얻기
		System.out.println("###게임기록 통계정보 출력");
		System.out.println("게임 총승리 : " + repo2.getStats().total());
		System.out.println("게임 승률 : " + repo2.getStats().average() + "%");
	}
}
