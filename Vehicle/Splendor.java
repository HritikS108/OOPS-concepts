package Vehicle;

//Note :-  a class which has no constructor has a default constructor, which is argument-less and 
//         is equivalent to the following code, thats why it showed error earlier when constructor
//         was missing.

//			public child() {
//			    super();
//			}
// To overcome error :- i)You have to add a no-args constructor to the base class.
//                      ii)Another way is call super() with the required argument as a first statement 
//                      in derived class constructor

public class Splendor extends Bike {
     
	      public int speedlim = 120;
	      
	       public Splendor(String clr,int wt){
	    	   super(clr,wt);
	       }
}

//very imp note :-  You don't have to provide any constructors for your class, but you must be careful when doing this. 
//The compiler automatically provides a no-argument, default constructor for any class without constructors. 
//This default constructor will call the no-argument constructor of the superclass. In this situation, the compiler will 
//complain if the superclass doesn't have a no-argument constructor so you must verify that it does.