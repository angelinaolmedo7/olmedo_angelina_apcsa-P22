//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] sevarr = new int[size];
		for (int i = 0; i<sevarr.length;i++) {
			sevarr[i]= (int)(Math.random()*10+1);
		}
		return sevarr;
	}
	public static void shiftEm(int[] array)
	{
		int ind = 0;
		for (int i = 0; i<array.length;i++) {
			if (array[i]==7){
				int rep = array[ind];
				array[ind]=7;
				array[i]=rep;
				ind++;
			}
		}
	}
}