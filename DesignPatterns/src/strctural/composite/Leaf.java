package strctural.composite;

public class Leaf implements Component{
	
	int price;
	String name;
	
	Leaf(int price,String name){
		this.price=price;
		this.name=name;
	}
	
	@Override
	public void showPrice() {
		System.out.println(this.name+" : "+this.price);
	}
}
