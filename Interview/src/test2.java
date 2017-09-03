
public class test2 {
	
	public static void main(String[] args) {
	
		int a[] = {1,4,3,2,5};
		int b[] = new int[5];
		int small;
		for(int i=0;i<a.length;i++){
			small = a[i];
			for(int j=i+1;j<a.length;j++){
				if(a[j] < small){
					small = a[j];
				}
			}			
			b[i] = small;
			
		}
		for(int j=0;j<b.length;j++){
			System.out.println(b[j]);
		}
		
	}
}
