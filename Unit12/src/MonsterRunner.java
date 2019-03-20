//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String monName= "";
		int monSize = 0;
		
		System.out.print("Enter 1st monster's name : ");
		monName = keyboard.next();
		
		System.out.print("Enter 1st monster's size : ");
		monSize = keyboard.nextInt();
		
		Skeleton mon1 = new Skeleton(monName,monSize);
		
		
		System.out.print("Enter 2nd monster's name : ");
		monName = keyboard.next();
		
		System.out.print("Enter 2nd monster's size : ");
		monSize = keyboard.nextInt();
		
		Skeleton mon2 = new Skeleton(monName,monSize);
		
		
		System.out.println("Monster 1 - "+mon1);
		System.out.println("Monster 2 - "+mon2);
		
		if (mon1.isBigger(mon2)) {
			System.out.println("Monster 1 is bigger than Monster 2.");
		}
		else {
			System.out.println("Monster 1 is smaller than or the same size as Monster 2.");
		}
		
		if (mon1.namesTheSame(mon2)) {
			System.out.println("Monster 1 has the same name as Monster 2.");
		}
		else {
			System.out.println("Monster 1 does not have the same name as Monster 2.");
		}
		
	}
}