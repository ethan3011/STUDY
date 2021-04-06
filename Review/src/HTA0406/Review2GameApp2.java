package HTA0406;

/*GameApp2 class*/
public class Review2GameApp2 {
	
	public static void main(String[] args) {
		
		//Unit배열 객체 생성(4)
		Review2Unit[] units = new Review2Unit[4];
		
		//units 배열 안에 Marine, Firebat,Ghost, BattleCruiser 객체 저장
		units[0] = new Review2Marine();
		units[0].setName("마린");
		units[1] = new Review2Firebat();
		units[1].setName("파이어뱃");
		units[2] = new Review2Ghost();
		units[2].setName("고스트");
		units[3] = new Review2BattleCruiser();
		units[3].setName("배틀크루저");
		
		//향상된 for문으로 move(),attack()메소드 출력
		
		for(Review2Unit unit : units) {
			System.out.println("### "+unit.getName() + " 유닛으로 이동 및 공격 합니다");
			unit.Move();
			unit.Attack();
			System.out.println();
		}
	}
}
