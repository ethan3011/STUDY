package HTA0406;

/*GameApp class*/
public class Review2GameApp {
	
	public static void main(String[] args) {

		//Marine 객체 생성
		Review2Marine u1 = new Review2Marine();
		
		//Firebat 객체 생성
		Review2Firebat u2 = new Review2Firebat();
		
		//Ghost 객체 생성
		Review2Ghost u3 = new Review2Ghost();
		
		//BattleCruiser 객체 생성
		Review2BattleCruiser u4 = new Review2BattleCruiser();
		
		//### Marine객체의 이동하기/공격하기
		System.out.println("### Marine객체의 이동하기/공격하기");
		u1.Attack();
		u1.Move();
		System.out.println();
		
		//### Firebat객체의 이동하기/공격하기
		System.out.println("### Firebat객체의 이동하기/공격하기");
		u2.Attack();
		u2.Move();
		System.out.println();
		
		//### Ghost객체의 이동하기/공격하기
		System.out.println("### Ghost객체의 이동하기/공격하기");
		u3.Attack();
		u3.Move();
		System.out.println();
		
		//### BattleCruiser객체의 이동하기/공격하기
		System.out.println("### BattleCruiser객체의 이동하기/공격하기");
		u4.Attack();
		u4.Move();	
	}
}
