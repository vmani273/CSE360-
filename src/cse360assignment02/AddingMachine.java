package cse360assignment02;

public class AddingMachine {
	
	/**
	 * Represent a machine which can perform several actions
	 * such as adding, subtracting, converting to a string, etc.
	 */
	
	  private int total;
	  private String transactions = "0";
	  
	  public AddingMachine () { 
	    total = 0;  // not needed - included for clarity
	  }
	  
	  /*
	   * return the current total
	   */
	  public int getTotal () { 
	    return total;
	  }
	  
	  /*
	   * adds the parameter to the total variable
	   */
	  public void add (int value) {
		  total += value;
		  transactions += " + " + value;
	  }
	  
	  /*
	   * subtracts the parameter from the total variable
	   */
	  public void subtract (int value) {
		 total -= value;
		 transactions += " - " + value;
	  }
	
	  public String toString () {
	    return transactions;
	  }
	  
	  /*
	   * clears the AddingMachine.
	   */
	  public void clear() {
		  total = 0;
	  }
	  
	  public static void main(String []args) {
	     AddingMachine test = new AddingMachine();
	     test.add(4);
	     test.subtract(2);
	     test.add(5);
	     System.out.println("Total: " + test.getTotal()); 
	     System.out.println("Sting: " +test.toString());
	   };
}


