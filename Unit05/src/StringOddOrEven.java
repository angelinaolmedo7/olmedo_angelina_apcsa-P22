//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private String evenodd;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
		setString(s);
		toString();
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		return ((word.length()&2)==0);
	}

 	public String toString()
 	{
 		if (isEven()) {
 			evenodd = "even";
 		}
 		else evenodd = "odd";
 		String output= word + " has "+word.length()+" characters and therefor is "+evenodd;
 		return output;
	}
}