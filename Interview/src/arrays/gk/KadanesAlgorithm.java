package arrays.gk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class KadanesAlgorithm {
	public static void main(String[] args)  {
		Scanner scan=new  Scanner(System.in);
		int t = scan.nextInt();
		for (int test = 1; test <= t; test++) {
			int n =scan.nextInt();
			//String arr[] = br.readLine().trim().split(" ");
			int maxTillNow=0;;// = Integer.parseInt(arr[0]);
			int max = 0;
			for (int i = 0; i < n; i++) {
				
				max += scan.nextInt();//Integer.parseInt(arr[i]);
				if(i==0)
					maxTillNow=max;
				if (max > maxTillNow) {
					maxTillNow = max;
				}
				if (max < 0)
					max = 0;
			}

			System.out.println(maxTillNow);
			// output.append(maxTillNow + "\n");
		}
	}
}