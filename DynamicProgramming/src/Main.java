
public class Main {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("A");
			throw new Exception();
		} catch (Exception e) {
			System.err.println("B");
		} finally {
			System.out.println("C");
		}
		A a1 = new A(1);
		A a2 = new A(2);
		System.out.println("inside main: " + a1.val + ", " + a2.val);
		test(a1, a2);
		System.out.println("inside main: " + a1.val + ", " + a2.val);
	}

	private static void test(A a1, A a2) {
		a1.val = 3;
		A temp = a1;
		a1 = a2;
		a2 = temp;
		System.out.println("inside test: " + a1.val + ", " + a2.val);
	}

}

class A {
	int val = 10;

	A(int val) {
		this.val = val;
	}
}