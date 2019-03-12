//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		if (!pass(ray)) {
			return -1;
		}
		
		int oddInd = -1;
		for (int i = 0; i<ray.size()&&oddInd==-1; i++) {
			if (ray.get(i)%2==1) {
				oddInd=i;
			}
		}
		
		int evenInd = -1;
		for (int i = oddInd; i<ray.size(); i++) {
			if (ray.get(i)%2==0) {
				evenInd=i;
			}
		}
		
		return evenInd-oddInd;
	}
	
	public static boolean isOdd(List<Integer> ray) {
		for (int i = 0; i< ray.size(); i++) {
			if (ray.get(i)%2==1) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean evenAfterOdd(List<Integer> ray) {
		int oddInd = -1;
		for (int i = 0; i<ray.size()&&oddInd==-1; i++) {
			if (ray.get(i)%2==1) {
				oddInd=i;
			}
		}
		for (int i=oddInd;i<ray.size();i++) {
			if (ray.get(i)%2==0) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean pass(List<Integer> ray) {
		if (!isOdd(ray)) {
			return false;
		}
		else if (!evenAfterOdd(ray)) {
			return false;
		}
		return true;
	}	
}