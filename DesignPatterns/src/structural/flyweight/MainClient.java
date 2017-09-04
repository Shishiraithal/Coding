package structural.flyweight;

public class MainClient {
	public static void main(String[] args) throws Exception {

		//Note: Probelm here is if you update any object,it'll effect others to because of copy reference
		
		FlyweightPattern pattern = new FlyweightPattern();

		Player terrorist = pattern.getPlayer("terrorist");

		terrorist.assignWeapon("Gun");
		terrorist.mission();

		Player terrorist2 = pattern.getPlayer("terrorist");

		terrorist.assignWeapon("Gun2");
		terrorist.mission();
		
		Player cterrorist = pattern.getPlayer("counterterrorist");

		cterrorist .assignWeapon("Gun4");
		cterrorist .mission();

		Player cterrorist2= pattern.getPlayer("counterterrorist");

		cterrorist2.assignWeapon("Gun5");
		cterrorist2.mission();

	}
}
