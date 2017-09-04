package strucutral.facade;

public class HotelKeeper {
	public void getVeg(){
		Hotel veg=new VegRestaurent();
		veg.getMenu();
	}
	public void getNonVeg(){
		Hotel nonVeg=new NonVegRestaurent();
		nonVeg.getMenu();
	}
}
