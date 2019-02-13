//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String word1, word2;
		
		StringEquality test = new StringEquality();
		
		out.print("Enter a word :: ");
		word1 = keyboard.nextLine();
		out.print("Enter another word :: ");
		word2 = keyboard.nextLine();
		
		test.setWords(word1,word2);
		out.println(test);

		out.print("Enter a word :: ");
		word1 = keyboard.nextLine();
		out.print("Enter another word :: ");
		word2 = keyboard.nextLine();

		test.setWords(word1,word2);
		out.println(test);

		out.print("Enter a word :: ");
		word1 = keyboard.nextLine();
		out.print("Enter another word :: ");
		word2 = keyboard.nextLine();

		test.setWords(word1,word2);
		out.println(test);

		out.print("Enter a word :: ");
		word1 = keyboard.nextLine();
		out.print("Enter another word :: ");
		word2 = keyboard.nextLine();

		test.setWords(word1,word2);
		out.println(test);
		
	}
}