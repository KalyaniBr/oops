package PACK1;

public class else_if {
public static void main(String[] args) {
	int i=35;
	if(i>=75)
	{
		System.out.println("Distiction");
	}
	else if(i<=74 & i>=60)
	{
		System.out.println("First class");
	}
	else if(i<=59 & i>=50)
	{
		System.out.println("Second calss");
	}
	else if(i<=49 & i>=35)
	{
		System.out.println("Third class");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
