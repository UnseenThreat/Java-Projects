public class Card{
	// Constants
	public static final int DIAMOND = 0;
	public static final int CLUB = 1;
	public static final int HEART = 2;
	public static final int SPADE = 3;

	// Init 
	private int suit, rank;
	
	// Constructor
	public Card(int suit, int rank){
	
		this.suit = suit;
		this.rank = rank;
	
	}

	// Getters
	public int getSuit(){
	
		return suit;

	}

	public int getRank(){
	
		return rank;

	}

	public boolean equals(Object object){

		if(! (object instanceof Card)){
		
			return false;

		}
	    
		Card other;
		other = (Card) object;

		//Complete the implementation
		if(!(this.suit == other.suit) && (this.rank == other.rank)){
		
			return false;
		
		}
		
		return true;

	}

	public String toString(){
	
		return ("{"+this.suit+","+this.rank+"}");
	
	}

	// Test
	public static void main(String[] args){
	
		Card a, b, c; 
		a = new Card(2, 7); 
		b = new Card(2, 7); 
		c = new Card(0, 9); 
		System.out.println(a); 
		System.out.println(a.equals(b)); 
		System.out.println(a.equals(c));
		System.out.println(c.toString());

	}

	

}