package HTA0416.Review5;

import java.util.Stack;

///*StackApp*/
public class StackApp {
	
	public static void main(String[] args) {
		
		// 선입후출 방식 (먼저 들어온게 마지막으로 나가는것) - 한개씩 쌓는방식
		Stack<String> burger = new Stack<String>();
		
		////Stack 객체에 값 저장(push)
		burger.push("위빵");
		burger.push("양상추");
		burger.push("토마토");
		burger.push("소스");
		burger.push("고기패티");
		burger.push("아래빵");
		
		
		////### Stack객체에서 값 꺼내기 (while, pop)
		while(!burger.isEmpty()) {				//Stack를 isEmpty 를 사용하여 false 면 멈추게 된다.(꺼낼때마다 값이 제거된다.)
			System.out.println(burger.pop());	// pop 메소드로 저장된 값을 불러온다(삭제한다).
		}
	}
}
