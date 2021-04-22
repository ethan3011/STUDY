package HTA0422;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedApp {
		
	public static void main(String[] args) throws IOException{
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("FileInputStream & FileOutputStream를 사용해서 복사해보기");
		FileInputStream fis = new FileInputStream("src/HTA0422/copytest.mp4");
		FileOutputStream fos = new FileOutputStream("src/HTA0422/copytest_copy1.mp4");
		
		int num = 0;
		while((num = fis.read()) != -1) {
			fos.write(num);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("FileInputStream & FileOutputStream를 사용해서 걸린 밀리초 : " + (endTime - startTime) + " 밀리초");
		
		
		System.out.println("BufferedOutputStream & BufferedInputStream를 사용해서 복사해보기");
		startTime = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/HTA0422/copytest.mp4"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/HTA0422/copytest_copy2.mp4"));
		
		int num2 = 0;
		while((num2 = bis.read())!= -1) {
			bos.write(num2);
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("BufferedOutputStream & BufferedInputStream를 사용해서 사용해서 걸린 밀리초 : " + (endTime - startTime) + " 밀리초");
		
	fis.close();
	fos.close();
	bis.close();
	bos.close();
		
	}
}
