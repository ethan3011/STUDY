package HTA0325;
//String, int, double 배열 선언 후 값을 넣고 출력해보기
//for문 / 향상된 for문 각각 사용

public class Review6 {
	
	public static void main(String[] args) {
		
		String[] chicken = new String[3];
		int[] score = new int [4];
		double[] height = {1.4, 0.8, 1.2, 0.4};
		char[] alphabet = {'A','B','C','D','E','F'};

		chicken[0] = "후라이드 치킨";
		chicken[1] = "양념 치킨";
		chicken[2] = "고추 치킨";
		for(int i=0;i<chicken.length; i++) {
			System.out.println("치킨의 종류 " + (i+1)+"." + chicken[i]);
		}
		
		System.out.println("==================================");
		
		score[0] = 85;
		score[1] = 70;
		score[2] = 100;
		score[3] = 90;
		for(int i=0;i<score.length;i++) {
			System.out.println("시험점수 [" + (i+1) + "]분기 : " + score[i]);
		}
		System.out.println("==================================");
		
		for(double tall: height) {
			System.out.println("매년 키 상승량 " + tall);
		}
		System.out.println("==================================");
		
		for(char sp : alphabet) {
			System.out.println("알파벳 순서 : "+ sp);
		}
	}
}
