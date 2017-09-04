package strucutral.facade;

public class MainClient {
	public static void main(String[] args) throws Exception {
		HotelKeeper keeper=new HotelKeeper();
		keeper.getNonVeg();
		keeper.getVeg();
	}
}
