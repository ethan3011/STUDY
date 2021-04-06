package HTA0406;

/*BattleCruiser class extends Flight*/
public class Review2BattleCruiser extends Review2Flight{
	
	//attack Override (야마토 포를 발사해서 적을 초토화시킨다.)
	@Override
	public void Attack() {
		System.out.println("야마토 포를 발사해서 적을 초토화시킨다.");
	}
}
