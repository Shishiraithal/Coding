package strucutral.facade;

public class NonVegRestaurent implements Hotel{

	@Override
	public void getMenu() {
		System.out.println("NonVeg menu items");
	}

}
