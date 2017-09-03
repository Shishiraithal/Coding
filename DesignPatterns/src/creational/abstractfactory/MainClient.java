package creational.abstractfactory;

public class MainClient {
	public static void main(String[] args) {

		AnimalFactory landAnimalFactory=AnimalFactory.getInstance("land");
		landAnimalFactory.getAnimal("cat").speak();
		
		AnimalFactory seaAnimalFactory=AnimalFactory.getInstance("sea");
		seaAnimalFactory.getAnimal("fish").speak();
	}
}