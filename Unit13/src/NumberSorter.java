//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		
		do {
			count++;
			number/=10;
		} while (number>0);
		
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int num = number;
		
		for (int i=0; i<sorted.length; i++) {
			sorted[i]= num%10;
			num/=10;
		}
		
		Arrays.parallelSort(sorted);
		
		return sorted;
	}
}