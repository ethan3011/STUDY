package HTA0330;
	/*Tv class 생성*/
	//channel = 10, power 멤버변수 생성
	class Tv{
		public int channel = 10;
		public boolean power;
		
		//tv를 켠다. 
		//power의 값을 true로 설정한다. 
		//변경작업-반환타입 : void
		public void powerOn() { power = true; }
		
		//tv를 끈다. 
		//power의 값을 false로 설정한다. 
		//변경작업-반환타입 : void
		public void powerOff() { power = false; }
		
		//채널숫자를 1 감소시킨다. 
		//변경작업-반환타입 : void
		public void channelDown() { channel--; }

		//채널숫자를 1 증가시킨다. 
		//변경작업-반환타입 : void
		public void channelUp() { channel++; }

		//**채널로 변경한다. 
		//변경작업-반환타입 : void
		//매개변수-채널번호
		public void changeChannel(int changeCH) { channel = changeCH; }
		
		//현재 시청중인 채널번호를 조회한다. 
		//조회작업-반환타입 : 채널번호(int정수)
		//매개변수-필요없음
		public int getCurrenctChannel() {return channel;}
	}
