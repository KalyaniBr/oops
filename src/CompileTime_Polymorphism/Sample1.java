package CompileTime_Polymorphism;

public class Sample1 {

	//In compile polymorphism method declaration is goining to get binded to 
	// to method defination at compilation time
	//based on arguments /parametrs//inputsis known as Compile time polymorphism
	
	//once binding is done ,again rebinding can't be done
	//so,it is called static binding
	
	//Method Overloading is example of compiletime_Polymorphism
	
   //Method overloading--> Declaring multiple methods with same name 
	//but with diff parameters/inputs/arguments in same class is called
	// Method overloading
	

	//2 int parameter
	
	public void method(int a,int b) {
		System.out.println(a+b);
	}
	public void method(int a,int b,int c) {
		System.out.println(a*b);
		System.out.println(a+b);
		System.out.println(c*a);
		
	}
	
	
	
	
	
	
	
	
	
	
}
