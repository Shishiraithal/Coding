
public class Permutation {
	public static void main(String[] args) throws Exception {
		String str="abc";
		permute(str, 0, str.length());
	}

	private static void permute(String str, int left, int right) {
		if(left==right){
			System.out.println(str);
			return;
		}
		else{
			
			for(int i=left;i<right;i++){
				char arr[]=str.toCharArray();
				char temp=arr[i];
				arr[i]=arr[left];
				arr[left]=temp;
				permute(String.valueOf(arr),left+1,right);
			}
		}
	}
}
