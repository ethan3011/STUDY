package HTA0407;

/*BasicChart class - Chart 상속*/
public class Review3BasicChart extends Review3abstractChart{
	
	//override draw() - 심플한 차트를 그린다.
	@Override
	public void draw() {
		System.out.println("심플한 차트를 그린다.");
	}
}

