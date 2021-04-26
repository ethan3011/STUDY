package HTA0406;

/*ClassCastingApp class*/
public class Review1ClassCastingApp {
	public static void main(String[] args) {
		//Panzer 타입의 참조변수 car1로 Panzer객체 생성
		Review1Panzer car1 = new Review1Panzer();
		
		//PoliceCar 타입의 참조변수 car2로 Panzer객체 생성
		Review1PoliceCar car2 = new Review1Panzer();
		
		//Car 타입의 참조변수 car3로 Panzer객체 생성
		Review1Car car3 = new Review1Panzer();
		
		//### Panzer 타입의 참조변수로 Panzer객체 참조하기
		System.out.println("### Panzer 타입의 참조변수로 Panzer객체 참조하기");
		car1.setColor("흰색");
		car1.color();
		car1.drive();
		car1.stop();
		car1.setWeapon("머신건");
		car1.fireWeapon();
		car1.patrol();
		System.out.println("============================================");
		
		//### PoliceCar 타입의 참조변수로 Panzer객체 참조하기
		System.out.println("### PoliceCar 타입의 참조변수로 Panzer객체 참조하기");
		car2.setColor("빨간색");
		car2.color();
		car2.drive();
		car2.stop();
		car2.patrol();
		System.out.println("============================================");
		
		//### Car 타입의 참조변수로 Panzer객체 참조하기
		System.out.println("### Car 타입의 참조변수로 Panzer객체 참조하기");
		car3.setColor("노란색");
		car3.color();
		car3.drive();
		car3.stop();
		System.out.println("============================================");
	}
}
