public class LocalAndInstanceVariables {
	public static void main(String[] args) {
		Instance ins= new Instance();
		ins.display();
	}
}
class Instance{
	int a;//instance varibeles
	String b;//these initialize automatically with default values when create object, if we don't pass any value
	public void display() {
		int c;//local variable
		System.out.println(a);//these won't initialize by default, should initialze otherwise throws compilation error
	}
}