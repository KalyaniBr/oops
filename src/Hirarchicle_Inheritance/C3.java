package Hirarchicle_Inheritance;

public class C3 extends P1
{

	public void M5() {
		System.out.println("Fifth");
	}
	public void M6() {
		System.out.println("Sixth");
	}
	
	public static void main(String[] args) {
		
	System.out.println("-------class3------");
	C3 C1=new C3();
	C1.M1();
	C1.M2();
	C1.M5();
	C1.M6();
	
	System.out.println("----------class2----------");
	C2 C2=new C2();
	C2.M1();
	C2.M2();
	C2.M3();
	C2.M4();
	
	System.out.println("--------class1------------");
	
	C1 C3=new C1();
	C3.M1();
	C3.M2();
	C3.M7();
	C3.M8();
	
	}
	
}
