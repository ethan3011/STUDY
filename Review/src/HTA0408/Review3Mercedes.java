package HTA0408;

/*벤츠 상속 AbstractCar class*/
public class Review3Mercedes extends Review3AbstractCar{

	//에어백 참조변수
	Review3Airbag airbag;
	
	//에어콘 참조변수
	Review3Aircon aircon;
	
	//내비게이션 참조변수
	Review3Navigation navigation;
	
	//후방카메라 참조변수
	Review3BackCamera backcamera;
	
	//위험물탐지 참조변수
	Review3DangerousDetection dangerousdetection;
	
	@Override
	public void speedUp() {
		
	}

	@Override
	public void speedDown() {
		
	}
}
