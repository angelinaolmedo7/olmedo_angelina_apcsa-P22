//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String word;
		
		Word test = new Word();
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		test.setString(word);
		out.println(test);
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		test.setString(word);
		out.println(test);
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		test.setString(word);
		out.println(test);
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		test.setString(word);
		out.println(test);
		
	}
}