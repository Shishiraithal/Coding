package creational.abstractfactory;

public class LandAnimalFactory extends AnimalFactory{
	public Animal getAnimal(String val){
		Animal animal=null;
		if(val.equals("cat"))
			animal = new Cat();
		else if(val.equals("dog"))
			animal = new Dog();
		else if(val.equals("lion"))
			animal = new Lion();
		return animal;
	}
}