//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int X1,X2,Y1,Y2;
		//add test cases
		System.out.print("Enter X1 :: ");
		X1 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		Y1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		X2 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		Y2 = keyboard.nextInt();
		
		Distance dis1 = new Distance();
		dis1.setCoordinates(X1,Y1,X2,Y2);
		System.out.println(dis1.toString());

			
	}
}