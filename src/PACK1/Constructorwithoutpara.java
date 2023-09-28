package PACK1;

public class Constructorwithoutpara {

	int a;
	String s;
	char c;
	double d;
	
	Constructorwithoutpara()
	{
		a=10;
		s="Sneha";
		c='A';
		d=12.21d;
			
	}
	
	public void M1() {
		System.out.println(a+d);
	}
	
	public void M2() {
		System.out.println(s);
		System.out.println(c);
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		
		Constructorwithoutpara C=new Constructorwithoutpara();
		C.M1();
		C.M2();
		
		
		
		
	}
	
}
