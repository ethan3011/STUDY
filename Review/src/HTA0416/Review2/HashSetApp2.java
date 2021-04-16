package HTA0416.Review2;

import java.util.HashSet;
import java.util.Random;

//2./*HashSetApp2*/ 
public class HashSetApp2 {
	public static void main(String[] args) {
		
	//로또 번호 생성하기
	HashSet<Integer> lottoNumbers = new HashSet<Integer>(); // <>사이엔 객체만 대입될수 있으므로 int 대신 Integer 객체를 사용한다.
	
	
	//Random 객체 생성
	Random random = new Random();
	
	//while문으로 랜덤값 생성(1~45)
	while(true) {
		int number = random.nextInt(45) + 1;				// int 타입 random.nextInt로 1~45 사이의 값을 랜덤으로 부여한다.
		lottoNumbers.add(number);							// 랜덤으로 받은 1~45 숫자를 lottoNumbers에 대입한다.
		if(lottoNumbers.size() == 6) {						// 총 6개가 되면 멈추게 설정한다.
			break;
		}
	}
	System.out.println("자동로또번호 : " + lottoNumbers);		// HashSet 메소드는 중복을 허용하지 않는다.
	}
}
