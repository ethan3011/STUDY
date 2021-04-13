package HTA0413;

/*StringBufferApp*/
public class Review2StringBufferApp {
	
	public static void main(String[] args) {
	
		String name1 = "김유신";
		String name2 = "강감찬";
		String name3 = "이순신";
		StringBuffer sb = new StringBuffer();
		
		
		//.append() String 참조변수 입력
		sb.append(name1).append(",").append(name2).append(",").append(name3);
		
		//.toString() 출력
		String result1 = sb.toString();
		System.out.println(result1);
	}
}