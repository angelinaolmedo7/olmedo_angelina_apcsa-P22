//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy toy = new Toy("Slinky",7);
		Toy toy2 = new Toy ("Rocking Horse");
		Toy toy3 = new Toy();
		
		System.out.println(toy);
		System.out.println(toy2);
		System.out.println(toy3);
	}
}