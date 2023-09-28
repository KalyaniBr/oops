package PACK1;

public class arraysMD {
public static void main(String[] args) {
	
	int[][]ar= {{10,2,3,4,},{5,6,7,8},{9,10,11,12}};
	
	System.out.println(ar[2][3]);
	System.out.println(ar.length);
	
	System.out.println("----------print all data----------");
	
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=3;j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
}
}
