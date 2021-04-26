package HTA0416.Review5;

import java.util.LinkedList;

///*QueueApp*/
public class QueueApp {
	
	public static void main(String[] args) {
		
		// 선입선출 형식(먼저 들어간게 먼저 출력된다)
		LinkedList<String > queue = new LinkedList<String>();
		
		
		//### Queue구현객체에 값 저장하기 (offer)
		System.out.println("### Queue구현객체에 값 저장하기 (offer)");
		queue.offer("치킨");
		queue.offer("라면");
		queue.offer("피자");
		queue.offer("보쌈");
		queue.offer("짜장");
		
		System.out.println("==================================================");
		
		//### Queue 구현객체에서 값꺼내기 (while, poll)
		System.out.println("### Queue 구현객체에서 값꺼내기");
		while(!queue.isEmpty()) {						//queue를 isEmpty 를 사용하여 false 면 멈추게 된다.(꺼낼때마다 값이 제거된다.)
			System.out.println(queue.poll());			// poll 메소드로 저장된 값을 불러온다(삭제한다).
		}
	}
}
