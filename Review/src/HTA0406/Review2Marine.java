package HTA0406;

/*Marine class extends Unit*/
public class Review2Marine extends Review2Unit{
	
	//attack Override (원거리 적을 공격한다.)
	@Override
	public void Attack() {
		System.out.println("원거리 적을 공격한다.");
	}
}
