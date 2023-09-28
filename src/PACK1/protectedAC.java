package PACK1;

public class protectedAC {
 protected int a;
 protected char c;
 protected String s;
  
  protected protectedAC()
  {
	  a=20;
	  c='d';
	  s="Laptop";
  }
	protected void M1() {
		System.out.println(s);
		System.out.println(c);
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		protectedAC p=new protectedAC();
		p.M1();
		System.out.println(p.s);
	}
}
