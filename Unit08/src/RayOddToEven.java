//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	private int[] nums;
	public RayOddToEven () {
		setNums(new int[] {0});
	}
	public RayOddToEven(int[] ray) {
		setNums(ray);
	}
	public void setNums (int[] ray) {
		nums = ray;
	}
	
	public boolean anyOdds() {
		for (int i = 0; i<nums.length;i++) {
			if (nums[i]%2==1) {
				return true;
			}
		}
		return false;
	}
	public boolean evenAfterOdd() {
		if (nums.length==0||nums.length==1) {
			return false;
		}
		for (int i = 1; i<nums.length; i++) {
			if (nums[i]%2==0 && nums[i-1]%2==1) {
				return true;
			}
		}
		return false;
	}
	public int doIt () {
		for (int i = 0; i<nums.length-1; i++) {
			if (nums[i]%2==1) {
				for (int z=i;z<nums.length;z++) {
					if (nums[z]%2==0) {
						return (z-i);
					}
				}
			}
		}
		return -1;
	}
	
	public int go(int[] ray){
		setNums(ray);
		if (!anyOdds()) {
			//System.out.print("no odds :/");
			return -1;
		}
		else if (!evenAfterOdd()) {
			//System.out.print("no EAO ://");
			return -1;
		}
		else return doIt();
	}
	
}