//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
	}

	public StringEquality(String one, String two)
	{
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo= two;
	}

	public boolean checkEquality( )
	{
		return (wordOne.equalsIgnoreCase(wordTwo));
	}

	public String toString()
	{
		if (checkEquality()) {
			return wordOne + " has the same letters in the same order as " + wordTwo + "\n";
		}
		else return wordOne + " does not have the same letters in the same order as " + wordTwo + "\n";
	}
}