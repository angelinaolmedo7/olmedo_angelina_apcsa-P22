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
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		int length = word.length();
 		length = length%2;
 		if (length==0) {
 			return true;
 			}
 		else return false;
 	}

 	public String toString()
 	{
 		if (isEven()) {
 			evenodd = "even";
 		}
 		else evenodd = "odd";
 		String output= "'"+word + "' has "+word.length()+" characters and therefore is "+evenodd+".";
 		return output;
	}
}