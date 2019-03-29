public class A1Q1{
	
	public static void main(String[] args){
		
		//System.out.println("Entrer les nombres");
		double [] a;
		a = new double[] {6.0, 6.0, 7.0, 1.0, 1.0, 1.0, 1.0, 4.5, 1.0};
		a = new double[] {-1.0, 2.0, 4.0, -3.0, 5.0};
		System.out.println(countPositive(a));
		
		
		}

	public static int countPositive(double[] a){
		
		int pos = 0;
		
		for(int i = 0; i < a.length; i++){
			
			if(a[i]>0){

			pos = pos + 1;

			}
		}
		return pos;
	}
}