package Generalization;

public class implementation {
public static void main(String[] args) {
	System.out.println("---------------------Jio Features_________________________");
	Jio copy1=new Jio(); 
	copy1.sms();
	copy1.audiocalling();
	copy1.data();
	copy1.FeatureA();
	
	System.out.println("-----------------------VI Features_____________________________");
	
	VI copy2=new VI();
	copy2.sms();
	copy2.audiocalling();
	copy2.data();
	copy2.FeatureB();
	
	System.out.println("--------------------------airtel Features_________________________");
	
	airtel copy3=new airtel();
	copy3.sms();
	copy3.audiocalling();
	copy3.data();
	copy3.FeatureC();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
