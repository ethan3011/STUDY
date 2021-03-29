package HTA0329;
/*
String[] name = {"김유신", "강감찬", "이순신", "홍길동", "류관순"};
Scanner sc = new Scanner(System.in);
System.out.print("조회할 이름을 입력하세요 : ");
String value = sc.next();
*/
import java.util.Scanner;
public class Review2 {
	public static void main(String[] args) {
		String[] name = {"김유신", "강감찬", "이순신", "홍길동", "류관순"};		//이름이 5개 들어간 배열을 생성한다.
		System.out.println("조회할 이름을 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		//입력한 이름이 배열에 존재하는지 확인해보기
		boolean isExist = false;										// 참 거짓 확인을 위해 isExist 변수를 생성한다.
		for(String names: name) {										// for 향상문으로 변수 names 에 name 배열을 불러와 한개씩 대입한다.
			if(names.equals(value)) {									// 입력한 값이 names 배열 안에 있는경우,
				isExist = true;											// isExist는 true가 된다.
				break;													// 확인이 되었으니 break;를 넣어 종료시킨다.
			}
		}
		sc.close();
		System.out.println("중복이름의 여부 : " + isExist + " 입니다.");
	}
}
