//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		if (spot>=pups.length) {
			spot=pups.length-1;
		}
		pups[spot] = new Dog(age,name);		
	}

	public String getNameOfOldest()
	{
		if (pups.length==0) {
			return "There are no dogs in this pack";
		}
		Dog oldest = pups[0];
		for (int i =1; i<pups.length;i++) {
			if (pups[i].getAge()>oldest.getAge()) {
				oldest = pups[i];
			}
		}
		return oldest.getName();
	}

	public String getNameOfYoungest()
	{
		if (pups.length==0) {
			return "There are no dogs in this pack";
		}
		Dog youngest = pups[0];
		for (int i =1; i<pups.length;i++) {
			if (pups[i].getAge()<youngest.getAge()) {
				youngest = pups[i];
			}
		}
		return youngest.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}