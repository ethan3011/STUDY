package HTA0405;

/*PrinterApp class*/
public class Review3PrintApp {
	
	public static void main(String[] args) {
		
		//### Printer객체 사용하기
		System.out.println("### Printer객체 사용하기");
		Review3Printer p1 = new Review3Printer();
		p1.refill();
		p1.print();
		
		//### ColorPrinter객체 사용하기
		System.out.println("### ColorPrinter객체 사용하기");
		Review3ColorPrinter p2 = new Review3ColorPrinter();
		p2.refill();
		p2.print();
		
		//### LaserPrinter 객체 사용하기
		System.out.println("### LaserPrinter 객체 사용하기");
		Review3LaserPrinter p3 = new Review3LaserPrinter();
		p3.refill();
		p3.print();
		
		//### LaserColorPrinter객체 사용하기
		System.out.println("### LaserColorPrinter객");
		Review3LaserColorPrinter p4 = new Review3LaserColorPrinter();
		p4.refill();
		p4.print();
	}
}
