package HTA0419.Review2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*PropertiesApp1*/
public class PropertiesApp1 {
	
	//main throws IOException
	public static void main(String[] args) throws IOException{

	//properties파일에 정의된 설정정보를 처리하는 Properties객체 생성하기
	Properties prop = new Properties();
	
	//database.properties파일을 읽어오는 FileReader객체를 생성한다.
	FileReader reader = new FileReader("src/HTA0419/Review2/database.properties");
	
	//Properties객체의 load()메소드로 properties파일을 읽어온다.
	prop.load(reader);
	
	//properties파일에 설정된 설정정보 조회하기
	String value1 = prop.getProperty("db.driver-ClassName");
	String value2 = prop.getProperty("db.url");
	String value3 = prop.getProperty("db.username");
	String value4 = prop.getProperty("db.password");

	//### 데이터베이스 연결관련 설정정보 출력
	System.out.println("### 데이터베이스 연결관련 설정정보 출력");
	System.out.println("클래스명 : " + value1);
	System.out.println("URL주소 : " + value2);
	System.out.println("아이디 : " + value3);
	System.out.println("비밀번호 : " + value4);
	
	//### 파일업로드 관련 설정정보 출력
	String value5 = prop.getProperty("file.upload.max-upload-size");
	String value6 = prop.getProperty("file.upload.save-directory");
	System.out.println("최대 업로드 사이즈 : " + value5);
	System.out.println("업로드 경로 : " + value6);
	}
}
