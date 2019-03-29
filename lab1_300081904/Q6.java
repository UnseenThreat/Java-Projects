import java.util.Scanner;

public class Q6{
	public static void main(String[] args){
		
		System.out.println("Enter 10 entries as an array.");
		Scanner scanEntries = new Scanner(System.in);
		double[] entries;
		entries = new double[10];
		int count = 0;
		while(count < 10){
		 
		 entries[count] = scanEntries.nextDouble();

		 count = count + 1;
		 }
		int i, j, argMin;
		double tmp;
		
		for (i = 0; i < entries.length - 1; i++) {
			argMin = i;
			for (j = i + 1; j < entries.length; j++) {
				if (entries[j] < entries[argMin]) {
					argMin = j;
				}
			}

		tmp = entries[argMin];
		entries[argMin] = entries[i];
		entries[i] = tmp;

	 	}
		System.out.println("Average: " + calculateAverage(entries));
		System.out.println("Median: " + calculateMedian(entries));
		System.out.println("Failed: " + calculateNumberFailed(entries));
		System.out.print("Passed: " + calculateNumberPassed(entries));
	}

	public static double calculateAverage(double[] notes){
		double result = 0;
		for(int i = 0; i < notes.length; i++){

            result = result + notes[i];

			}	
		return (result/notes.length);
	}

	public static double calculateMedian(double[] notes){
		
		return ((notes[(notes.length/2)] + notes[(notes.length/2)-1])/2);

	}

	public static int calculateNumberFailed(double[] notes){
		int fails = 0;
		for(int i = 0; i < notes.length; i++){

            if(notes[i]<50){

				fails = fails + 1;
			
				}

			}	
		return fails;
	}

	public static int calculateNumberPassed(double[] notes){

		int passes = 0;
		for(int i = 0; i < notes.length; i++){

				if(notes[i]>50){

					passes = passes + 1;
			
					}

				}	
		return passes;	
	}

}