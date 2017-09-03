package creational.abstractfactory;

public abstract class AnimalFactory {
	
	public abstract Animal getAnimal(String val);
	
	public static AnimalFactory getInstance(String val){
		AnimalFactory animal=null;
		if(val.equals("land"))
			animal = new LandAnimalFactory();
		else if(val.equals("sea"))
			animal = new SeaAnimalFactory();
		return animal;
	}
}