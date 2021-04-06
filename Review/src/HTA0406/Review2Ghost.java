package HTA0406;

/*Ghost class extends Unit*/
public class Review2Ghost extends Review2Unit{

	//attack Override (적의 기지에 핵폭탄을 투하시킨다.)
	@Override
	public void Attack() {
		System.out.println("적의 기지에 핵폭탄을 투하시킨다.");
	}

	//move Override (클로킹 기능을 이용해서 이동한다.)
	@Override
	public void Move() {
		System.out.println("클로킹 기능을 이용해서 이동한다.");
	}
}
