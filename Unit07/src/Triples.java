//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
		
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private boolean greatestCommonFactor(int a, int b, int c)
	{
		for (int i = 2; i<=a;i++) {
			if ((a%i==0) && (b%i==0) && (c%i==0)) {
				return false;
			}
		}
		return true;
	}
	
	private String findTriples(int maxNum) {
		String trips = "";
		int a,b,c;
		
		for (a=1;a<maxNum;a++) {
			for (b=a;b<maxNum;b++) {
				for (c=b;c<maxNum;c++) {
					if ((Math.pow(a,2)+Math.pow(b, 2))==Math.pow(c,2)) {
						if ( ((a%2==0)&&(b%2!=0)) || ((a%2!=0)&&(b%2==0)) ) {
							if (greatestCommonFactor(a,b,c)) {
								trips+=(a+" "+b+" "+c+"\n");
							}
						}
					}
				}
			}
		}
		return trips.trim();
	}
	
	

	public String toString()
	{
		//String output="";
		return findTriples(number);
	}
}