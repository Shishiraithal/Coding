
public class ObjectReferencePreservation {
	//Object Reference Preservation: we can modify instance variables,but not the entire  obj
	public static void main(String[] args) throws Exception {
		
		A a = new A();
		a.x=10;
		System.out.println("1 Before : "+a.x);
		B b = new B();
		b.methodA(a);
		System.out.println("2 After Method : "+a.x);
	}
	
}
class A{
	int x;
}
class B{
	public void methodA(A a){
		System.out.println("2 Indside B : "+a.x);
		a.x=11;//but a=null; won't change the value outside.
		a=null;
		System.out.println("3 Inside After B : "+a);
	}
}
