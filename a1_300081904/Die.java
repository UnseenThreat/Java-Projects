import java.util.Random;


public class Die{

	// Constant
	public static final int MAXVALUE = 6;

	// initial values
	private int value;

	// Constructor
	public Die(){

		Random rand = new Random();
		int n = rand.nextInt(6) + 1;
		this.value = n;
	
	
	}
	
	// Getter
	public int getValue(){
	
		return value;

	}

	// Roll 
	public void roll(){
		
		Random rand = new Random();
		int n = rand.nextInt(6) + 1;
		this.value = n;
	
	}

	// toString
	public String toString(){
	
		return("Die {value: " + this.value +"}");
	
	}




	// Test
	/*
	public static void main(String[] args){
	
	Die d; 
	d = new Die(); 
	System.out.println(d.getValue()); 
	d.roll(); 
	System.out.println(d.getValue()); 
	System.out.println(d);

	} */

}