package HTA0413;


/*StringApp3*/
public class Review2StringApp3 {

	public static void main(String[] args) {
		
		//정수, 실수, 문자, 불린값을 문자열로 바꾸기

		
		//String String.valueOf(boolean value)
		String result1 = String.valueOf(false);
		
		//String String.valueOf(int value)
		String result2 = String.valueOf(3);
		
		//String String.valueOf(long value)
		String result3 = String.valueOf(50000000L);
		
		//String String.valueOf(double value)
		String result4 = String.valueOf(123.45125112);
		
		//String String.valueOf(char value)
		String result5 = String.valueOf('F');
		
		System.out.println("String String.valueOf(boolean value) : " + result1);
		System.out.println("String String.valueOf(int value) : " + result2);
		System.out.println("String String.valueOf(long value) : " + result3);
		System.out.println("String String.valueOf(double value) : " + result4);
		System.out.println("String String.valueOf(char value)) : " + result5);
		
	}
}