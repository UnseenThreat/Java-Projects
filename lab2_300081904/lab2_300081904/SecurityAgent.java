public class SecurityAgent{

	

	// Instance variables
	Combination secret;
	DoorLock doorlock;

	// Constructor
	public SecurityAgent(){

		int first, second, third;

		first = (int) (Math.random()*5) + 1;
		second = (int) (Math.random()*5) + 1;
		third = (int) (Math.random()*5) + 1;

		secret = new Combination(first, second, third);
		
		doorlock = new DoorLock(secret);

	}


	public DoorLock getDoorLock(){
	
		return doorlock;
	
	}

	public void activateDoorLock(){
	
		doorlock.activate(secret);
	
	}





}