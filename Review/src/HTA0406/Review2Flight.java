package HTA0406;

/*Flight class extends Unit*/
public class Review2Flight extends Review2Unit{
	
	//move Override (공중을 날아서 이동한다.)
	@Override
	public void Move() {
		System.out.println("공중을 날아서 이동한다.");
	}
}
