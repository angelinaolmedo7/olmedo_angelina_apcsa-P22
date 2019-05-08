import java.awt.Color;
import java.awt.Graphics;

public class BreakBlock extends Block{
	
	private boolean dead=false;
	
	public BreakBlock() {
		super();
	}
	
	public BreakBlock(int x, int y) {
		super(x,y);
	}
	
	public BreakBlock(int x, int y, int wid, int hei) {
		super(x,y,wid,hei);
	}
	
	public BreakBlock(int x, int y, int wid, int hei, Color col) {
		super(x,y,wid,hei,col);
	}
	
	
	public void ballColl (Ball bl, Graphics window) {
		if (dead==false) {	
			if (((bl.getX() <= this.getX() + this.getWidth() + Math.abs(bl.getXSpeed()) &&
					bl.getX() > this.getX()) || 
					(bl.getX() + bl.getWidth() >= this.getX() - Math.abs(bl.getXSpeed())) && 
					(bl.getX() + bl.getWidth() < this.getX()+this.getWidth())) && 
					((bl.getY() >= this.getY() && 
					bl.getY() <= this.getY() + this.getHeight()) ||
					(bl.getY() + bl.getHeight() >= this.getY() &&
					bl.getY() + bl.getHeight() < this.getY() + this.getHeight())))
			{
				if (((bl.getX() <= this.getX() + this.getWidth() - Math.abs(bl.getXSpeed())) && 
						bl.getX() + bl.getWidth() >= this.getX() + Math.abs(bl.getXSpeed()))) bl.setYSpeed(-bl.getYSpeed());
				else bl.setXSpeed(-bl.getXSpeed());
				
				blockBreak(window);
				
			}
		}
	}
	
	public void blockBreak (Graphics window) {
		this.draw(window,Color.WHITE);
		this.setColor(Color.WHITE);
		dead=true;
	}
	
	public boolean isDead() {
		return dead;
	}
	
}
