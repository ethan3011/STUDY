package HTA0326;

public class Review4 {
	public static void main(String[] args) {
		/* 다차원배열(2행 3열 다차원 배열) 생성하기 */
//		String[][] array1 = new String[2][3];
		
		int[][] array2 = {
				{10, 20, 30},
				{90, 80, 70},
				};
//		double[][] array3 = new double[2][3];
		
		// 다차원 배열의 값 출력하기 (System.out.println)
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[0][2]);
		System.out.println(array2[1][0]);
		System.out.println(array2[1][1]);
		System.out.println(array2[1][2]);
		System.out.println("=============================");
		// for문을 사용해서 다차원 배열의 모든 값을 출력하기
		for(int[] t1 : array2) {
			for(int t2 : t1) {
				System.out.println(t2);
			}
		}
		System.out.println("=============================");
		
		/* 3행*X열 2차원 배열 생성하기 */
		String[][] foods = new String[3][];
		
		// 위에서 정의한 배열의 0번째, 1번째, 2번째 행에 포함될 배열을 생성하기(각 배열의 크기가 서로 다름)
		 String[] pzMenu = {"고구마피자", "하와이안피자", "슈퍼파파피자"};
		 String[] ckMenu = {"후라이드치킨", "양념치킨", "고추치킨", "스노우치즈치킨", "매운치킨"};
		 String[] chMenu = {"간짜장", "라조기", "유린기", "깐풍기"};
		// 위에서 정의한 배열의 0번째, 1번째, 2번째에 각각의 배열을 대입시키기
		 foods[0] = pzMenu;
		 foods[1] = ckMenu;
		 foods[2] = chMenu;		 
		// 행과 열의 크기 확인하기
		 System.out.println("행과 열의 크기 확인하기");
		 System.out.println("첫번째행의 크기 : " + foods.length + " 첫번째열의 크기 : " + foods[0].length);
		 System.out.println("두번째행의 크기 : " + foods.length + " 두번째열의 크기 : " + foods[1].length);
		 System.out.println("세번째행의 크기 : " + foods.length + " 세번째열의 크기 : " + foods[2].length);		 
		 System.out.println("=============================");
		 
		// 일반 for문으로 생성한 배열의 모든 값 출력하기
		 for(int i=0; i<foods.length; i++) {
			 for(int j=0; j<foods[i].length; j++) {
				 System.out.println((i) + "행 " + j +"열 "+ "배열의 값 : " + foods[i][j]);
			 }System.out.println("=============================");
		 }
		// 향상된 for문으로 생성한 배열의 모든 값 출력하기.
		 for(String[] fd1 : foods) {
			 for(String fd2 : fd1) {
				 System.out.println(fd2);
			 }System.out.println("=============================");
		 }

	}
}
