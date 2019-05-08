import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

public class BlocksGroup {
	
	private ArrayList<BreakBlock> blocks;
	
	public BlocksGroup() {
		blocks = new ArrayList<BreakBlock>();
		int x = 30; int y = 10;
		while (x<650) {
			blocks.add(new BreakBlock(x, y, 50, 20, Color.BLUE));
			x+=60;
		}
		y = 400; x = 30;
		while (x<650) {
			blocks.add(new BreakBlock(x, y, 50, 20, Color.BLUE));
			x+=60;
		}
		
		y = 40; x = 40;
		while (y<375) {
			blocks.add(new BreakBlock(x, y, 20, 50, Color.BLUE));
			y+=60;
		}
		
		y = 40; x = 650;
		while (y<375) {
			blocks.add(new BreakBlock(x, y, 20, 50, Color.BLUE));
			y+=60;
		}
	}
	
	public BlocksGroup(Color col) {
		blocks = new ArrayList<BreakBlock>();
		int x = 30; int y = 10;
		while (x<650) {
			blocks.add(new BreakBlock(x, y, 50, 20, Color.RED));
			x+=60;
		}
		y = 400; x = 30;
		while (x<650) {
			blocks.add(new BreakBlock(x, y, 50, 20, Color.RED));
			x+=60;
		}
		
		y = 40; x = 40;
		while (y<375) {
			blocks.add(new BreakBlock(x, y, 20, 50, Color.RED));
			y+=60;
		}
		
		y = 40; x = 650;
		while (y<375) {
			blocks.add(new BreakBlock(x, y, 20, 50, Color.RED));
			y+=60;
		}
	}
	
	public void draw (Graphics window) {
		for (BreakBlock b : blocks) {
			b.draw(window);
		}
	}
	
	public void checkCollision (Ball bl, Graphics window) {
		for (BreakBlock b : blocks) {
			b.ballColl(bl, window);
		}
	}
	
	public boolean allDead() {
		for (BreakBlock b : blocks) {
			if (b.isDead()==false) {
				return false;
			}
		}
		return true;
	}

}
