package HTA0330;

public class Review2TvApp {
	public static void main(String[] args) {
		//Tv 객체 생성하기
		Tv tv1 = new Tv();
		
		//Tv객체의 전원 켜기
		tv1.powerOn();
		System.out.println("현재 전원 : " + tv1.power);
		System.out.println("================================================");
		
		//Tv객체의 현재 채널번호 조회하기
		System.out.println("현재 TV 채널 : " + tv1.getCurrenctChannel());
		System.out.println("================================================");
		
		//Tv객체의 채널을 하나 증가시키기
		tv1.channelUp();
		System.out.println("현재 TV 채널 : " + tv1.getCurrenctChannel());
		System.out.println("================================================");
		
		//Tv객체의 채널을 24번으로 변경하기
		tv1.changeChannel(24);
		System.out.println("현재 TV 채널 : " + tv1.getCurrenctChannel());
		System.out.println("================================================");
	}
}
