
public class Methods {
	public static void main(String[] args) {
		System.out.println(add(1,2));
	}
	public static int add(int a,int b){
		return 10;
	}
	public static double add(double a,double b){
		return 10.12;
	}
	
	//ambiguity if add(int,int) or add(double,double)
	public static int add(int a,double b){
		return 10;
	}
	public static double add(double a,int b){
		return 10.12;
	}
}
