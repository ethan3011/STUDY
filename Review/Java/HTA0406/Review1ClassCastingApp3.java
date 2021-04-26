package HTA0406;

/*ClassCastingApp3 class*/
public class Review1ClassCastingApp3 {
	
	public static void main(String[] args) {
		
		//Car타입의 참조변수 carList로 배열 객체생성 (5)
		Review1Car[] carList = new Review1Car[5];
		
		carList[0] = new Review1Car();
		carList[1] = new Review1FireTruck();
		carList[2] = new Review1PoliceCar();
		carList[3] = new Review1Panzer();
		carList[4] = new Review1FireTruck();
		
		//향상된 for문을 사용해서 배열에 저장된 다양한 Car객체를 순서대로 조회해서 사용해보기.
		
		
		for(Review1Car car :carList) {
			// Car객체면 운전기능, 정지기능 실행해보기 (instanceof 사용)
				car.drive();
				car.stop();
			// FireTruck객체면 운전기능, 정지기능, 화재진압기능 실행해보기
			if(car instanceof Review1FireTruck) {
				Review1FireTruck firetruck = (Review1FireTruck)car;
				firetruck.suppressFire();
			}
			// PoliceCar객체면 운전기능, 정지기능, 순찰기능 실행해보기
			if(car instanceof Review1PoliceCar) {
				Review1PoliceCar policecar= (Review1PoliceCar)car;
				policecar.patrol();
			}
			// Panzer객체면 운전기능, 정지기능, 순찰기능, 무기발사기능 실행해보기
			if(car instanceof Review1Panzer) {
				Review1Panzer panzer = (Review1Panzer)car;
				panzer.fireWeapon();
			}
			System.out.println("============================================");
		}
	}
}
