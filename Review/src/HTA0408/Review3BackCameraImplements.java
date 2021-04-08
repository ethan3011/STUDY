package HTA0408;

/*후방카메라구현 impl 후방카메라 class*/
public class Review3BackCameraImplements implements Review3BackCamera{
	
	//override 주차보조
	@Override
	public void supportParking() {
		System.out.println("주차를 보조합니다.");
	}
}
