public class Timer {
	private int hours;
	private int minutes;
	private int seconds;

	public Timer(){
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public void incrementHours(){
		// Your code here.
		if(hours == 23){

			hours = 0;

		}
		else{

			hours = hours + 1;
			
		}
	}

	public void decrementHours(){
		// Your code here.
		if(hours == 0){
			
			hours = 23;
			
		}
		else{
		
			hours = hours - 1;

		}
	}

	public int getHours(){
		return hours;
	}

	public void incrementMinutes(){
		// Your code here.
		if(minutes == 59){
			
			hours = hours + 1;
			minutes = 0;
			
		}
		else{
		
			minutes = minutes + 1;

		}
	}
	public void decrementMinutes(){
		// Your code here.
		if(minutes == 0){
			
			hours = hours - 1;
			minutes = 59;

		}
		else{
		
			minutes = minutes - 1;

		}

	}

	public int getMinutes() {
		return minutes;
	}

	public void incrementSeconds(){
		// Your code here.
		if(seconds == 59){
			
			minutes = minutes + 1;
			seconds = 0;

		}
		else{
		
			seconds = seconds - 1;

		}


	}

	public void decrementSeconds(){
		// Your code here.
		if(seconds == 0){
			minutes = minutes - 1;
			seconds = 59;
		}
		else{
		
			seconds = seconds - 1;

		}
	}
	
	public int getSeconds(){
		return seconds;
	}

	public String toString () {
		return "Timer "+hours+":"+minutes+":"+seconds;
	}
}