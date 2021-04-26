package HTA0408;

/*abstract AbstractCar impl Car class*/
public abstract class Review3AbstractCar implements Review3Car{
	
	//private currentSpeed 멤버변수
	private int currentSpeed;
	
	//getter,setter 생성
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	//override drive(), stop()
	@Override
	public void drive() {
		System.out.println("차량이 출발합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("차량이 멈춥니다.");
	}
}
