package HTA0329;

/*class : Tv 생성*/
class Tv{												// Tv 클래스를 생성한다.
	//필드 정의(색상 color / 전원상태 power (on/off) / 채널 channel)
	String color;										// String 타입의 color 멤버변수를 생성한다.
	boolean power;										// 전원은 2가지 밖에 없으므로 boolean 타입의 멤버변수를 power 를 생성한다.(on/off)
	int  channel;										// int 타입의 channel 을 생성한다.
	
//Tv의 기능(메소드) 생성 (TV를 켜거나 끄는 기능 And TV의 채널을 높이는 기능 And TV의 채널을 낮추는 기능)
	void channelUp()	 {channel++;}					// 채널을 1 올리는 메소드이다.
	void channelDown() 	 {channel--;}					// 채널을 1 낮추는 메소드이다.
	void power() 		 {power = !power;}				// 반대값을 나오게 하는 메소드이다.
}										

public class Review4 {
	public static void main(String[] args) {
		//Tv 객체 생성
		Tv tv = new Tv();								// TV객체의 주소값을 tv라는 새로운 객체 생성 후 주소값을 넣어준다.
		
		//Tv의 color, power, channel 값 지정
		tv.color = "black";								// Tv.color 에 black 값을 대입한다.
		tv.channel = 13;								// Tv.channel 에 6 을 대입한다.
		tv.power();										// power 메소드가 반대로 설정되있으므로 true가 나온다.
		
		//메소드 channelDown() 호출
		tv.channelDown();								// 채널을 1 낮춘다.
		
		//S.O.P로 현재 color, power, channel 출력하기
		System.out.println("Tv 색상 : " + tv.color);
		System.out.println("Tv 채널 : " + tv.channel);
		System.out.println("Tv 전원 : " + tv.power);
		
	}

}
