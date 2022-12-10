
public class stringpool {

		 public static void main (String[] args)
		 {
		 String a = "hello";
		 String b = "hello";
		 String c = new String("hello");
		 //All three strings are equivalent
		 System.out.println(a.equals(b) && b.equals(c));
		 System.out.println(a == b);                 // as both a & b are referencing to same object in pool
		 System.out.println(a != c);
		 System.out.println(b != c);
		 }
	
}
