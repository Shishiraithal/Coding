
public class CountBit {
	public static void main(String[] args) throws Exception {
		int val=43;
		int n=val;
		int count=0;
		while(n>0){
			count+=n&1;
			n>>=1;
		}
		System.out.println(count);
		n=val;
		count=0;
		while(n>0){
			count+=1;
			n=n&(n-1);
		}
		System.out.println(count);
	}
}
