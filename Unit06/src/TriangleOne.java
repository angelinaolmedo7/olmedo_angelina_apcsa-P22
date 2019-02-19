//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}
	
	public void cutWord() {
		word = word.substring(0,word.length()-1);
	}
	
	public void doTriangle () {
		print();
		while (word.length()!=0) {
			cutWord();
			print();
		}
	}

	public void print( )
	{
		System.out.println(word);
	}
}