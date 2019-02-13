//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String word;
		
		StringOddOrEven test = new StringOddOrEven();
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		
		test.setString(word);
		test.isEven();
		//test.toString();
		out.println(test);
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		
		test.setString(word);
		test.isEven();
		//test.toString();
		out.println(test);
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		
		test.setString(word);
		test.isEven();
		//test.toString();
		out.println(test);
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		
		test.setString(word);
		test.isEven();
		//test.toString();
		out.println(test);
	}
}