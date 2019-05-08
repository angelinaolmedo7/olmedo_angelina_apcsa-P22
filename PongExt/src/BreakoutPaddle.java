import java.awt.Color;
import java.awt.Graphics;

public class BreakoutPaddle extends Paddle{
	
	   //constructors
	   public BreakoutPaddle() {
		   super(10,10,3);
	   }
	   public BreakoutPaddle(int x, int y) {
		   super(x,y,3);
	   }
	   public BreakoutPaddle(int x, int y, int spe) {
		   super(x,y,spe);
	   }
	   public BreakoutPaddle(int x, int y, int wid, int hei) {
		   super(x,y,wid,hei,3);
	   }
	   public BreakoutPaddle(int x, int y, int wid, int hei, Color col) {
		   super(x,y,wid,hei,col,3);
	   }
	   public BreakoutPaddle(int x, int y, int wid, int hei, int spe) {
		   super(x,y,wid,hei,spe);
	   }
	   public BreakoutPaddle(int x, int y, int wid, int hei, Color col, int spe) {
		   super(x,y,wid,hei,col,spe);
	   }
	   
	   
	
	public void moveLeftAndDraw(Graphics window)
	   {
		   draw(window,Color.WHITE);
		   setX(getX()-super.getSpeed());
		   draw(window);


	   }

	   public void moveRightAndDraw(Graphics window)
	   {
		   draw(window,Color.WHITE);
		   setX(getX()+super.getSpeed());
		   System.out.println(super.getSpeed());
		   draw(window);
	   }
	   
}
