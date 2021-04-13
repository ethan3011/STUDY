package HTA0413;

/*StringApp2*/
public class Review2StringApp2 {

	public static void main(String[] args) {
		
		String str1 = "qaWerdfsDfsa";
		//int length()
		int test1 = str1.length();
		//문자열의 길이를 반환한다.
		System.out.println("int length() : " + test1);

		
		//boolean isEmpty()
		boolean test2 = str1.isEmpty();
		//빈문자열인지 여부를 반환한다.
		System.out.println("boolean isEmpty() : " + test2);
		

		//boolean contains(CharSequence s)
		boolean test3 = str1.contains("d");
		//지정된 문자열을 포함하고 있는지 여부를 반환한다.
		System.out.println("//boolean contains(CharSequence s) : " + test3);
		

		//int indexOf(String str)
		int test4 = str1.indexOf("s");
		//지정된 문자열이 처음으로 등장하는 위치를 반환한다.
		System.out.println("int indexOf(String str) : " + test4);

		
		//int lastIndexOf(String str)
		int test5 = str1.lastIndexOf("f");
		//지정된 문자열이 맨 마지막으로 등장하는 위치를 반환한다.
		System.out.println("int lastIndexOf(String str) : " + test5);
		

		//String substring(int beginIndex)
		String test6 = str1.substring(4);
		//지정된 위치에서 문자열의 끝에 해당하는 글자로 구성된 문자열을 반환한다.
		System.out.println("String substring(int beginIndex) : " + test6);
		

		//String substring(int beginIndex, int endIndex)
		String test7 = str1.substring(2, 5);
		//지정된 시작위치에서 지정된 끝위치 앞까지 해당하는 글자로 구성된 문자열을 반환한다.
		System.out.println("String substring(int beginIndex, int endIndex) : " + test7);
		

		//String replace(CharSequence target, CharSequence replacement)
		String test8 = str1.replace("a", "8");
		//문자열에서 target에 해당되는 문자열을 찾아서 replacement에 지정된 문자열로 변경한 새로운 문자열을 반환한다.
		System.out.println("String replace(CharSequence target, CharSequence replacement) : " + test8);
		

		//String toLowerCase(), String toUpperCase()
		String test9 = str1.toLowerCase();
		String test10 = str1.toUpperCase();
		//문자열을 소문자, 대문자로 바뀐 새로운 문자열을 반환한다.
		System.out.println("String toLowerCase() : " + test9);
		System.out.println("String toUpperCase() : " + test10);
		

		//boolean starsWith(String prefix), boolean endWith(String suffix)
		boolean test11 = str1.startsWith("q");
		boolean test12 = str1.endsWith("f");
		//해당문자열이 prefix에서 지정한 내용으로 시작하는지,해당문자열이 suffix에서 지정한 내용으로 끝나는지 여부를 반환한다.
		System.out.println("boolean starsWith(String prefix) : " + test11);
		System.out.println("boolean endWith(String suffix) : " + test12);
		

		//String[] split(String exp)
		//문자열을 exp에서 지정한 표현식 혹은 구분자로 잘라서 각각의 요소를 배열에 담아서 반환한다.
		String foods = "치킨,피자,아이스크림,튀김,족발,보쌈";
		String[] arr1 = foods.split(",");
		for(String item :arr1) {
			System.out.println("String[] split(String exp) : " + item);
		}
		

		//String trim()
		//문자열에서 불필요한 좌우 공백이 제거된 새로운 문자열을 반환한다.
		String test13 = "                     안 녕 하 세요                                안 녕 안 녕                             ";
		String test14 = test13.trim();
		System.out.println("String trim() : " + test14);
		
	}
}