package PACK1;

public class DefaultAC {

	int a;
	String s;
	
	DefaultAC()
	{
		a=10;
		s="Klayani";
	}
	
	
	void M1()
	{
		System.out.println("Mehod 1");
	}
	public static void main(String[] args) {
		
		DefaultAC D2 =new DefaultAC();
		D2.M1();
		System.out.println(D2.a);
		System.out.println(D2.s);
	}
		
	}

