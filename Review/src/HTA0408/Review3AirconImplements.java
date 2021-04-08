package HTA0408;

/*에어콘구현 impl 에어콘 class*/
public class Review3AirconImplements implements Review3Aircon{
	
	//override 온도올리기
	@Override
	public void increaseTemperature() {
		System.out.println("설정된 온도를 1도 상승시킵니다.");
	}
	
	//override 온도낮추기
	@Override
	public void lowerTemperature() {
		System.out.println("설정된 온도를 1도 하락시킵니다.");
	}
}
