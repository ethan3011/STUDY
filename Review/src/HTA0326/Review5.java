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
		for(int score : scores[0]) {							// score 라는 변수에 scores[0]의 모든값을 출력한다(0열)
			System.out.println(score);							// scores에 저장된 첫번째 열의 값을 출력한다.
		}
//		### 국어과목의 총점과 평균을 계산하고, 출력하기 ###
		System.out.println("### 국어과목 총점 및 평균 ### ");
		int korTotal = 0;										// 국어점수 총합을 위해 korTotal 변수를 생성한다.
		int korAverage = 0;										// 국어점수 평균을 위해 korAverage 변수를 생성한다.
		for(int[] kr : scores) {								// int[] kr 이라는 배열을 만들어 2차배열의 값(scores)을 저장한다.
			korTotal += kr[0];									// kr[0]번째 값을 반복해서 더한다. (각 행의 0번째가 국어점수) - 총합
		}korAverage = korTotal/names.length;					// 총 학생들의 국어점수를 더했으니 학생이름배열에
		System.out.println("국어 과목의 총점은 : " + korTotal);		// 들어있는 배열의 크기로 값을 나눈다 - 평균
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
		System.out.println("    이름	  국어   영어   수학    총점   평균");					
		
		for(int i=0; i<names.length; i++) {			 // 이름 배열에 들어갈 i(0시작)를 기준으로 한줄씩 출력한다. (0번시작)
			int avg =0 ;							 // 이름기준 for문이 한바퀴 돈 후 초기화를 해야 총 학생의 평균이 안나온다.
			int total =0 ;							 // 위와 같음.(초기화 안할시엔 돌때마다 점수가 누적되어 틀린 값이 나온다.

			String name = names[i];					 // 0번째부터 이름을 불러오기 위해 name 라는 변수에 names[i](0번째부터)을 저장함
			System.out.printf("%6s",name);			 // printf를 써서 줄바꿈을 하지않고 6자리의 값을 받아 name 값을 출력한다.
			
			int[] userScore = scores[i];			 // 0번째부터 스코어를 불러오기위해 scores[i](0번째부터) 값을 userScore 변수에 저장한다. 
			for(int scors : userScore) {			 // socrs 라는 변수에 userScors 값을 넣으면 0번째 학생의 성적이 입력된다.
				total += scors;						 // total 이라는 변수에 0번째 학생의 점수를 모두 더한다.(총합계산)
				System.out.printf("%6d", scors);	 // 줄바꿈을 하지않고 6자리의 값을 받아 0번째 학생부터 점수를 출력한다.
			}
			avg = total/scores[i].length;		     // 0번째 학생의 모든 성적을 더한값에 scores[i](0번째)의 크기를 나눈다.(평균계산)
			System.out.printf("%6d%6d%n",total, avg);// 6자리값을 두번받아 총합과 평균을 넣고 마지막에 %d를 넣어 줄바꿈을 해준다.
		}											 // 종료가 되고 다시 처음으로 돌아가 1번째 학생의 기준으로 for문이 진행된다.
	
	}

}