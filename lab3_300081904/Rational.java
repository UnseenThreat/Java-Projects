public class Rational{


	private int numerator;
	private int denominator;
	private boolean alreadyExecuted;

	// Constructors
	// Formal
	public Rational(int numerator, int denominator){
		int[] reducedvalues;
		int reducednumerator;
		int reduceddenominator;

		reducedvalues = reduce(numerator, denominator);
		reducednumerator = reducedvalues[0];
		reduceddenominator = reducedvalues[1];
			
		
		if((numerator != reducednumerator) && (denominator != reduceddenominator)){
		
			this.numerator = reducednumerator;
			this.denominator = reduceddenominator;

		}
		else{
			this.numerator = numerator;
			this.denominator = denominator;
		}
		
	}
	// Informal
	public Rational(int numerator){
	
		this.numerator = numerator;
		this.denominator = 1;


	}
	public int getNumerator(){
		
		return numerator;
	
	}

	public int getDenominator(){
	
		return denominator;
	
	}

	private Rational plus(Rational b){
		Rational sum;

		if(this.denominator == b.denominator){
			 
			sum = new Rational((this.getNumerator() + b.getNumerator()), this.getDenominator());
			return sum;
			
		}
		else{
		
			sum = new Rational(((this.getNumerator() * b.getDenominator())+(b.getNumerator() * this.getDenominator())), (this.getDenominator() * b.getDenominator()));
			return sum;
		
		}
	}

	public static Rational plus(Rational a, Rational b){

		Rational sum;

		if(a.denominator == b.denominator){
			 
			sum = new Rational((a.getNumerator() + b.getNumerator()), a.getDenominator());
			return sum;
			
		}
		else{
		
			sum = new Rational(((a.getNumerator() * b.getDenominator())+(b.getNumerator() * a.getDenominator())), (a.getDenominator() * b.getDenominator()));
			return sum;
		
		}



	}

	private static int gcd(int a, int b){
	
		if (b == 0) {
			return a;
		}

		return gcd(b, a%b);

	}

	private int[] reduce(int numerator, int denominator){
		int gcd, reducednumerator, reduceddenominator;
		
		gcd = gcd(numerator, denominator);
		reducednumerator = numerator/gcd;
		reduceddenominator = denominator/gcd;
		int[] reducedvalues = new int[]{reducednumerator,reduceddenominator};
		return reducedvalues;
	
	}
	
	public String toString(){
	
		return (numerator + "/" + denominator);
	
	
	}

	public int compareTo(Rational o){
	
		if( (this.getNumerator() * o.getDenominator()) == (o.getNumerator() * this.getDenominator())){
			
			return 0;

		}
		
		if( (this.getNumerator() * o.getDenominator()) > (o.getNumerator() * this.getDenominator())){
			
			return 1;

		}
		return -1;
	
	}

}

