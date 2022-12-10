package Vehicle;

public class Bike extends Vehicle{
	
	public int speedlim = 100;
	
	 public Bike(String clr,int wt){
         this.color = clr;
         this.weight = wt;
   }
        
	public void horn() {
 	   System.out.println("blow horn form bike");
    }
}
