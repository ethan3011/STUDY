package HTA0326;

public class Review4 {
	public static void main(String[] args) {
		/* 다차원배열(2행 3열 다차원 배열) 생성하기 */
//		String[][] array1 = new String[2][3];
		
		int[][] array2 = {															//2차원 배열은 [][]를 두개 사용하여 만들수있다. 
				{10, 20, 30},														// 가장큰 {} 안에 다시 {값, 값, 값}, {값, 값, 값}
				{90, 80, 70},														// 을 만들어 값을 지정할수 있다.
				};
//		double[][] array3 = new double[2][3];
		
		// 다차원 배열의 값 출력하기 (System.out.println)
		System.out.println(array2[0][0]);											// array2의 0행0열 값을 출력
		System.out.println(array2[0][1]);											// array2의 0행1열 값을 출력
		System.out.println(array2[0][2]);											// array2의 0행2열 값을 출력	
		System.out.println(array2[1][0]);											// array2의 1행0열 값을 출력
		System.out.println(array2[1][1]);											// array2의 1행1열 값을 출력
		System.out.println(array2[1][2]);											// array2의 1행2열 값을 출력
		System.out.println("=============================");
		// for문을 사용해서 다차원 배열의 모든 값을 출력하기
		for(int[] t1 : array2) {													// array2 2차원 배열의 값을 int[] t1 배열에 입력한다.
			for(int t2 : t1) {														// t2에 int[] t1에 있는 배열의 값을 입력한다.
				System.out.println(t2);												// array2에 있는 모든 값을 출력한다.(t1을 출력하면 주소값이 나옴)
			}
		}
		System.out.println("=============================");
		
		/* 3행*X열 2차원 배열 생성하기 */
		String[][] foods = new String[3][];											// foods 라는 2차원 배열을 3행X열로 생성한다.
		
		// 위에서 정의한 배열의 0번째, 1번째, 2번째 행에 포함될 배열을 생성하기(각 배열의 크기가 서로 다름)
		 String[] pzMenu = {"고구마피자", "하와이안피자", "슈퍼파파피자"};						// pzMenu 라는 1차원 배열을 생성하며 값들을 입력한다.
		 String[] ckMenu = {"후라이드치킨", "양념치킨", "고추치킨", "스노우치즈치킨", "매운치킨"};	// ckMenu 라는 1차원 배열을 생성한다 값들을 입력한다. 
		 String[] chMenu = {"간짜장", "라조기", "유린기", "깐풍기"};						// chMenu 라는 1차원 배열을 생성한다 값들을 입력한다.
		// 위에서 정의한 배열의 0번째, 1번째, 2번째에 각각의 배열을 대입시키기
		 foods[0] = pzMenu;															// foods[0]에 pzMenu 1차원 배열을 입력한다.
		 foods[1] = ckMenu;															// foods[1]에 ckMenu 1차원 배열을 입력한다.
		 foods[2] = chMenu;		 													// foods[2]에 chMenu 1차원 배열을 입력한다.
		// 행과 열의 크기 확인하기
		 System.out.println("행과 열의 크기 확인하기");
		 System.out.println("첫번째행의 크기 : " + foods.length + " 첫번째열의 크기 : " + foods[0].length);
		 System.out.println("두번째행의 크기 : " + foods.length + " 두번째열의 크기 : " + foods[1].length);
		 System.out.println("세번째행의 크기 : " + foods.length + " 세번째열의 크기 : " + foods[2].length);		 
		 System.out.println("=============================");
		 // 1차원 값이 입력된 2차원 열의(X) 크기를 확인 한다.(foods 행은 만들때 3으로 생성하였음.)
		 
		// 일반 for문으로 생성한 배열의 모든 값 출력하기
		 for(int i=0; i<foods.length; i++) {										// for문의 행의 길이 만큼 반복해준다.
			 for(int j=0; j<foods[i].length; j++) {									// for문의 열의 길이 만큼 반복해준다.
				 System.out.println((i) + "행 " + j +"열 "+ "배열의 값 : " + foods[i][j]); // 모든 값을 출력받기 위해 내포된 for문을 사용하며
			 }System.out.println("=============================");					   // 배열의 값은 0X부터 2X까지 출력된다.(X는 위 생성된 데이터 값에 따라 다름)
		 }
		// 향상된 for문으로 생성한 배열의 모든 값 출력하기.
		 for(String[] fd1 : foods) {												// foods 값을 String[] 배열 fd1에 입력한다.
			 for(String fd2 : fd1) {												// fd2에 f1 배열에 들어있는 값을 입력한다.
				 System.out.println(fd2);											// fd2의 값을 출력한다.
			 }System.out.println("=============================");					// f1을 넣었을 경우 데이터가 배열에 있으므로 주소를 가리키기 떄문에 주소값이 나온다.
		 }

	}
}
