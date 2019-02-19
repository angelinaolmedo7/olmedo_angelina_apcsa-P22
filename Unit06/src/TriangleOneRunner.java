//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String word;
		
		TriangleOne test = new TriangleOne();
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		
		test.setWord(word);
		test.doTriangle();
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		
		test.setWord(word);
		test.doTriangle();
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		
		test.setWord(word);
		test.doTriangle();
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		
		test.setWord(word);
		test.doTriangle();
		
		out.print("Enter a word :: ");
		word = keyboard.nextLine();
		
		test.setWord(word);
		test.doTriangle();
		
	}
}