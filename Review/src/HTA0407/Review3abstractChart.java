package HTA0407;

/*abstract Chart class*/
public abstract class Review3abstractChart {
	
	//추출된 공통속성
	//private 멤버변수 title 생성
	private String title;
	
	//getter,setter 생성
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//abstract draw()메소드 생성
	public abstract void draw(); 

}
