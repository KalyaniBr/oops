package PACK1;

public class GeneralizationTest {

	public static void main(String[] args) {
		
	System.out.println("------------1----------");	
		
	GeneralizationC1 G1=new GeneralizationC1();
	G1.Home();
	G1.car();	
	G1.bike();	
	G1.Money();	
		
	System.out.println("------------2----------");	

	GereralizationC2 G2=new GereralizationC2();
	G2.bike();
	G2.car();
	G2.Home();
	G2.Money();
	
	System.out.println("------------1----------");	
 
	GenralizationC3 G3=new GenralizationC3();
	G3.bike();
	G3.car();
	G3.Home();
	G3.Money();
	
	}	
}
