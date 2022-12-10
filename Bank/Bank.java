package Bank;

// to show method overriding and getter and setter implementation

public class Bank {
    
	 private int bal = 0;
	 
	 void setBalance(int amt) {
		  if(amt > 0 )this.bal += amt;
		  else System.out.println("invalid amount");
	 }
	 
	 int getBalance() {
		 return this.bal;
	 }
	 public float getrateofinterest() {return 0.0f;}           // overridden method
}
