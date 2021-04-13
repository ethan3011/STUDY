package HTA0413;

/*
 *  https://codeup.kr/problem.php?id=1019
 * 년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
 * 
 * 연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
 * 
 * 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
 * (%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
 * 
 * 2013.8.5
 * 
 * 2013.08.05
 */

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Bonus {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		System.out.println("년.월.일 을 입력해주세요.");
		
		String date = br.readLine();
		
		StringTokenizer st = new StringTokenizer(date,".");
		
		String yyyy = st.nextToken();
		String mm = st.nextToken();
		String dd = st.nextToken();
		
		if(yyyy.length() <=2) {
			bw.write("00"+yyyy);
		}else if (yyyy.length() <= 3){
			bw.write("0"+yyyy);
		}else{
			bw.write(yyyy);			
		}
		
		if(mm.length() == 1) {
			bw.write("."+"0"+mm+".");
		}else {
			bw.write("."+mm+".");
		}
		if(dd.length() == 1) {
			bw.write("0"+dd);
		}else {
			bw.write(dd);
		}
		
		bw.flush();
		bw.close();
	}
}