//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		if (num>0) {
			if (num%2==0) {
				return 1+countEvenDigits((num-num%10)/10);
			}
			else return 0+countEvenDigits((num-num%10)/10);
		}
		return 0;
	}
}