package HTA0406;
/*ClassCastingApp4 class*/

public class Review1ClassCastingApp4 {
	public static void main(String[] args) {

		//Car타입의 참조변수 car1로 Car객체 생성
		Review1Car car1 = new Review1Car();
		
		//FireTruck타입의 참조변수 car2로 FireTruck객체 생성
		Review1FireTruck car2 = new Review1FireTruck();
		
		//PoliceCar타입의 참조변수 car3로 PoliceCar객체 생성
		Review1PoliceCar car3 = new Review1PoliceCar();
		
		//Panzer타입의 참조변수 car4로 Panzer객체 생성
		Review1Panzer car4 = new Review1Panzer();

		//### drive/stop 기능 테스트 하기
		System.out.println("### drive/stop 기능 테스트 하기");
		testDriveAndStop(car1);
		testDriveAndStop(car2);
		testDriveAndStop(car3);
		testDriveAndStop(car4);
		
		//### 순찰기능 테스트 하기
		System.out.println("### 순찰기능 테스트 하기");
		// testPatrol(car1); 에러 - 순찰기능이 존재하지 않음
		// testPatrol(car2); 에러 - 순찰기능이 존재하지 않음
		testPatrol(car3);
		testPatrol(car4);
		
		//### 무기발사 기능 테스트 하기
		System.out.println("### 무기발사 기능 테스트 하기");
		// testFireWeapone(car1); 에러 - 무기발사기능이 존재하지 않음
		// testFireWeapone(car2); 에러 - 무기발사기능이 존재하지 않음
		// testFireWeapone(car3); 에러 - 무기발사기능이 존재하지 않음
		testFireWeapone(car4);
	}
	
	//testDriveAndStop 메소드(매개변수 Car car)
	public static void testDriveAndStop(Review1Car car) {
		car.drive();
		car.stop();
	}
	
	//testPatrol(PoliceCar car)
	public static void testPatrol(Review1PoliceCar car) {
		car.patrol();
	}
	//testFireWeapon(Panzer car)
	public static void testFireWeapone(Review1Panzer car) {
		car.fireWeapon();
	}
}
