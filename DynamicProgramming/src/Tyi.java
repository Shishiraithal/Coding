import java.util.HashMap;

public class Tyi {
	public static void main(String[] args) throws Exception {

		User obj=new User("bala","in");
		HashMap<User, User> map=new HashMap<>();
		map.put(obj, obj);
		System.out.println(map);
		obj.fname="sai";
		map.get(obj);
		System.out.println(map);
	}

}

class User {
	String fname, lname;

	User(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		System.out.println(this.fname+" "+this.lname);
		return super.toString();
	}
}