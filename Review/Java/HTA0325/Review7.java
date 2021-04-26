package HTA0325;
//이번에 수업에 참여한 모든 학생의 이름을 출력하시오.
//김유신/이순신/홍길동 학생의 성적을 전부 출력하시오.
//국어 점수의 평균을 출력하시오.
//수학 점수의 평균을 출력하시오.
//영어 점수의 평균을 출력하시오.
//각 학생별 학생이름, 국어, 영어, 수학점수, 총점, 평균점수를 출력하시오
public class Review7 {
	
	public static void main(String[] args) {
		
		
		String[] names = {"김유신", "이순신", "홍길동"};
		int[] korScores = {100, 80, 30};
		int[] engScores = {80, 100, 50};
		int[] mathScores = {80, 100, 20};
		
		for(String name : names) {
			System.out.println(name);
		}System.out.println("============================");
		
			System.out.printf("김유신 학생의 점수%n국어점수 : %3d%n영어점수 : %2d%n수학점수 : %2d%n", korScores[0],engScores[0],mathScores[0]);
			System.out.println("============================");
			System.out.printf("이순신 학생의 점수%n국어점수 : %2d%n영어점수 : %3d%n수학점수 : %2d%n", korScores[1],engScores[1],mathScores[1]);
			System.out.println("============================");
			System.out.printf("홍길동 학생의 점수%n국어점수 : %2d%n영어점수 : %2d%n수학점수 : %2d%n", korScores[2],engScores[2],mathScores[2]);
			System.out.println("============================");
			int korTotal = 0;
			int korAverage = 0;
			
			for(int kor : korScores) {
				korTotal += kor;
			} 
			korAverage = korTotal/korScores.length;
			System.out.println("국어점수의 평균 : " + korAverage);
			System.out.println("============================");
			
			int mathTotal = 0;
			int mathAverage = 0;
			
			for(int math : mathScores) {
				mathTotal += math;
			} 
			mathAverage = mathTotal/mathScores.length;
			System.out.println("수학점수의 평균 : " + mathAverage);
			System.out.println("============================");
			
			int engTotal = 0;
			int engAverage = 0;
			
			for(int eng : engScores) {
				engTotal += eng;
			} 
			engAverage = engTotal/engScores.length;
			System.out.println("영어점수의 평균 : " + engAverage);
			System.out.println("============================");
			
			System.out.println("이름      국어     영어    수학    총점     평균");
				for(int i=0; i<3; i++) {
					String name = names[i];
					int kor = korScores[i];
					int eng = engScores[i];
					int math = mathScores[i];
					
					int total = kor+eng+math;
					int average = total/3;

					System.out.printf("%s ㅣ%5d ㅣ%5d ㅣ%5d ㅣ%5d ㅣ%5d%n", name,kor,eng,math,total,average);
				}
	}
}
