package creational.factory;

public class FoodFactory {
	public Food getInstance(String val){
		Food food=null;
		if(val.equals("biryani"))
			food = new Biryani();
		else if(val.equals("pizza"))
			food = new Pizza();
		return food;
	}
}