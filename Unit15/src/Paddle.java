//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   //constructors
   public Paddle() {
	   super(10,10);
      speed =5;
   }
   public Paddle(int x, int y) {
	   super(x,y);
	   speed = 5;
   }
   public Paddle(int x, int y, int spe) {
	   super(x,y);
	   speed = spe;
   }
   public Paddle(int x, int y, int wid, int hei) {
	   super(x,y,wid,hei);
	   speed = 5;
   }
   public Paddle(int x, int y, int wid, int hei, Color col) {
	   super(x,y,wid,hei,col);
	   speed = 5;
   }
   public Paddle(int x, int y, int wid, int hei, int spe) {
	   super(x,y,wid,hei);
	   speed = spe;
   }
   public Paddle(int x, int y, int wid, int hei, Color col, int spe) {
	   super(x,y,wid,hei,col);
	   speed = spe;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   setY(getY()-speed);
	   draw(window);


   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   setY(getY()+speed);
	   draw(window);
   }

   public int getSpeed() {
	   return speed;
   }
   
   public String toString() {
	   return super.toString() + ", " + speed;
   }
}