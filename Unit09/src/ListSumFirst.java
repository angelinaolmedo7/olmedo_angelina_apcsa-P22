//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	private int sum;
	private int[] lst;
	
	
	public static int go(List<Integer> ray)
	{
		int sm = 0;
		for (int i = 0; i< ray.size(); i++) {
			if (ray.get(i)>ray.get(0)) {
				sm+=ray.get(i);
			}
		}
		if (sm==0) {
			return -1;
		}
		return sm;
	}
}