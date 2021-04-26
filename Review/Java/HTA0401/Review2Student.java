package HTA0401;



//Student class 생성
public class Review2Student {
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int average;
	
	//기본 생성자
	public Review2Student() {}

	//학생이름, 국어점수, 영어점수, 수학점수를 전달받아서 멤버변수를 초기화하는 생성자 정의하기
	public Review2Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = this.kor + this.eng + this.math;
		average = total/3;
	}
}
