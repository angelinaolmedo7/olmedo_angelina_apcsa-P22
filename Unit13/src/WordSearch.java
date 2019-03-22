//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private int numberOfColumns;
    private int numberOfRows;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    
    	int col = 0; 
    	int row = 0;
    	for (int i = 0; i<size*size; i++) {
    		
    		m[row][col]=str.charAt(i)+"";
    		col++;
    		if (col==size) {
    			col=0;
    			row++;
    		}
    	}
    	
    	numberOfColumns = m.length;
        numberOfRows = m[0].length;
    	
    }

    public boolean isFound( String word )
    {
    	return (checkRight(word,numberOfRows,numberOfColumns) || checkLeft(word,numberOfRows,numberOfColumns));
    }

	public boolean checkRight(String w, int r, int c)
   {
		
		for (int i = 0; i < r; i++) {

			String thisRow = "";
			for (int b = 0; b<c;b++) {
				thisRow+=m[i][b];
			}
			if (thisRow.contains(w)) {
				return true;
			}
		}
		return false;
		
	}

	public boolean checkLeft(String w, int r, int c)
	{
		
		for (int i = 0; i < r; i++) {

			String thisRow = "";
			for (int b = c-1; b>=0; b--) {
				thisRow+=m[i][b];
			}
			if (thisRow.contains(w)) {
				return true;
			}
		}
		return false;
		
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
    	String rtn = "";
    	
		for (int i = 0; i < numberOfRows; i++) {
			for (int b = 0; b<numberOfColumns;b++) {
				rtn+=m[i][b]+" ";
			}
			rtn+="\n";
		}
    	
 		return rtn;
    }
}
