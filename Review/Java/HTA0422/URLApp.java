package HTA0422;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URLApp {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://www.puradakchicken.com/upload/mainbanner/hotpg-07.jpg");
		
		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("src/HTA0422/image.jpg");
		
		int num = 0;
		while((num = is.read())!= -1) {
			fos.write(num);
		}
		fos.close();
		System.out.println("파일복사에 성공하였습니다.");
	}
}
