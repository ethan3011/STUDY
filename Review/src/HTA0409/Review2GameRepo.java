package HTA0409;


/*﻿GameRepo class*/
public class Review2GameRepo {
	
	//은닉화 Game배열 생성(5)
	private Review2Game[] game = new Review2Game[5];
	
	//기본 생성자 안에 배열 초기화
	public Review2GameRepo() {
		game[0] = new Review2Game("월요일승리", 1);
		game[1] = new Review2Game("화요일승리", 0);
		game[2] = new Review2Game("수요일승리", 0);
		game[3] = new Review2Game("목요일승리", 1);
		game[4] = new Review2Game("금요일승리", 1);
	}

	//은닉화 내부클래스 GameStats impl Stats 생성
	private class GameStats implements Review2Stats{
		
		
		//override total
		@Override
		public int total() {
			int totalWin = 0;
			
			for(Review2Game game : game) {
				totalWin += game.getWin();
			}
			return totalWin;
		}
		
		//override average
		@Override
		public int average() {
			return total()*100/game.length;
		}
	}
	
	//GameStats을 Stats으로 반환하는 getStats 메소드 생성
	public Review2Stats getStats() {
		return new GameStats();
	}
}
