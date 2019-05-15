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
	boolean right = false, left = false, down = false;

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
	
	public boolean ded() {
		return (aliens.size()==0);
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
		if (aliens.size() > 0)
		{
			for (Alien a : aliens)
			{
				if (a.getX() == 0) 
				{
					right = true;
					left = false;
					down = true;
				}
				else if (a.getX()+a.getWidth() == 785) 
				{
					right = false;
					left = true;
					down = true;
				}
								
				if(right) a.move("RIGHT");
				if(left) a.move("LEFT");
				if(down)
				{
					for (Alien b : aliens)
					{
						for(int i = 0; i < 10; i++)	b.move("DOWN");
					}
					down = false;
				}
			}
		}
	}

	
	public boolean killedPlayer(Ship shp)
	{
		if (aliens.size() > 0){
			for (Alien sh : aliens){
				
					if (((sh.getX() <= shp.getX() + shp.getWidth() + Math.abs(shp.getSpeed()) &&
							sh.getX() > shp.getX()) || 
							(sh.getX() + sh.getWidth() >= shp.getX() - Math.abs(sh.getSpeed())) && 
							(sh.getX() + sh.getWidth() < shp.getX()+shp.getWidth())) && 
							((sh.getY() >= shp.getY() && 
							sh.getY() <= shp.getY() + shp.getHeight()) ||
							(sh.getY() + sh.getHeight() >= shp.getY() &&
							sh.getY() + sh.getHeight() < shp.getY() + shp.getHeight())))
					{
						return true;
					}
			}
		}
		return false;
	}
	
	public void removeDeadOnes(List<Ammo> shots)
	{
		if (shots.size() > 0){
			for (Ammo sh : shots){
				for (Alien al : aliens){
					if (((sh.getX() <= al.getX() + al.getWidth() + Math.abs(sh.getSpeed()) &&
							sh.getX() > al.getX()) || 
							(sh.getX() + sh.getWidth() >= al.getX() - Math.abs(sh.getSpeed())) && 
							(sh.getX() + sh.getWidth() < al.getX()+al.getWidth())) && 
							((sh.getY() >= al.getY() && 
							sh.getY() <= al.getY() + al.getHeight()) ||
							(sh.getY() + sh.getHeight() >= al.getY() &&
							sh.getY() + sh.getHeight() < al.getY() + al.getHeight())))
					{
						shots.remove(sh);
						aliens.remove(al);
					}
					if (shots.size() == 0) {
						break;
					}
				}
			}
		}
	}

	public String toString()
	{
		String rtn = "";
		for (Alien al : aliens) {
			rtn += al.toString() + " ";
		}
		return rtn.trim();
	}
}
