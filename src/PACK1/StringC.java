package PACK1;

public class StringC {

	public static void main(String[] args) {
		
	//with using new keyword
		String s=new String ("Kalyani");
		String u=new String ("KALYANI");
		String t=new String ("BRAMHANKAR");
		String v=new String ("My Name is jayashri");
		String x=new String ("");
		
		
		// without using keywords
//		String s="Kalyani";
//		String u="KALYANI";
//		String t="BRAMHANKAR";
//		String v="My Name is jayashri";
//		String x="";
//		
//		
				
		
		
		System.out.println(s.toUpperCase());
		System.out.println(t.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.equals(u));
		System.out.println(s.equalsIgnoreCase(u));
		System.out.println(v.contains("is"));
		System.out.println(v.startsWith("My"));
		System.out.println(v.endsWith("jayashri"));
		System.out.println(v.charAt(8));
		System.out.println(t.charAt(0));
		System.out.println(t.indexOf('A'));
		System.out.println(t.lastIndexOf('A'));
		System.out.println(v.replace("My", "Her"));
		
		System.out.println(x.isEmpty());
		System.out.println(u.concat(t));
		System.out.println(s+u);
		System.out.println(v.substring(2,7));
		System.out.println(u.substring(6));
	}

}
