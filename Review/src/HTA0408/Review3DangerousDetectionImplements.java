package HTA0408;

/*위험물탐지 impl 위험물탐지 class*/
public class Review3DangerousDetectionImplements implements Review3DangerousDetection{

	//override 위험물회피
	@Override
	public void missoutDangerousDetection() {
		System.out.println("위험물을 회피합니다.");
	}
}
