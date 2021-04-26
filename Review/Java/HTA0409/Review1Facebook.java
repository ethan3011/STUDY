 package HTA0409;

/*Facebook impl SNS class*/
public class Review1Facebook implements Review1SNS{

	//post override 매개변수 값 출력
	@Override
	public void post(String title, String writer, String content) {
		System.out.println("=========================================================");
		System.out.println("페이스북에 포스팅 하기");
		System.out.println("제목 : " + title);
		System.out.println("글쓴이 : " + writer);		
		System.out.println("내용 : " + content);		
		System.out.println("=========================================================");
	}
	
	

}
