//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	//constructors
	public Ball()
	{
		super(200,200);
		setSpeed(3,1);
	}
	public Ball(int x, int y) {
		super(x,y);
		setSpeed(3,1);
	}
	public Ball(int x, int y, int wid, int hei) {
		super(x,y, wid, hei);
		setSpeed(3,1);
	}
	public Ball(int x, int y, int wid, int hei, Color col) {
		super(x,y, wid, hei, col);
		setSpeed(3,1);
	}
	public Ball(int x, int y, int wid, int hei, Color col, int xSpe, int ySpe) {
		super(x,y, wid, hei, col);
		setSpeed(xSpe,ySpe);
	}
	public Ball(int x, int y, int wid, int hei, int xSpe, int ySpe) {
		super(x,y, wid, hei);
		setSpeed(xSpe,ySpe);
	}
	   
   //set methods
	public void setXSpeed(int xSpe) {
		xSpeed = xSpe;
	}
	public void setYSpeed(int ySpe) {
		ySpeed = ySpe;
	}
   public void setSpeed(int xSpe, int ySpe) {
		setXSpeed(xSpe);
		setYSpeed(ySpe);
   }

   public void moveAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);


	   setX(getX()+xSpeed);
	   setY(getY()+ySpeed);

	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if (this.getXSpeed()==other.getXSpeed()
				&& this.getYSpeed()==other.getYSpeed()
				&& super.equals(other)) {
			return true;
		}
		return false;
	}   

   //get methods
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	

	public String toString() {
		return super.toString() + ", " + xSpeed + ", " + ySpeed;
	}
}