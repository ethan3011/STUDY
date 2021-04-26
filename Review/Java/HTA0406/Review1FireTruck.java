package HTA0406;

/*FireTruck class extends Car*/
public class Review1FireTruck extends Review1Car{
	

	private int water;
	
	//getter,setter 생성
	public int getWater() {
		return water;
	}
	
	public void setWater(int water) {
		this.water = water;
	}
	
	//suppressFire 메소드 (Fire suppression!!!!)
	public void suppressFire() {
		System.out.println("Frie suppression!!!!");
	}
}
