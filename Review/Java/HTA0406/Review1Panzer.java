package HTA0406;

/*Panzer extends PoliceCar*/
public class Review1Panzer extends Review1PoliceCar{
	
	private String weapon;
	
	//getter,setter 생성
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	//fireWeapon 메소드 (Fire a weapon!!!)
	public void fireWeapon() {
		System.out.println("Fire a weapon!!!");
	}
}
