package casting;

public class Testupcasting {

	public static void main(String[] args) {
		UpcastingSon A=new UpcastingSon();
		A.Home();
		A.car();
		A.Money();
		A.bike();
		
//For Upcasting create Object of subclass with reference of superclass	
		
		upcastingFather h =new UpcastingSon();
		h.Home();
		h.car();
		h.Money();
		
		
	}
	
	
	
	
	
	
	
	
	
}
