package HTA0326;

import java.util.Arrays;

public class Review3 {
	public static void main(String[] args) {


		
/*	 	for문을 이용 (중복 X)
	  while문을 활용해서 로또 번호 생성하기
	  1. 번호를 저장할 배열을 생성한다.
	  2. 중복체크가 끝난 숫자를 배열의 몇번째 칸에 저장해야 하는지 그 위치를 기억하는 변수를 만든다.
	  
	  3. while문을 사용해서 중복이 없는 로또번호가 만들어질 때까지 무한반복한다.
	  		(가). position값이 6이면 반복문을 탈출한다.
	  		(나). Math.random()을 이용해서 임의의 숫자(1~45)를 획득한다.
	  		(다). lotto 배열에 (나)에서 획득한 숫자가 저장되어 있는지 여부를 조사한다.
	  		   a. lotto배열에 숫자가 존재하는 여부를 담는 변수를 선언한다.(boolean타입의 변수)
	  		   b. for문을 사용해서 lotto배열에 저장된 값을 순서대로 조회한다.
	  		   c. (나)에서 획득한 번호와 일치하는지 조사해서 일치하면 숫자존재여부를 true로 설정한다. 
	  		(라). 저장여부를 조사했을 때 false로 판정되면, 
	  		   x. (나)에서 획득한 숫자를 lotto배열에 position이 가리키는 위치에 저장한다.
	  		   y. position의 값을 1증가시킨다. (숫자가 배열에 저장될 때만 position값이 1증가됨)
	  
	  4. 로또배열을 오름차순으로 정렬하고, 완성된 로또번호를 출력한다.
*/
	 
		int[] lotto = new int[6];						// 1. 번호를 저장할 배열을 생성한다.
		int position = 0;								// 2. 중복체크가 끝난 숫자를 배열의 몇번째 칸에 저장해야 하는지 그 위치를 기억하는 변수를 만든다.
	 
		while(true) {									// 3. while문을 사용해서 중복이 없는 로또번호가 만들어질 때까지 무한반복한다.
			if(position == 6) {							// (가). position값이 6이면 반복문을 탈출한다.
	   		break;
	 		}
			
	 		int random = (int)(Math.random() * 45) + 1;	// (나). Math.random()을 이용해서 임의의 숫자(1~45)를 획득한다.
	 													// (다). lotto 배열에 (나)에서 획득한 숫자가 저장되어 있는지 여부를 조사한다.
	 		boolean isExist = false;					// a. lotto배열에 숫자가 존재하는 여부를 담는 변수를 선언한다.(boolean타입의 변수)
	 		for(int check : lotto) {					// b. for문을 사용해서 lotto배열에 저장된 값을 순서대로 조회한다.
	 			if(check == random) {					
	 				isExist = true;						// c. (나)에서 획득한 번호와 일치하는지 조사해서 일치하면 숫자존재여부를 true로 설정한다. 
	 				break;
	 			}
	 		}
	 		
	 		if(!isExist) {								// (라). 저장여부를 조사했을 때 false로 판정되면, 
	 			lotto[position] = random;				// x. (나)에서 획득한 숫자를 lotto배열에 position이 가리키는 위치에 저장한다.
	 			position++;
	 		}
	 	}
	 	Arrays.sort(lotto);								// y. position의 값을 1증가시킨다. (숫자가 배열에 저장될 때만 position값이 1증가됨)
	 	for(int last : lotto) {
	 		System.out.print(last + " ");
	 	}

	    
		   /* 로또 번호 생성하기(중복 O)
			* 	1. 번호를 저장할 배열을 생성한다.
			* 	2. Math.random()을 이용해서 임의의 숫자(1~45)를 획득한다.
			* 	3. 완성된 로또번호를 출력한다.
			*
			*	
			*	int[] lotto = new int[6];					// 1. 번호를 저장할 배열을 생성한다.
			*	for(int random : lotto) {
			*	random = (int)(Math.random()* 45) + 1;  	// 2. Math.random()을 이용해서 임의의 숫자(1~45)를 획득한다.
			*	System.out.print(random + " ");				// 3. 완성된 로또번호를 출력한다.
			*}
			*/
		
	}

}
