package HTA0408;

/*AccountCopyApp class*/
public class Review2AccountCopyApp {
	//main
	public static void main(String[] args) {
	
		//Account 3 배열 객체 생성
		Review2Account[] arr = new Review2Account[3];
		
		//Account 객체를 참조하고 있는 참조변수 배열 안에 값 저장
		arr[0] = new Review2Account("김치왕", 10000000, "kimchi123"); 
		arr[1] = new Review2SecretAccount("김치왕", 10000000, "kimchi123",828282); 
		arr[2] = new Review2Account("라면왕", 50000000, "ramen777"); 
				
		//향상된 for문으로 복사되는 계좌 출력와 복사할 수 없는 계좌를 나눠서 출력하기
		
		for(Review2Account item :arr) {
			if(item instanceof Review2UnCopiable) {
				System.out.println(item.getName()+"님의 계좌는 특수한 비밀번호가 설정되어 있어 복사되지 않습니다.");
			}else {
				System.out.println(item.getName()+"님의 잔액 : " + item.getBalance() + " / 비밀번호 : "+item.getPassword() + " 의 계정이 복사됩니다.");
			}
		}				
	}
}
