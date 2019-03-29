public class A1Q2{
	
	public static void main(String[] args){
		
		double [] a;
		a = new double[] {6.0, 6.0, 7.0, 1.0, 1.0, 1.0, 1.0, 4.5, 1.0};
		System.out.println(hasLengthTwoRun(a));
		
		}

		public static boolean hasLengthTwoRun(double[] a){

			int len = 0;

			for (int i = 0; (i< a.length - 1); i++) {
		
				if(a[i] == a[i+1]){
				
				return true;

				}	
			}	
		return false;
	}
}
