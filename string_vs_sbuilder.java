
public class string_vs_sbuilder {
         
	    public static void main(String[] args) {
	    	
	    	 String s = new String("hello");
	    	 StringBuilder sb = new StringBuilder("hello");
	    	 String temp = s.concat(" abc");
	    	 sb.append(" abc");
	    	 
	    	 System.out.println(s);
	    	 System.out.println(sb.toString());
	    	 // above code shows that strings are immutable in java
	    	 // concatenation internally uses stringbuilder class
	    	 
	    	 System.out.println(temp);

	    } 
}
