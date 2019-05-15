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

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (Ammo am : ammo) {
			am.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Ammo am : ammo) {
			am.move("UP");
		}
	}

	public void cleanEmUp()
	{
		for (Ammo am : ammo) {
			if (am.getY()<0) {
				ammo.remove(am);
			}
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		String rtn = "";
		for (Ammo am : ammo) {
			rtn += am.toString() + " ";
		}
		return rtn.trim();
	}
}
