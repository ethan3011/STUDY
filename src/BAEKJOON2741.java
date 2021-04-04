
/*
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 * 
 * 예제			//			출력
 * 5			//			1
 * 				//			2
 * 				//			3
 * 				//			4
 * 				//			5
 */

import java.io.*;

public class BAEKJOON2741 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int i = 1;
		StringBuilder sb = new StringBuilder();
		
		while(i<=N) {
			sb.append(i+"\n");
			i++;
		}
		System.out.println(sb);
	}
}
