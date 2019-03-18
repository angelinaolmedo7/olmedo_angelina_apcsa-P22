//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private String name;
	private int size;
	
	public Skeleton() {
		setName("Skeleton");
		setSize(1);
	}
	
	public Skeleton(String n, int s) {
		setName(n);
		setSize(s);
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public void setSize(int s) {
		size = s;
	}

	public int getHowBig() {
		return size;
	}
	public String getName() {
		return name;
	}
	public boolean isBigger(Monster other) {
		if (getHowBig()>other.getHowBig()) {
			return true;
		}
		else return false;
	}
	public boolean isSmaller(Monster other) {
		if (getHowBig()<other.getHowBig()) {
			return true;
		}
		else return false;
	}
	public boolean namesTheSame(Monster other) {
		if (getName().equals(other.getName())) {
			return true;
		}
		return false;
	}
	
	
	public String toString() {
		return getName()+" "+getHowBig();
	}
}