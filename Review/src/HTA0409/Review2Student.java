 package HTA0409;

/*﻿Student class*/
public class Review2Student {

	//은닉화 멤버변수 name,kor,eng,math 생성
	private String name;
	private int kor;
	private int eng;
	private int math;

	//매개변수가 있는 생성자
	Review2Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 기본생성자
	Review2Student(){}
	
	//getter 생성
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
}
