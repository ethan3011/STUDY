package HTA0408;

/*뛰어난에어콘구현 impl 에어콘 class*/
public class Review3ExcellentAircon implements Review3Aircon {

	//override 온도올리기
	@Override
	public void increaseTemperature() {
		System.out.println("현재 온도를 3도 상승시킵니다.");
	}
	
	//override 온도낮추기
	@Override
	public void lowerTemperature() {
		System.out.println("현재 온도를 3도 하락시킵니다.");
	}
}
