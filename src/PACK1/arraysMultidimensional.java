package PACK1;

public class arraysMultidimensional {
public static void main(String[] args) {
	int[][]ar=new int[3][2];
	
	ar[0][0]=10;
	ar[0][1]=20;
	ar[1][0]=30;
	ar[1][1]=40;
	ar[2][0]=50;
	ar[2][1]=60;
	
	System.out.println(ar[1][1]);
	System.out.println("----------print all data-----------");
	
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=1;j++)
		{
			System.out.print(ar[i][j]+"   ");
		}
		System.out.println();
	}
	
	
	
	
	
	
}
}
