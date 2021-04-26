 package HTA0409;

/*﻿Game class*/
public class Review2Game {

	//은닉화 멤버변수 name,win 생성
	private String name;
	private int win;
	
	//매개변수가 있는 생성자
	public Review2Game(String name, int win){
		this.name = name;
		this.win = win;
	}
	
	// 기본생성자
	public Review2Game(){}
	
	//getter 생성
	public String getName() {
		return name;
	}
	
	public int getWin() {
		return win;
	}
}
