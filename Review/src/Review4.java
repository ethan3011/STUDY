/*
 * 91점 이상이면 "A", 81점 이상이면 "B", 71점 이상이면 "C"
 * 61점 이상이면 "D", 60점 이하는 "F"를 출력한다. 
 */
public class Review4 {
	public static void main(String[] args) {
		
		int score = 88;
		if(score > 90) {
			System.out.println("A");
		}else if(score > 80) {
			System.out.println("B");
		}else if(score > 70) {
			System.out.println("C");
		}else if(score > 60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	}
}
