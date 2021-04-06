package Algorithms;
/*
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
 * 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 테스트 케이스의 개수가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다.
 * 문자열은 O와 X만으로 이루어져 있다.
 * 
 * 각 테스트 케이스마다 점수를 출력한다.
 * 
 * 예제					//				출력
 * 5					//				
 * OOXXOXXOOO			//				10
 * OOXXOOXXOO			//				9
 * OXOXOXOXOXOXOX		//				7
 * OOOOOOOOOO			//				55
 * OOOOXOOOOXOOOOX		//				30
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class BAEKJOON8958 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		
		String[] arr = new String[testCase];
		
		for(int i=0; i<testCase; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		
		for(int i=0; i<testCase; i++) {
			
			int sum = 0;
			int count = 0;
			
				
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
				}else {
					count = 0;
				}
				sum += count;
			}
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
	}
}
