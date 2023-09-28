package PACK1;

import java.util.Arrays;

public class arrays1 {
public static void main(String[] args) {
	

	int[]ar= {10,20,30,40,50};

	System.out.println(ar[0]);
	System.out.println(ar.length);
	
	System.out.println("-----print all data-----------");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(i);
	}
	
	System.out.println("-----------print data in ascending order-------- ");
	
	Arrays.sort(ar);
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(i);
	}
	System.out.println("-------------print in descending order------------");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(i);
	}
	
}
}
