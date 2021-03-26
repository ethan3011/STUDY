package HTA0326;

public class Review5 {
	public static void main(String[] args) {
//	      배열예제

//	      학생들의 이름을 저장하는 1차원 배열을 만드시오.
//	      ["김유신", "강감찬", "이순신", "류관순"]
		String[] names = {"김유신", "강감찬", "이순신", "류관순"};;
//	      학생들의 국어, 영어, 수학, 점수를 저장하는 2차원 배열을 만드시오.
//		  국어		영어		수학 <-- 실제 배열에 저장되는 값은 아님
//		  100		100		100	<-- 김유신의 성적
//		   90		 70		 80 <-- 강감찬의 성적
//		   70		 60		 40 <-- 이순신의 성적
//		  100		 80		 90	<-- 류관순의 성적
		int[][] scores = { //국어   영어  수학
							{100, 100, 100},
							{90,   70,  80},
							{70,   60,  40},
							{100,  80,  90}
						 };  
		 
//	   	### 김유신 학생의 성적정보 출력하기 ###
		System.out.println("### 김유신 학생의 성적정보 ###");
		for(int score : scores[0]) {
			System.out.println(score);
		}
//		### 국어과목의 총점과 평균을 계산하고, 출력하기 ###
		System.out.println("### 국어과목 총점 및 평균 ### ");
		int korTotal = 0;
		int korAverage = 0;
		for(int[] kr : scores) {
			korTotal += kr[0];
		}korAverage = korTotal/names.length;
		System.out.println("국어 과목의 총점은 : " + korTotal);
		System.out.println("국어 과목의 평균은 : " + korAverage);
		
//		
//		 ============ 학생 성적 정보 ============
//		 이름	    국어	영어	수학	총점	평균
//		 김유신   100	100	100	300	100
//		 강감찬    90	 70	 80	240	 80
//		 이순신    70	 60	 40	170	 56
//		 류관순   100	 80	 90	270	 90
//		 ===================================
//		출력하기
		System.out.println("============== 학생 성적 정보 ==============");
		System.out.println("    이름	   국어 	 영어   수학    총점    평균");
		for(int i=0; i<names.length;i++) {
			int scoreTotal = 0;
			int average = 0;
			
			String name = names[i];
			System.out.printf("%6s",name);

			int[] allscores = scores[i];
			for(int pfscore : allscores) {
				scoreTotal += pfscore; 
				System.out.printf("%6s",pfscore);
			}
			average = scoreTotal/scores[0].length;
			System.out.printf("%7d%7d%n",scoreTotal,average);	
		}System.out.println("=========================================");
	}

}