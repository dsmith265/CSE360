package cse360assignment02;

public class AddingMachine {
	
	//Total summation variable
	private int total;
	private String history;
	
	//construct
	public AddingMachine() {
		total = 0;
		history = "0";
	}
	
	//get summation function
	public int getTotal() {			
		return total;
	}
	
	//adds given value to total 
	public void add(int value) {
		total += value;
		history += (" + "+value);
	}
	
	//subtracts given value from total
    public void subtract(int value) {
    	total -= value;
    	history += (" - "+value);
    }
    
	//return history as a string
	public String toString() {	
		return history;
	}
	
	//resets the machine
	public void clear() {
		history = "0";
	}
		
	public static void main(String[]args) {
	
	AddingMachine myCalculator = new AddingMachine();
	myCalculator.add(4);
	myCalculator.subtract(2);
	myCalculator.add(5);
	System.out.println(myCalculator.toString());
	System.out.println(myCalculator.getTotal());
	myCalculator.clear();
	System.out.println(myCalculator.toString());
		
    }
}