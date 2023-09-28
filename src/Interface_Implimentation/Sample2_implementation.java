package Interface_Implimentation;

public class Sample2_implementation implements Sample1
{

	
	public void m1 () 
	{
		System.out.println("You are doing good");
		System.out.println(x);
	}
	
	
	public void m2()
	{
		
		System.out.println("How rare you doing");
		System.out.println(x);
	}
	
	public static void main(String[] args) {
	Sample2_implementation X=new Sample2_implementation();	
		X.m1();
		X.m2();
		System.out.println(Sample1.x);
		
		
		
	}
	
	
	
}
