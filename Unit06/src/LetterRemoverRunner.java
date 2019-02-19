//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String word;
		char remover;
		
		LetterRemover test = new LetterRemover();
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		out.print("Enter a character :: ");
		remover = keyboard.nextLine().charAt(0);
		test.setRemover(word,remover);
		out.println(test);							
	
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		out.print("Enter a character :: ");
		remover = keyboard.nextLine().charAt(0);
		test.setRemover(word,remover);
		out.println(test);		

		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		out.print("Enter a character :: ");
		remover = keyboard.nextLine().charAt(0);
		test.setRemover(word,remover);
		out.println(test);		
	}
}