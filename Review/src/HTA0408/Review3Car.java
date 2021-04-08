package HTA0408;

/*interface Car class*/
public interface Review3Car {

	//최저속력 상수 설정
	final int MIN_LOW_SPEED = 0;
	//최고속력 상수 설정
	final int MAX_HIGH_SPEED = 300;
	
	//운전
	void drive();
	
	//정지
	void stop();
	
	//속도올리기
	void speedUp();
	
	//속도내리기
	void speedDown();
}
