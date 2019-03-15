//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();

	public ToyStore()
	{
		loadToys("no toys here");
	}

	public ToyStore(String toys) {
		//toyList.add(new Toy("test",1));
		loadToys(toys);
	}
	
	public void loadToys( String toys )
	{
		int last=0;
		for (int i = 0; i<toys.length(); i++) {
			if (toys.charAt(i)==' ') {
				String toyHere = toys.substring(last, i).trim();
				last = i;
				
				if (toyInList(toyHere)) {
					getThatToy(toyHere).setCount(getThatToy(toyHere).getCount()+1);
				}
				else {
					toyList.add(new Toy(toyHere, 1));
				}
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy item : toyList) {
  			if (item.getName().equals(nm)) {
  				return item;
  			}
  		}
  		return new Toy("NoToyWithThatName",0); //should use toyInList first to make sure this option is not reached
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy maxToy = new Toy("",0);
  		for (Toy item : toyList) {
  			if (item.getCount()>maxToy.getCount()) {
  				maxToy = item;
  			}
  		}
  		return maxToy.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		//instructions said this was a bonus :))))))))))))))))))) so no thank you
  	}  
  	
  	public boolean toyInList(String toyName) {
  		if (toyList.isEmpty()) {
  			return false;
  		}
  		for (int i = 0; i<toyList.size();i++) {
  			if (toyList.get(i).getName().equals(toyName)){
  				return true;
  			}
  		}
  		return false;
  	}
  	
  	
  	
  	
  	  
	public String toString()
	{
		String rtn = "";
		for (Toy item : toyList) {
			rtn+= item.getName()+" "+item.getCount()+" ";
		}
		rtn += "\nThe most frequent toy is: " + getMostFrequentToy()+"."; 
		return rtn.trim();
	}
}