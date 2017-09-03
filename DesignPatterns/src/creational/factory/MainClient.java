package creational.factory;

public class MainClient {
	public static void main(String[] args) {

		//Before: Problem is we are exposing clasees..
		Food biryani1=new Biryani();
		Food pizza1=new Pizza();
		
		//After
		FoodFactory food=new FoodFactory();
		Food biryani= food.getInstance("biryani");
		biryani.show();
		Food pizza= food.getInstance("pizza");
		pizza.show();
		
	}
}