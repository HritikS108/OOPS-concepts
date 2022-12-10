package Bank;

//The sub class cannot declare a method with the same name of an already existing method 
//in the super class with a different return type.

//However, the subclass can declare a method with the same signature as in super class. 
//We call this "Overriding".

public class Hdfc extends Bank {
     
	 public float getrateofinterest() {return 7.5f ;}
}
