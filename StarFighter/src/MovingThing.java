//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Moveable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	public MovingThing()
	{
		setPos(10,10);
		setWidth(10);
		setHeight(10);
	}

	public MovingThing(int x, int y)
	{
		setPos(x,y);
		setWidth(10);
		setHeight(10);
	}

	public MovingThing(int x, int y, int w, int h)
	{
		setPos(x,y);
		setWidth(w);
		setHeight(h);
	}

	public void setPos( int x, int y)
	{
		setX(x);
		setY(y);
	}

	public void setX(int x)
	{
		xPos = x;
	}

	public void setY(int y)
	{
		yPos = y;
	}

	public int getX()
	{
		return xPos;
	}

	public int getY()
	{
		return yPos;
	}

	public void setWidth(int w)
	{
		width = w;
	}

	public void setHeight(int h)
	{
		height = h;
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	public abstract void move(String direction);
	public abstract void draw(Graphics window);

	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
	}
}