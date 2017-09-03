import java.io.*; 
import java.util.*;
public class Dumm
{
 	public static void main (String[] args) throws java.lang.Exception 
 	{
     	String line; 
     	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in)); 
     	line=inp.readLine();
      	
	    int n=java.lang.Integer.parseInt(line);
		String sarr[]=inp.readLine().trim().split(" ");
		int arr[]=new int[11];
		java.util.TreeMap<Integer,Integer> map=new  java.util.TreeMap<>();
      	for(String str:sarr){
      		int v=Integer.parseInt(str);
      		if(!map.containsKey(v))
      			map.put(v,0);
      		map.put(v,map.get(v)+1);
      	}
      	java.util.TreeMap<Integer,Integer> res=new java.util.TreeMap<>();
      	java.util.Iterator<Integer> itr=map.keySet().iterator();
      	while(itr.hasNext()){
      		int v=itr.next();
      		res.put(map.get(v),v);
      	}
      	//System.out.println(res+" "+map);
      	System.out.println(res.pollLastEntry().getValue());
     	//Use the following code to print output
    }
}