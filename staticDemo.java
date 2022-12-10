import java.util.*;
	 
public class staticDemo {
       
//	// static variable :- When you declare a variable as static, then a single copy of the variable is created and 
//	                      divided among all objects at the class level. Static variables are, essentially, global 
//	                      variables. Basically, all the instances of the class share the same static variable.
	static int j = n();
	 
	// static block
	static {
	System.out.println("Inside the static block");
	}
	 
	// static method :- Methods declared as static can have the following restrictions:
//	                    i). They can directly call other static methods only.
//                     ii). They can access static data directly.
	static int n() {
	System.out.println("from n ");
	return 20;
	}
	 
	// static method(main !!)
	public static void main(String[] args)
	{
	System.out.println("Value of j : "+j);
	System.out.println("Inside main method");
	}
	}
