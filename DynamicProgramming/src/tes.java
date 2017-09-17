/*import java.util.Comparator;
import java.util.TreeSet;

public class tes {
	public static void main(String[] args) throws Exception {
	TreeSet<Bala> tree=new TreeSet<>(new Comparator<Bala>() {

		@Override
		public int compare(Bala s, Bala e) {
			return s.weight<e.weight?-1:1;
		}
	});
	tree.add(new Bala(2,4));
	tree.add(new Bala(1,5));	
	System.out.println(tree);
	}
}
class Bala{
	int weight;
	int name;
	Bala(int w,int n){
		this.weight=w;
		this.name=n;
	}
	@Override
	public String toString() {
		System.out.println(this.weight+" - "+this.name);
		return super.toString();
	}
}
*/