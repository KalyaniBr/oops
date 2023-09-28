package PACK1;

public class This_and_superkeyword extends This_and_superkeyword1
{
	

	int a=10;
	
	public void M1() {
		int a=20;
		System.out.println(a);
	   System.out.println(this.a);
	   System.out.println(super.a);
}
	public static void main(String[] args) {
		This_and_superkeyword t=new This_and_superkeyword();
		t.M1();
	}
	
	
	
}
