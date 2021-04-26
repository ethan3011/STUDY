package HTA0413;

/*StringBuilderApp*/
public class Review2StringBuilderApp {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		//이름,전화번호,이메일,나이,키,몸무게,혈액형,결혼여부 값 추가
		sb.append("김갑산")
		.append("010-1111-2222")
		.append("gapgap@gap.gap")
		.append(18)
		.append(190)
		.append(90)
		.append('B')
		.append(true);
		//.toString()으로 출력
		String result1 = sb.toString();
		System.out.println(result1);
	}
}