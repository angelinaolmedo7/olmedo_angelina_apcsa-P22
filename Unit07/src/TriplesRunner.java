//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   int amount = 0;
	   Scanner keyboard = new Scanner(System.in);
	   System.out.print("Max value :: ");
	   amount = keyboard.nextInt();
	   
	   Triples remyFromRatatouille = new Triples(amount);
	   out.println(remyFromRatatouille);
	   
	}
}