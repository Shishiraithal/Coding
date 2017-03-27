import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


class SPC1605 {
public static void main(String[] args) throws Exception{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
	String str=br.readLine().trim();
	System.out.println(find(str));
}
public static String find(String str){
	if(str.length()==1)
		return str;
	int total=1;
	for(char a:str.toCharArray())
	{
		int t=a-48;
		if(t!=0)
			total*=t;
	}
	return find(String.valueOf(total));
}
}
