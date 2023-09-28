package Generalization;

public class Implementation2 {
public static void main(String[] args) {
	
System.out.println("--------Pack1 Contains----------");
	pack1 Dup1=new pack1();
	Dup1.Gift();
	Dup1.Flowers();
	Dup1.Fruits();
	Dup1.Biscuits();
	
	System.out.println("-----------Pack2 Contains-------------");
	
	Pack2 Dup2=new Pack2();
	Dup2.Gift();
	Dup2.Flowers();
	Dup2.Fruits();
	Dup2.cake();
	
	System.out.println("----------Pack3 Contains-------------");
	Pack3 Dup3=new Pack3();
	Dup3.Gift();
	Dup3.Flowers();
	Dup3.Fruits();
	Dup3.Chocolates();
	
	System.out.println("------------Pack4 Contains-------------");
	Pack4 Dup4=new Pack4();
	Dup4.Gift();
	Dup4.Flowers();
	Dup4.Fruits();
	Dup4.Dryfruits();
	
}
}