 package HTA0409;

/*﻿StudentRepo class*/
public class Review2StudentRepo {
	
	//은닉화 Student배열 생성(5)
	private Review2Student[] student = new Review2Student[5];
	
	//기본 생성자 안에 배열 초기화
	public Review2StudentRepo() {
		student[0] = new Review2Student("홍치킨", 100, 90, 80);
		student[1] = new Review2Student("김피자", 70, 60, 50);
		student[2] = new Review2Student("이보쌈", 20, 30, 40);
		student[3] = new Review2Student("남라면", 10, 0, 100);
		student[4] = new Review2Student("정튀김", 70, 80, 90);
	}

	//은닉화 내부클래스 StudentStats impl Stats 생성
	private class StudentStats implements Review2Stats{
		
		//override total
		@Override
		public int total() {
			int totalScore = 0;
			
			for(Review2Student item :student) {
				totalScore += (item.getKor()+item.getEng()+item.getMath());
			}
			return totalScore;
		}
		
		//override average
		@Override
		public int average() {
			return this.total()/3/student.length;
		}
	}
	
	//StudentStats을 Stats으로 반환하는 getStats 메소드 생성
	public Review2Stats getStats() {
		return new StudentStats();
	}
}
