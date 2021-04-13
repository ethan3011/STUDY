package HTA0413;

import java.util.Scanner;
public class TESTBONUS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] arr = a.split("\\.");
		
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		int C = Integer.parseInt(arr[2]);
		
		System.out.printf("%04d.%02d.%02d",A, B, C);
	}
}
