package HTA0407;
/*ReporterApp class*/
public class Review3ReporterApp {
	
	public static void main(String[] args) {
		
		//BasicChart 객체 생성
		Review3BasicChart Chart1 = new Review3BasicChart();
		
		//BasicChart 참조변수 setTitle 설정
		Chart1.setTitle("기본형 차트");

		//LineChart 객체 생성
		Review3LineChart Chart2 = new Review3LineChart();
		
		//LineChart 참조변수 setTitle 설정
		Chart2.setTitle("나선형 차트");

		//Reporter 객체 생성
		Review3Reporter reporter = new Review3Reporter();
		
		//Reporter 참조변수 setChart 설정
		reporter.setChart(Chart2);
		
		//Reporter 참조변수 createReport() 메소드 실행
		reporter.createReport();
	}
}
