import java.util.Scanner;
public class RationalNums {
	private int num;
	private int denom;
	private String fraction;
	Scanner key = new Scanner(System.in);
	
	/**
	 * Default Constructor
	 */
	public RationalNums() {	
		num = 0;
		denom = 1;
	}
	
	/**
	 * 2 Argument Constructor
	 * @param n
	 * @param d
	 */
	public RationalNums(int n, int d) {	
		num = n;
		denom = d;
	}
	
	/**
	 * Accessor(getter), return the numerator
	 * @return
	 */
	public int getNumerator() {	
		return num;
	}
	
	/**
	 * Accessor(getter), return the denominator
	 * @return
	 */
	public int getDenominator() { 
		return denom;
	}
	
	/**
	 * Modifier(setter), set the numerator to value
	 */
	public void setNumerator(int n) { 
		num = n;
	}
	
	/**
	 * Modifier(setter), set the denominator to a value
	 * @param d
	 */
	public void setDenominator(int d) { 
		denom = d;
	}
	
	/**
	 * Input the numerator & denominator from the keyboard
	 */
	public void inputRational() { 
		System.out.println("Enter a Numerator: ");
		num = key.nextInt();
		System.out.println("Enter a Denominator: ");
		denom = key.nextInt();
	}
	
	/**
	 * Return a string in the form numerator/denominator
	 * @return
	 */
	public String tostring() {	
		fraction = num +"/"+denom;
		//System.out.print(fraction);
		if (num % denom == 0){
			return Integer.toString(num/denom);
		}
		return fraction;
	}
	
	/**
	 * return the greatest common divisor
	 * @param m
	 * @param n
	 * @return
	 */
	private int gcd(int m, int n) { 

		
		while ( m != n )
		{
			if ( m > n ) 
				m = m - n;
			else
				n = n - m;

		}
		return m;

	}
	/**
	 * Pass through both of the fractions and cross multiply to add
	 * @param r1
	 * @param r2
	 */
	public static void add(RationalNums r1,RationalNums r2) {
		
		//Got the common denominator of both rational numbers
		int commonDenominator = r1.getDenominator() * r2.getDenominator(); 
		
		//Cross multiply the first rational number's numerator by the second rational number's denominator
		int numerator1 = r1.getNumerator() * r2.getDenominator(); 
		
		//Cross multiply second rational number's numerator by first rational number's denominator
		int numerator2 = r2.getNumerator() * r1.getDenominator(); 
		
		//Sum of the 2 updated numerators
		int sum = numerator1 + numerator2; 


		//Created a new object r3 that passes in new numerator and new denominator after addition
		RationalNums r3 = new RationalNums (sum,commonDenominator); 
		
		//Create int to hold value of GCD
		int greatest = r3.gcd(sum, commonDenominator); 
		
		//divide the numerator by the gcd labeled greatest
		r3.setNumerator(sum / greatest); 
		
		//Divide the denominator by the gcd labeled greatest
		r3.setDenominator(commonDenominator/ greatest); 
		
		//convert the new number into a string
		System.out.print(r3.tostring()); 

	}
	/**
	 * Pass through both of the fractions and cross multiply then subtract
	 * @param r
	 * @return
	 */
	public RationalNums sub(RationalNums r) {
		int commonDenom = this.denom * r.getDenominator(); //denom is 18
		int numerator1 = this.num * r.getDenominator();//6
		int numerator2 = r.getNumerator() * this.denom;//3
		int difference = numerator1 - numerator2;
		RationalNums r3 = new RationalNums(difference,commonDenom);
		int greatest = r3.gcd(difference, commonDenom);
		r3.setNumerator(difference/greatest);
		r3.setDenominator(commonDenom/greatest);
		return r3;
		


	}
	/**
	 * Pass through both user input fractions and multiply them
	 * @param r1
	 * @param r2
	 */
	public void mul( RationalNums r1 , RationalNums r2 ) {
		//Got the common denominator of both rational numbers
		int commonDenominator = r1.getDenominator() * r2.getDenominator(); 
		
		// sum of the 2 updated numerators
		int sum = r1.getNumerator() * r2.getNumerator(); 

		//Created a new object r3 that passes in new numerator and new denominator after addition
		RationalNums r3 = new RationalNums (sum,commonDenominator); 
		
		//Create int to hold value of GCD
		int greatest = r3.gcd(sum, commonDenominator); 
		
		//divide the numerator by the gcd labeled greatest
		r3.setNumerator(sum / greatest); 
		
		//Divide the denominator by the gcd labeled greatest
		r3.setDenominator(commonDenominator/ greatest); 
		
		//convert the new number into a string
		System.out.print(r3.tostring()); 

}	
	/**
	 * Function gets called to a value and subtracts the value passed in from the value it was called to
	 * @param r
	 * @return
	 */
	public RationalNums div( RationalNums r ) {
		int valNum;
		int valDen;
		valNum = this.num * r.denom;
		valDen = this.denom * r.num;
		
		return new RationalNums(valNum,valDen);
		
	}
	/**
	 * Pass through 2 rational numbers and perform a division to return a double on them
	 * @param r1
	 * @param r2
	 * @return
	 */
	public static double divToDouble(RationalNums r1, RationalNums r2) {
		
		//Cross multiply for numerator
		double num = r1.getNumerator() * r2.getDenominator();
		
		//Cross multiply for denominator
		double denom = r1.getDenominator() * r2.getNumerator();
		
		//Produce decimal point and return
		double value = num / denom;
		//Return Decimal Value that will be converted into int
		return value;
		
	}}
	
