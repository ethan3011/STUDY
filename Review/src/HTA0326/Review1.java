package HTA0326;

public class Review1 {
	public static void main(String[] args) {
		
		//###배열 만들기
		//학과명을 저장하는 배열을 생성하기
		//학과명은 "컴퓨터공학과", "통계학과", "수학과", "전자공학과", "정보통신공학과"다.
		//학과명 배열은 문자열 5개 저장하는 배열을 new 연산자를 사용해서 생성하고,
		//0번부터 4번까지 순서대로 학과명을 배열에 저장하기
		
		String[] subjectes = new String[5];					// subjectes라는 배열을 생성하며 그 크기는 5의 공간을 생성한다.
		subjectes[0] = "컴퓨터공학과";							// subjectes[0] 번에 "컴퓨터공학과" 라는 값을 입력한다.
		subjectes[1] = "통계학과";								// subjectes[1] 번에 "통계학과" 라는 값을 입력한다.
		subjectes[2] = "수학과";								// subjectes[2] 번에 "수학과" 라는 값을 입력한다.
		subjectes[3] = "전자공학과";							// subjectes[3] 번에 "전자공학과" 라는 값을 입력한다.
		subjectes[4] = "정보통신공학과";							// subjectes[4] 번에 "정보통신공학과" 라는 값을 입력한다.
		
		//학생들의 이름을 저장하는 배열을 생성하기
		//학생명은 "이순신", "김유신", "강감찬", "류관순"이다.
		//학생명 배열은 배열표현식을 {값, 값, 값, ...}을 사용해서 배열을 생성하기
		
		String[] names = {"이순신", "김유신", "강감찬", "류관순"};	// names 라는 배열을 생성하여 "이순신", "김유신", "강감찬", "류관순"
															// 이라는 값들을 입력하며, 입력된 값들의 총 갯수가 크기가 된다.
		//학생들의 학점을 저장하는 배열을 생성하기
		//학생들의 성적은 3.1, 3.0, 4.0, 4.3이다.
		//학생성적 배열은 배열표현식을 사용해서 배열을 생성하기
		
		double[] scores = {3.1, 3.0, 4.0, 4.3};				// scores 라는 배열을 생성하여 3.1, 3.0, 4.0, 4.3
															// 이라는 값들을 입력하며, 입력된 값들의 총 갯수가 크기가 된다.		
		//### 배열의 값 출력하기
		//학과명 배열의 모든 값을 for문을 사용해서 화면에 출력하기
		System.out.println("### 학과명 ###");
		for(int i=0; i<subjectes.length;i++) {				// subjectes의 0번 배열부터 반복을 시작하며 subjectes의 크기만큼 반복된다.
			System.out.println(subjectes[i]);				// subjectes의 0번 배열부터 출력을 시작한다.
		}
		
		System.out.println("=======================================");
		//학생이름 배열의 모든 값을 향상된 for문을 사용해서 화면에 출력하기
		System.out.println("### 학생이름 ###");
		for(String name : names) {							// name에 names의 배열의 값들을 입력한다.
			System.out.println(name);						// name에 입력된 배열의 값들을 출력한다.
		}
		
		System.out.println("=======================================");
		//학생성적 배열의 모든 값을 향상된 for문을 사용해서 화면에 출력하기
		System.out.println("### 학생성적 ###");
		for(double score : scores) {						// score에 scores의 배열의 값들을 입력한다.
			System.out.println(score);						// score에 입력된 배열의 값들을 출력한다.
		}

		System.out.println("=======================================");
		//학생명 배열에서 0번째에 저장된 학생의 이름과, 학생성적 배열에서 0번째에 저장된 학생의 성적 출력하기
		System.out.println("### 학생성적 ###");
		for(int i=0; i<1;i++) {								// for문을 한번 반복시켜 0번에 들어있는 값을 확인한다.
			System.out.println("첫번째 학생이름 :" + names[i]);	// names의 배열에 0번째 값을 출력한다.
			System.out.println("첫번째 학생성적 :" + scores[i]);	// scores의 배열에 0번째 값을 출력한다.
		}													// 위의 i<1 부분만 바꿔주면 데이터가 늘어나도 더 출력할수 있다.
		
		System.out.println("=======================================");
		//성적에 대한 총점과 평균출력하기
		
		double total = 0;									// 총점을 입력받을 total 변수를 생성한다.
		double average = 0;									// 평균을 입력받을 average 변수를 생성한다. 
		for(double score : scores) {						// score 변수에 scores 배열의 값들을 입력한다.
			total +=(score * 10);							// score에 10을 곱한후(소수점을 줄이기 위해) total 변수에 값을 더한다. 
		}													// score에 들어있는 값 만큼 반복된다.(향상된 for문)
		total/=10;											// 총점을 다시 10으로 나눈다.(소수점을 줄이기 위해)
		average = total/scores.length;						// 총점을 scores의 크기로 나눠준다.
		System.out.println("성적의 총점 : " + total);
		System.out.println("성적의 평균 : " + average);
	}

}
