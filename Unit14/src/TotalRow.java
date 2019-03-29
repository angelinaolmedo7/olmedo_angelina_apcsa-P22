//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> totals = new ArrayList<Integer>();
    	for (int i=0; i<m.length; i++) {
    		int mySum = 0;
    		for (int b=0; b<m[i].length; b++) {
    			mySum+=m[i][b];
    		}
    		totals.add(mySum);
    	}
    	
    	
		return totals;
    }
}
