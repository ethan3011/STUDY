package HTA0421;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderApp2 {

	public static void main(String[] args) {
		try(FileReader fileReader = new FileReader("src/day1/students.txt");
				BufferedReader br = new BufferedReader(fileReader)){
			
			String text = null;
			// readLine()으로 읽어온 텍스트를 text 변수에 대입하고, 그 값이 null이 아닐때까지 반복
			while((text = br.readLine()) !=null) {
//				System.out.println(text);
				
				// 류관순 80,70,60 -> {"류관순", "80", "70", "60"}
				String[] values = text.split(",");
				
				String name = values[0];
				int kor = Integer.parseInt(values[1]);
				int eng = Integer.parseInt(values[2]);
				int math = Integer.parseInt(values[3]);
				int total = kor+eng+math;
				int average = total/3;
				
				System.out.println("학생이름 : " + name);
				System.out.println("국어점수 : " + kor);
				System.out.println("영어점수 : " + eng);
				System.out.println("수학점수 : " + math);
				System.out.println("총   합 : " + total);
				System.out.println("평   균 : " + average);
				System.out.println("===========================");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
 