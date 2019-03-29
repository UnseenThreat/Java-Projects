public class A1Q3{

	public static void main(String[] args){

		double[] a;
		a = new double[] {6.0, 6.0, 7.0, 1.0, 1.0, 1.0, 1.0, 4.5, 1.0};
		
		System.out.println(getLongestRun(a));
	}

	public static int getLongestRun(double[] a){
		int run, longestrun;
		run = 0;
		longestrun = 0;
		
		for(int i = 0; i < a.length - 1; i++){

			if(a[i] == a[i+1]){

				run = run + 1;

			}
			
			if(run > longestrun){

				longestrun = run;
			
			}
		}

		return longestrun;
	}

	public static int getLongestRun(String[] a){
		
		int run, longestrun;
		run = 0;
		longestrun = 0;

		for(int i = 0; i < (a.length - 1); i++){
			

				if(a[i] == a[i+1]){

					run = run + 1;

				}
			
				if(run > longestrun){

					longestrun = run;
			
				}
			}

		return longestrun;
	
	}
}