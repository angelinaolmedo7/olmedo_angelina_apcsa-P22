//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		
		int col =0;
		int ro = 0;
		for (int i =0; i<cols*rows;i++) {
			int selection = (int)(Math.random()*vals.length);
			grid[ro][col]= vals[selection];
			col++;
			if (col==cols) {
				col=0;
				ro++;
			}
			
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int valCounts[]=new int[vals.length];
		
		for (int i=0; i<vals.length; i++) {
			valCounts[i]=countVals(vals[i]);
		}
		
		int maxInd = 0;
		for (int i=1; i<valCounts.length; i++) {
			if (valCounts[i]>valCounts[0]) {
				maxInd=i;
			}
		}
		
		return vals[maxInd];
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
    	int valCount = 0;
    	
    	int cols = grid.length;
        int rows = grid[0].length;
		int col =0;
		int ro = 0;
		
		for (int i =0; i<cols*rows;i++) {
			if (grid[ro][col]==val) {
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

	//display the grid
	public String toString()
	{
    	String rtn = "";
    	
    	int cols = grid.length;
        int rows = grid[0].length;
		int col =0;
		int ro = 0;
    	
		for (int i =0; i<cols*rows;i++) {
			rtn+=grid[ro][col]+" ";
			col++;
			if (col==cols) {
				col=0;
				ro++;
				rtn+="\n";
			}
		}
    	return rtn;
	}
}