package Algorithms;
/*
 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
 * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
 * 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * 
 * 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 * 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 * 
 * 예제				//				출력			ㅣ		예제				//				출력	ㅣ
 * 1				//				10			ㅣ		42				//				1	ㅣ
 * 2											ㅣ		84				//					ㅣ
 * 3											ㅣ		252				//					ㅣ
 * 4											ㅣ		420				//					ㅣ
 * 5											ㅣ		840				//					ㅣ
 * 6											ㅣ		126				//					ㅣ
 * 7											ㅣ		42				//					ㅣ
 * 8											ㅣ		84				//					ㅣ
 * 9											ㅣ		420				//					ㅣ
 * 10											ㅣ		126				//					ㅣ
 * 각 수를 42로 나눈 나머지는 1, 2, 3, 4, 5,			ㅣ			모든 수를 42로 나눈 나머지는 0이다.		ㅣ		 
 * 6, 7, 8, 9, 10이다.					
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BAEKJOON3052 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[42];
		
		for(int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine())%42]= true;
		}
		br.close();
		int count=0;
		for(boolean isTrue :arr) {
			if(isTrue) {
				count++;
			}
		}
		System.out.println(count);
	}
}
