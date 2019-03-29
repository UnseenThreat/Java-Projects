public class DoorLock{
		// Constant.

		public static final int MAX_NUMBER_OF_ATTEMPTS = 3;

		// Instance variables.

		private Combination combinationer;
		private int numberOfAttempts;
		private boolean open;
		private boolean activated;

		// Constructor.

		public DoorLock(Combination combination){
			
			open = false;
			activated = true;
			numberOfAttempts = 0;
			combinationer = combination;

		}
		
		// Access methods.

		public boolean isOpen(){
			return open;
		}

		public boolean isActivated(){
			return activated;
		}

		// Notice that numberOfAttempts is compared to
		// MAX_NUMBER_OF_ATTEMPTS only when its value has been
		// incremented, Also, numberOfAttempts should be set to zero when
		// activated is false.  Problems related to the combined action of
		// these two variables have caused problems for some students.

		public void activate(Combination c){

			if(c.equals(combinationer)){
				activated = true;
			}

		}

		public boolean open(Combination combination){
			
			if(activated == false){
				return false;	
			}
			if(combination.equals(combinationer)){
				this.numberOfAttempts = this.numberOfAttempts + 1;
				if(this.numberOfAttempts % MAX_NUMBER_OF_ATTEMPTS == 0){
				this.activated = false;}
				return false;
				}
			this.numberOfAttempts = 0;
			this.open = true;
			return true;
			}
		
	}
