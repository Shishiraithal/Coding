package CollectionsLearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListLearn {
	public static void main(String[] args) {

		System.out.println(System.currentTimeMillis());
		
		ArrayList<Integer> a=new ArrayList<>(200);
		for(int i=0;i<202;i++)
			a.add(i);
		System.out.println(a);
		
		System.out.println(System.currentTimeMillis());
	}
}
