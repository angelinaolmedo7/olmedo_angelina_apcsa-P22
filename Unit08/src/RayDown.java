//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Angelina Olmedo
//Date - 02/26/2019

public class RayDown
{
	private int[] numArr;
	public RayDown() {
		setNums(null);
	}
	public RayDown(int[] nums) {
		setNums(nums);
	}
	public void setNums(int[] nums) {
		numArr = nums;
	}
		
	
	
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		if (numArray.length==0||numArray.length==1) {
			return true;
		}
		for (int i = 1; i<numArray.length;i++) {
			if (numArray[i-1]<=numArray[i]) {
				return false;
			}
		}		
		return true;
	}	
	
	public String toString () 
	{
		return ""+go(numArr);
	}
	
	
}