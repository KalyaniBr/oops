package PACK1;

public class Stirng {
public static void main(String[] args) {
	
	
	String s="Kalyani";
	String j="JAYASHRI";
	
		System.out.println(s.length());	
		System.out.println(s.toUpperCase());
		System.out.println(j.toLowerCase());
	    System.out.println(s.equals(j));
	 System.out.println(j.equalsIgnoreCase(s));
	System.out.println(j.startsWith("J"));
	System.out.println(s.endsWith("y"));
	System.out.println(s.indexOf("K"));
	System.out.println(j.lastIndexOf("A"));
	System.out.println(s.charAt(1));
	System.out.println(s.replace("y", "a"));
	System.out.println(s+j);
	System.out.println(s.concat(j));
System.out.println(s.substring(0,3));
System.out.println(j.contains("JAYA"));

}
}