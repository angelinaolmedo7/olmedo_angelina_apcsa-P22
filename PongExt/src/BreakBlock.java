import java.awt.Color;

public class BreakBlock extends Block{
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
	
	
	public void blockBreak () {
		this.draw(window,Color.WHITE);
	}
	
}
