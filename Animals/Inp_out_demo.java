package Animals;

import java.time.LocalDate;

import java.util.* ;

public class Inp_out_demo {
          
	 public static void main(String args[]) {
		 
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("enter your name");
		 
		 String name = myObj.nextLine();
		 
		 // other input types :- nextBoolean() , nextChar() , nextLong(), nextInt() , etc.
//		 If you enter wrong input (e.g. text in a numerical input), you will get an exception/error message 
//		 (like "InputMismatchException")
		 
		 System.out.println(name);
		 
		 LocalDate myobj = LocalDate.now();         // store current date, for current time :- localTime.now()
		 System.out.println(myobj);
	 }
			 
	  
}
