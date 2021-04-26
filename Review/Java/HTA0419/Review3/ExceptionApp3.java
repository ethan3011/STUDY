package HTA0419.Review3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*ExceptionApp3*/
public class ExceptionApp3 {
	
	//try ~ catch 구문을 사용해서 예외처리를 직접 수행함.
	//throws 키워드를 사용해서 예외처리를 이 메소드를 호출하는 측에게 예외처리를 위임(떠넘기기)함
	//main
	public static void main(String[] args) {
		divide();
		nullpoint();
		
		try {
			writer1("src/HTA0419/Review4/hey123", "강낭콩");
		} catch (FileNotFoundException e) {
			System.out.println("잘못된경로 입니다.");
		}
	}
	


	//예외를 직접처리하는 메소드를 사용하는 경우
	public static void divide() {
		try {
			System.out.println(0/0);			
		}catch(ArithmeticException e) {
			System.out.println("나누기 값이 없습니다.");
		}
	}
	
	public static void nullpoint() {
		try {
			
			String s1 = null;
			System.out.println(s1.length());
		}catch(NullPointerException e) {
			System.out.println("null값의 길이는 출력할수 없습니다.");
		}
	}
	
	
	
	//예외를 직접처리하지 않고 떠넘기는 메소드를 사용하는 경우
	public static void writer1(String path, String text) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(path);
		pw.write(text);
		pw.close();
	}
}
