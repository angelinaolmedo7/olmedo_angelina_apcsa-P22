//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> ray)
	{
		for (int i = 1; i<ray.size(); i++) {
			if (ray.get(i)>=ray.get(i-1)) {
				//System.out.println(ray.get(i)+" >= "+ray.get(i-1));
				return false;
			}
			else {
				//System.out.println(ray.get(i)+" < "+ray.get(i-1));
			}
		}
		return true;
	}	
}