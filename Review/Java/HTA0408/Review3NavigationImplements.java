package HTA0408;

/*내비게이션구현 impl 내비게이션 class*/
public class Review3NavigationImplements implements Review3Navigation{
	
	//override 길안내
	@Override
	public void guideWays() {
		System.out.println("경로로 안내합니다.");	
	}
}
