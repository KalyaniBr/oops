package Abstract;

public class Sample6_C extends Sample6_A
{

	public  void X2() 
	{
		System.out.println("Run from diff class");
	}
	public void X3()
	{
		System.out.println("Running from diff class");
	}
	
	public static void main(String[] args) {
		Sample6_C s6=new Sample6_C();
		s6.X2();
		s6.X3();
		
	}
	
}
