public class Sum{

	public static void main(String[] args){
		int sum = 0;
		int[] args2;
		args2 = new int[args.length];
		for(int i = 0; i < args.length; i++){
			
			args2[i] = Integer.parseInt(args[i]);
			sum = sum + args2[i];
		
		
		}
	
		System.out.println("The sum is " + sum);
	
	
	}




}