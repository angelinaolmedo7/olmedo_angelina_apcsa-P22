//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   char letter= 'A';
	   int amount = 0;
	   Scanner keyboard = new Scanner(System.in);
	   System.out.print("char :: ");
	   letter = keyboard.nextLine().trim().toUpperCase().charAt(0);
	   System.out.print("num :: ");
	   amount = keyboard.nextInt();
	   
	   TriangleFive doug = new TriangleFive(letter, amount);
	   out.println(doug);
	   
	}
}