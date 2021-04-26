package HTA0406;

/*ClassCastingApp2 class*/
public class Review1ClassCastingApp2 {
	
	public static void main(String[] args) {
		
		//Car타입의 참조변수 car1로 Car객체 생성
		Review1Car car1 = new Review1Car();
		
		//Car타입의 참조변수 car2로 PoliceCar 객체 생성
		Review1Car car2 = new Review1PoliceCar();
		
		//Car타입의 참조변수 car3로 Panzer객체 생성
		Review1Car car3 = new Review1Panzer();

		//Car타입의 참조변수 car3로 FireTruck객체 생성
		Review1Car car4 = new Review1FireTruck();
		
		//### Car타입의 참조변수로 Car객체 참조하기
		System.out.println("### Car타입의 참조변수로 Car객체 참조하기");
		car1.setColor("빨간색");
		car1.color();
		car1.drive();
		car1.stop();
		System.out.println("============================================");

		//### Car타입의 참조변수로 PoliceCar객체 참조하기
		System.out.println("### Car타입의 참조변수로 PoliceCar객체 참조하기");
		car2.setColor("주황색");
		car2.color();
		car2.drive();
		car2.stop();
		
		System.out.println("### PoliceCar로 형변환 ###");
		Review1PoliceCar car22 = (Review1PoliceCar)car2;
		car22.patrol();
		//or ((Review1PoliceCar)car2).patrol(); 
		System.out.println("============================================");
		
		//### Car타입의 참조변수로 Panzer객체 참조하기
		System.out.println("Car타입의 참조변수로 Panzer객체 참조하기");
		car3.setColor("노란색");
		car3.color();
		car3.drive();
		car3.stop();
		
		System.out.println("### Panzer로 형변환 ###");
		Review1Panzer car33 = (Review1Panzer)car3;
		car33.fireWeapon();
		car33.setWeapon("바주카");
		car33.patrol();
		//or ((Review1Panzer)car3).fireWeapon("바주카");
		//or ((Review1Panzer)car3).patrol();
		System.out.println("============================================");
		
		//### Car타입의 참조변수로 FireTruck객체 참조하기
		System.out.println("### Car타입의 참조변수로 FireTruck객체 참조하기");
		car4.setColor("초록색");
		car4.color();
		car4.drive();
		car4.stop();
		
		System.out.println("### FireTruck로 형변환 ###");
		Review1FireTruck car44 = (Review1FireTruck)car4;
		car44.suppressFire();
		// or ((Review1FireTruck)car4).suppressFire();
		System.out.println("============================================");
	}
}
