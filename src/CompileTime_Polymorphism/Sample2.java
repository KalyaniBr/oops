package CompileTime_Polymorphism;

public class Sample2 {

	public void M1(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public void M1(String s,int d) 
	{
		System.out.println(s);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Sample2 s2=new Sample2();
		s2.M1(10,20);
		s2.M1("Kalyani",20);
	}
}
