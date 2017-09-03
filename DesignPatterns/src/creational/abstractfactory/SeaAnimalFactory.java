package creational.abstractfactory;

public class SeaAnimalFactory extends AnimalFactory{
	public Animal getAnimal(String val){
		Animal animal=null;
		if(val.equals("fish"))
			animal = new Fish();
		else if(val.equals("octopus"))
			animal = new Octopus();
		return animal;
	}
}