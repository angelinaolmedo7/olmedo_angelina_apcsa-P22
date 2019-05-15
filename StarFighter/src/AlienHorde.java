//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		int x = 0;
		int y = 0;

		for (int i = 0; i < (size/10); i++) 
		{
			x = 0;

			for(int b = 0; b < 10; b++)
			{
				Alien a = new Alien(x, y, 50, 50,1);
				aliens.add(a);
				x += 60;
			}
			y += 60;
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien al : aliens) {
			al.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien al : aliens) {
			al.move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
	}

	public String toString()
	{
		return "";
	}
}
