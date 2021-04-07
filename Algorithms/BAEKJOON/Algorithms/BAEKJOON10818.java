package Algorithms;
/* 
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * 
 * 예제				//				출력
 * 5								7 35
 * 20 10 35 30 7
 */

import java.io.*;
import java.util.StringTokenizer;
public class BAEKJOON10818 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] numbers = new int[N];
			int min = 1000000;
			int max = -1000000;

			for(int i=0; i<N; i++) {
				numbers[i] = Integer.parseInt(st.nextToken()); 
				if(numbers[i] >= max) {
				max = numbers[i];
				}
				if(numbers[i] <= min) {
					min = numbers[i];
				}	
			}
			bw.write(min + " " + max);
			bw.flush();
			bw.close();
	}
}
