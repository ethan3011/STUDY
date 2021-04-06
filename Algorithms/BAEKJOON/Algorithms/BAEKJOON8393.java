package Algorithms;

/*
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 1부터 n까지 합을 출력한다.
 * 
 * 예제			///			출력
 * 3			///			6
 * 
 */

import java.util.Scanner;
public class BAEKJOON8393 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		if(1<= n && n <=10000) {
			for(int i=0; i<=n; i++) {
				sum += i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}

