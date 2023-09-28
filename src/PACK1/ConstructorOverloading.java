package PACK1;

public class ConstructorOverloading {

	int a;
	String s;
	char c;
	float f;
	
	ConstructorOverloading()
	{
		a=10;
		s="Klayani";
		c='A';
		f=55.55f;
		
	}
	
	ConstructorOverloading(int b,String d,char g,float n)
	{
		a=b;
		s=d;
		c=g;
		f=n;
		
	}
	
	public void K1() {
		System.out.println(a);
		System.out.println(s);
		System.out.println(c);
		System.out.println(f);
	}
	
	
	
	public static void main(String[] args) {
		
	ConstructorOverloading C1=new ConstructorOverloading();
		C1.K1();
	    
		System.out.println("-------------------------------");
		
		ConstructorOverloading C2=new ConstructorOverloading(20,"Bramhankar",'D',11.11f);
		C2.K1();
		
	}		
	
	
	
}
