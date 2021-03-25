package HTA0325;
// break / continue
import java.util.Scanner;
public class Review3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("===============================");
			System.out.println("### 간단한 계산기에 오신걸 환영합니다.###");
			
			System.out.println("1.덧셈(+)  2.뺄셈(-)  3.곱셈(*) 4.나눗셈(/) 5.나머지구하기(%) 0.종료");
			int menuNo = sc.nextInt();
			
			if(menuNo ==1) {
				System.out.println("X + Y = Result");
				System.out.println("X의 값을 입력해주세요");
				double x = sc.nextDouble();
				System.out.println("X + Y = Result");
				System.out.println("Y의 값을 입력해주세요");
				double y = sc.nextDouble();
					System.out.println("입력하신 값은 " + x +"와" + y + "입니다.");
					System.out.println(x + "+" + y + " = " + ((x)+(y)) + "입니다.");	
					
			}else if(menuNo ==2) {
				System.out.println("★ -x -y를 더하시면 -x--(+)y가 됩니다.★");
				System.out.println("X - Y = Result");
				System.out.println("X의 값을 입력해주세요");
				double x = sc.nextDouble();
				System.out.println("X - Y = Result");
				System.out.println("Y의 값을 입력해주세요");
				double y = sc.nextDouble();
					System.out.println("입력하신 값은 " + x +"와" + y + "입니다.");
					System.out.println(x + "-" + y + " = " + ((x)-(y)) + "입니다.");
					
			}else if(menuNo ==3) {
				System.out.println("X * Y = Result");
				System.out.println("X의 값을 입력해주세요");
				double x = sc.nextDouble();
				System.out.println("X * Y = Result");
				System.out.println("Y의 값을 입력해주세요");
				double y = sc.nextDouble();
				if(x*y >= 0) {
					System.out.println("입력하신 값은 " + x +"와" + y + "입니다.");
					System.out.println(x + "*" + y + " = " + ((x)*(y)) + "입니다.");					
				}else{
					System.out.println("[오류] 잘못된 값이 입력되었습니다.");
					System.out.println("정확한 값을 입력해주세요.");
				}
				
			}else if(menuNo ==4) {
				System.out.println("X / Y = Result");
				System.out.println("X의 값을 입력해주세요");
				double x = sc.nextDouble();
				System.out.println("X / Y = Result");
				System.out.println("Y의 값을 입력해주세요");
				double y = sc.nextDouble();
				if(x*y >= 0) {
					System.out.println("입력하신 값은 " + x +"와" + y + "입니다.");
					System.out.println(x + "/" + y + " = " + ((x)/(y)) + "입니다.");					
				}else{
					System.out.println("[오류] 잘못된 값이 입력되었습니다.");
					System.out.println("정확한 값을 입력해주세요.");
				}
				
			}else if(menuNo ==5) {
				System.out.println("X % Y = Result");
				System.out.println("X의 값을 입력해주세요");
				double x = sc.nextDouble();
				System.out.println("X % Y = Result");
				System.out.println("Y의 값을 입력해주세요");
				double y = sc.nextDouble();
				if(x*y >= 0) {
					System.out.println("입력하신 값은 " + x +"와" + y + "입니다.");
					System.out.println(x + "%" + y + " = " + ((x)%(y)) + "입니다.");					
				}else{
					System.out.println("[오류] 잘못된 값이 입력되었습니다.");
					System.out.println("정확한 값을 입력해주세요.");
				}
				
			}else if(menuNo ==0){
				System.out.println("프로그램이 종료됩니다.");
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("[오류] 잘못된 값이 입력되었습니다.");
				System.out.println("처음 메뉴로 다시 돌아갑니다.");
			}
		}
//		continue 예제문
//		int sum =0;
//		for(int i=0;i<=100;i++) {
//			if(i%2==0) {
//				continue;
//			}sum += i;
//		}System.out.println("sum = " + sum);
	}
}