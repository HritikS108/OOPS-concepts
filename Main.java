//     oops practice

import Animals.Cow ;
import Bank.* ;
import Vehicle.*;

public class Main {
    
	 public static void main(String args[]) {
		 
		  Car honda = new Car("black",250);
		  System.out.println(honda.weight);   // System.out.print() --> print in same line
		  
		  Splendor sp1 = new Splendor("red",110);
		  Bike sp2 = new Splendor("silver",110);   // upcasting
		  
		  System.out.println(sp1.weight);  
		  System.out.println(sp1.speedlim);   // normally
		  System.out.println(sp2.speedlim);   // it shows that runtime polymorphism can't be achieved by data members.
//		  We are accessing the data member by the reference variable of Parent class which refers to the 
//        subclass object.
//		  Since we are accessing the data member which is not overridden, hence it will access the 
//		  data member of the Parent class always
		  
		  Cow gauri = new Cow();
		  gauri.AnimalSound();
		  
		  Bank a = new Sbi();
		  Bank b = new Hdfc();
		  
		  // to show polymorphism :-
		  System.out.println(a.getrateofinterest());
		  System.out.println(b.getrateofinterest());
		  
		  String temp = "scsdv";
		  temp += 12;
		  System.out.println(temp);
		  
	 }
	 
	 
}
