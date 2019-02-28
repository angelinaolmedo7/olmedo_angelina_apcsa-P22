//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	private int[] nums;
	public RaySumLast() {
		setNums(new int[] {0});
	}
	public RaySumLast(int[] ray) {
		setNums(ray);
	}
	public void setNums(int[]ray) {
		nums = ray;
	}
	
	//public static 
	public static int go(int[] ray)
	{
		int sum = 0;
		if (ray.length==0||ray.length==1) {
			return -1;
		}
		for (int i = 0; i<ray.length;i++) {
			if (ray[i]>ray[ray.length-1]) {
				sum+=ray[i];
				//System.out.println("Adding "+ray[i]);
			}
		}
		if (sum==0) {
			return -1;
		}
		return sum;
	}
	
	public String toString() {
		return ""+go(nums);
	}
}