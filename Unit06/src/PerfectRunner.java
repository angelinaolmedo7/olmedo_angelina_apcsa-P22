//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int num;
		
		Perfect test = new Perfect();
		
		out.print("Enter an integer :: ");
		num = keyboard.nextInt();
		test.setNum(num);
		out.println(test);

		out.print("Enter an integer :: ");
		num = keyboard.nextInt();
		test.setNum(num);
		out.println(test);

		out.print("Enter an integer :: ");
		num = keyboard.nextInt();
		test.setNum(num);
		out.println(test);

		out.print("Enter an integer :: ");
		num = keyboard.nextInt();
		test.setNum(num);
		out.println(test);
	}
}