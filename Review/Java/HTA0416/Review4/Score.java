package HTA0416.Review4;


/*Score impl Comparable<Score>*/
// TreeSet은 이진트리탐색으로 저장되기 때문에 반드시 Comparable을 구현 해야한다.
public class Score implements Comparable<Score>{
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//기본생성자
	public Score() {}
	
	//기본생성자 초기화
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//getter,setter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	//CompareTo override
	// 이진트리탐색을 위한 CompareTo를 재정의 해준다.
	// 성적순으로 정리하기 위하여 임의의 getTotal을 생성한다.
	
	public int getTotal() {
		return kor+eng+math;
	}
	@Override
	public int compareTo(Score other) {
		return (this.getTotal() - other.getTotal()) * -1;
	}
}
