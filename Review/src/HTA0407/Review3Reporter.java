package HTA0407;
/*Reporter class*/
public class Review3Reporter {
	
	//Chart 추상클래스를 구현한 다양한 차트객체를 참조할 참조변수
	private Review3abstractChart chart;
	
	//Chart 추상클래스를 구현한 다양한 차트객체의 주소값을 전달받는 setter 메소드
	public void setChart(Review3abstractChart chart) {
		this.chart = chart;
	}
	
	//chart 참조변수가 참조하는 객체의 최종적으로 재정의된 draw()메소드가 실행되는 createReport()메소드
	public void createReport() {
		System.out.println(chart.getTitle());
		chart.draw();
	}
}

