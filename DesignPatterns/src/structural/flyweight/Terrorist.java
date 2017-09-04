package structural.flyweight;

public class Terrorist implements Player{

	private String weapon;
	
	@Override
	public void assignWeapon(String weapon) {
		this.weapon=weapon;
	}

	@Override
	public void mission() {
		System.out.println("Attacking with "+this.weapon);
	}
}
