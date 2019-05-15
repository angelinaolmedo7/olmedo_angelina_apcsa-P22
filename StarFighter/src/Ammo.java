//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,5);
	}

	public Ammo(int x, int y)
	{
		this(x,y,5);
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
	      window.setColor(Color.WHITE);
	      window.fillRect(getX(), getY(), 10, 10);
	}
	
	
	public void move( String direction )
	{
		if (direction.toLowerCase().equals("up")) {
			super.setY(super.getY()-speed);
		}
		else if (direction.toLowerCase().equals("down")) {
			super.setY(super.getY()+speed);
		}
		else if (direction.toLowerCase().equals("left")) {
			super.setX(super.getX()-speed);
		}
		else if (direction.toLowerCase().equals("right")) {
			super.setX(super.getX()+speed);
		}
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
