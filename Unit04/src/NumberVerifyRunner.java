//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a whole number :: ");
		int num = keyboard.nextInt();
		System.out.println(num+" is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num+" is even :: " + NumberVerify.isEven(num));
		
		out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		System.out.println(num+" is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num+" is even :: " + NumberVerify.isEven(num));
		
	}
}