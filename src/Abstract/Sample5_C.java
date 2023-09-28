package Abstract;

public class Sample5_C extends Sample5_A
{

	public void M3() 
	{
		System.out.println("GE");
	}
	
	public void M4() {
		System.out.println("GN");
	}
	
	
	public static void main(String[] args) {
		
		Sample5_C s=new Sample5_C();
		s.M1();
		s.M3();
		s.M4();
		
		M2();
	}
}
