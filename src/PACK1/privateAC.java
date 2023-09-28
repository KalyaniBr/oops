package PACK1;

public class privateAC {
   private int i=10;
   private String s="Kalyani";
	
	private void M1() {
		System.out.println(i);
		System.out.println(s);
	}
	public static void main(String[] args) {
		privateAC p=new privateAC();
		p.M1();
		System.out.println(p.i);
		System.out.println(p.s);
		
	}
	
	
}
