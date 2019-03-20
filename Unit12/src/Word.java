//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		String other = rhs.toString();
		if (word.length()<other.length()) {
			return -1;
		}
		else if (word.length()>other.length()) {
			return 1;
		}
		else { //same length
			int len = word.length();
			for (int i=0; i<len; i++) {
				if (word.charAt(i)>other.charAt(i)) {
					return -1;
				}
				else if (word.charAt(i)<word.charAt(i)) {
					return 1;
				}
			}
			return 0;
		}
	}

	public String toString()
	{
		return word;
	}
}