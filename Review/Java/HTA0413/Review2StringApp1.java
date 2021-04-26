package HTA0413;

/*StringApp1*/
public class Review2StringApp1 {
	
	public static void main(String[] args) {

		String a = "안녕";
		String b = "안녕";
		String c = new String("안녕");
		String d = new String("안녕");
		boolean t1 = a == b;
		boolean t2 = a.equals(b);
		boolean t3 = c == d;
		boolean t4 = c.equals(d);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}
}