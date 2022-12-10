//   static block  vs constructor

public class ConstructorTest {
    
//    static block :- The static blocks are executed at the time of class loading.
//    The static blocks are executed before running the main () method.
//If we want any logic that needs to be executed at the time of class loading that logic needs to 
//placed inside the static block 
	
		   static {
		      System.out.println("In Static Block!");
		   }
		   
//		   constructors :- executed while creating an object in Java.
//		                   The name of a constructor must be always the same name as a class.

		   
		   public ConstructorTest() {
		      System.out.println("In a first constructor!");
		   }
		   public ConstructorTest(int c) {
		      System.out.println("In a second constructor!");
		   }
		   
		   public static void main(String args[]) {
		      ConstructorTest ct1 = new ConstructorTest();
		      ConstructorTest ct2 = new ConstructorTest(10);
		   }
		}

