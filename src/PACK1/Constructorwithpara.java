package PACK1;

public class Constructorwithpara {

	int a;
	String s;
	char c;
	float h;
	
	Constructorwithpara(int b,String t,char d,float i)
	{
		a=b;
		s=t;
		c=d;
		h=i;	
	}
	public void M1() {
		System.out.println(a+h);
		System.out.println( s+c);
		System.out.println(s);
	}
	public void M2() {
		System.out.println(h);
		System.out.println(s);
		System.out.println(c);
		System.out.println(a);
	}
	
		public static void main(String[] args) {
			Constructorwithpara C=new Constructorwithpara(10,"Kalyani",'B',45.76f);
			C.M1();
			C.M2();
			
			System.out.println("------------------------------------------");
			
		Constructorwithpara C1=new Constructorwithpara(20,"Bramhankar",'C',67.95f);
		C1.M1();
		C1.M2();
		
			
			
			
		}
		
		
		
	
	
	
	
	
}
