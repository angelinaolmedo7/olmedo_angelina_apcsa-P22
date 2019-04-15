//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	
	private Color color;

	public Block() {
		setPos(10,10);
		setDimensions(5,10);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y) {
		setPos(10,10);
		setDimensions(5,10);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int wid, int hei) {
		setPos(10,10);
		setDimensions(wid,hei);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int wid, int hei, Color col) {
		setPos(10,10);
		setDimensions(wid,hei);
		setColor(col);
	}
   
	
	//set methods
   public void setX(int x) {
	   xPos = x;
   }
   public void setY(int y) {
	   yPos = y;
   }
   public void setWidth(int wid) {
	   width = wid;
   }
   public void setHeight(int hei) {
	   height = hei;
   }
   public void setColor(Color col) {
	   color = col;
   }
   public void setDimensions(int wid, int hei) {
	   setWidth(wid);
	   setHeight(hei);
   }
	
   @Override
   public void setPos(int x, int y) {
	   setX(x);
	   setY(y);
	}

   
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block)obj;
		if (this.getX()==other.getX()
				&& this.getY()==other.getY()
				&& this.getWidth()==other.getWidth()
				&& this.getHeight()==other.getHeight()
				&& this.getColor()==other.getColor()) {
			return true;
		}
		return false;
	}


	//get methods
	@Override
	public int getX() {
		return xPos;
	}
	@Override
	public int getY() {
		return yPos;
	}   
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Color getColor() {
		return color;
	}
    

	public String toString() {
		return xPos + ", " + yPos + ", " + width + ", " + height + " ," + color.toString();
	}
    //x , y , width, height, color
}