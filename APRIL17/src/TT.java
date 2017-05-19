import java.util.Hashtable;

public class TT {
	public static void main(String[] args) {
		Hashtable<Integer, Integer> in = new Hashtable<Integer, Integer>();
		Hashtable<Integer, Hashtable<Integer, Integer>> out = new Hashtable<Integer, Hashtable<Integer, Integer>>();
		out.put(0, new Hashtable<>());
		in.put(1, 2);
		System.out.println(in);
		in.put(2, 1);
		System.out.println(in);
		out.get(0).put(1, 2);
		out.get(0).put(2, 2);
		System.out.println(out);
	}
}
