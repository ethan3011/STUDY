
/*
 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
 * 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 * 
 * 예제			//			출력
 * 5
 * 1 1			//			2
 * 12 34		//			46
 * 5 500		//			505
 * 40 60		//			100
 * 1000 1000	//			2000
 * 
 */

import java.io.*;
import java.util.StringTokenizer;
public class BEAKJOON15552 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
	}
}

