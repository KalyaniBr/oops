package PACK1;

public class nested_if {
public static void main(String[] args) {
	
	int i=78;  
	if(i>=35)  //outer if
	{
		System.out.println("pass");
		if(i>=75)   ///inner if nested if
		{
			System.out.println("Distiction");
		}
	}
		else
		{
			System.out.println("Fail");
		}
	
	
	
}
}
