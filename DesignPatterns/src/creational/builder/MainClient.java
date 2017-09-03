package creational.builder;

public class MainClient {
	public static void main(String[] args) {
		//Before: create phone object is very difficult..need to keep order of passing values also
		Phone phone1=new Phone("Nokia","Symbion", 3000, 2015);
		System.out.println(phone1);
		
		//After..order is not importent.. flexible/readable
		Phone phone=new PhoneBuilder().setBrand("Nokia").setCost(3000).setOs("Symbion").getPhone();
		System.out.println(phone);
	}
}