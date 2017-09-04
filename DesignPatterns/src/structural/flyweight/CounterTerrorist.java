package structural.flyweight;

public class CounterTerrorist implements Player{

	private String weapon;
	
	@Override
	public void assignWeapon(String weapon) {
		this.weapon=weapon;	
	}

	@Override
	public void mission() {
		System.out.println("Protecting with "+this.weapon);
	}
}
