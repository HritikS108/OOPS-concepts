
package Vehicle;
public class Car extends Vehicle {
	
	    // declare attributes as 'final' if dont want to override
	     public int speedlim = 120;
	    // constructor
	       public Car(String clr,int wt){
	             this.color = clr;
	             this.weight = wt;
	       }
	       
	    // methods
	       public void horn() {
	    	   System.out.println("blow horn form car");
	       }
	

}



