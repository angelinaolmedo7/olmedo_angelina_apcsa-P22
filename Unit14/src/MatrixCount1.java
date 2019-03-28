//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    							{ 6, 7, 8, 9, 0},
    							{ 6, 7, 1, 2, 5},
    							{ 6, 7, 8, 9, 0},
    							{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
    	int valCount = 0;
    	
    	int cols = m.length;
        int rows = m[0].length;
		int col =0;
		int ro = 0;
		
		for (int i =0; i<cols*rows;i++) {
			if (m[col][ro]==val) {
				valCount++;
			}
			col++;
			if (col==cols) {
				col=0;
				ro++;
			}
			
		}
		
		return valCount;
    }
}
