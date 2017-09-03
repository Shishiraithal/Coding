package strctural.composite;

public class MainClient {
	public static void main(String[] args) throws Exception {
		
		//Leaf's
		Component mouse=new Leaf(500,"Mouse");
		Component keyboard=new Leaf(1000,"KeyBoard");
		
		Component ssd=new Leaf(5000,"SSD");
		Component ram=new Leaf(1000,"RAM");
		
		//Composite's
		Composite external=new Composite("External");
		external.addComponet(mouse);
		external.addComponet(keyboard);
		
		Composite internal=new Composite("Internal");
		internal.addComponet(ssd);
		internal.addComponet(ram);
		
		Composite laptop=new Composite("Laptop");
		laptop.addComponet(external);
		laptop.addComponet(internal);
		
		laptop.showPrice();
	}
}
