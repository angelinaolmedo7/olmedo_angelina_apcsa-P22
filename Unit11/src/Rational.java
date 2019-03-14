//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.math.BigInteger;

class Rational implements Comparable<Rational>
{
	private int numerator, denominator;

	public Rational () {
		setRational(0,1);
	}
	
	public Rational (int num, int den) {
		setRational(num,den);
	}

	public void setRational(int num, int den) {
		setNumerator(num);
		setDenominator(den);
	}
	
	public void setNumerator(int num) {
		numerator = num;
	}
	
	public void setDenominator(int den) {
		denominator = den;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		numerator = (numerator * other.getDenominator() + other.getNumerator() * denominator);
		denominator = (denominator * other.getDenominator());

		reduce();
	}

	private void reduce()
	{
		int grcode = gcd(numerator, denominator);
		setNumerator(numerator/grcode); 
		setDenominator(denominator/grcode);
	}
	
	private Rational tempReduce(int num, int den)
	{
		int grcode = gcd(num, den);
		return new Rational (num/grcode, den/grcode);
	}

	private int gcd(int numOne, int numTwo)
	{
		BigInteger numer = new BigInteger(Integer.toString(numOne));
		BigInteger denom = new BigInteger(Integer.toString(numTwo));
		
		return numer.gcd(denom).intValue();
	}

	public Rational clone ()
	{
		return new Rational(numerator,denominator);
	}


	//ACCESSORS

	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public boolean equals( Rational obj)
	{
		if ().) {
			return true;
		}
		else return false;
	}

	public int compareTo(Rational other)
	{
		double first = numerator/denominator;
		double second = other.getNumerator()/other.getDenominator();
		
		if (first>second) {
			return 1;
		}
		else if (first==second) {
			return 0;
		}
		else return -1;
	}   //i'm not entirely sure what I was supposed to do here



	
	//write  toString() method
	
	
}