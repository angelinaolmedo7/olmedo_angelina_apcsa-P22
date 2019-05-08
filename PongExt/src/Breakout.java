import static java.lang.Character.toUpperCase;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Breakout extends Canvas implements KeyListener, Runnable{

	private Ball ball;
	private BreakoutPaddle myPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private BlocksGroup myBlocks;
	//private boolean gameOver;

	public Breakout()
	{
		ball = new Ball(100,350,15,15,Color.PINK,3,3);
		myPaddle = new BreakoutPaddle(350,280,50,20,Color.GREEN,3);
		myBlocks = new BlocksGroup();
		//keys = new boolean[2];
		//gameOver = false;
		keys = new boolean[4];

    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   if (myBlocks.allDead()) {
		   myBlocks = new BlocksGroup(Color.RED);
		   ball.setSpeed(ball.getXSpeed()+1, ball.getYSpeed()+1);
	   }
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		myPaddle.draw(graphToBack);
		myBlocks.draw(graphToBack);

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		/*
			if (ball.getX() < leftPaddle.getX()) {
				rScore++;
			}
			else if (ball.getX() + ball.getWidth() > rightPaddle.getX() + rightPaddle.getWidth()) {
				lScore++;
			}
			gameOver = true;
		}
		*/

		/*
		if (gameOver) {
			ball.draw(window,Color.WHITE);
			ball = new Ball(100,350,15,15,Color.PINK,3,3);
			gameOver = false;
		}
		*/
		
		//see if the ball hits the top or bottom wall 

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}


		if (((ball.getX() <= myPaddle.getX() + myPaddle.getWidth() + Math.abs(ball.getXSpeed()) &&
				ball.getX() > myPaddle.getX()) || 
				(ball.getX() + ball.getWidth() >= myPaddle.getX() - Math.abs(ball.getXSpeed())) && 
				(ball.getX() + ball.getWidth() < myPaddle.getX()+myPaddle.getWidth())) && 
				((ball.getY() >= myPaddle.getY() && 
				ball.getY() <= myPaddle.getY() + myPaddle.getHeight()) ||
				(ball.getY() + ball.getHeight() >= myPaddle.getY() &&
				ball.getY() + ball.getHeight() < myPaddle.getY() + myPaddle.getHeight())))
		{
			if (((ball.getX() <= myPaddle.getX() + myPaddle.getWidth() - Math.abs(ball.getXSpeed())) && 
					ball.getX() + ball.getWidth() >= myPaddle.getX() + Math.abs(ball.getXSpeed()))) ball.setYSpeed(-ball.getYSpeed());
			else ball.setXSpeed(-ball.getXSpeed());
		}
		
		myBlocks.checkCollision(ball, graphToBack);

		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			if (myPaddle.getX()>=100) {
				myPaddle.moveLeftAndDraw(graphToBack);
			}
		}
		if(keys[1] == true) {
			if (myPaddle.getX()<=650) {
				myPaddle.moveRightAndDraw(graphToBack);
			}
		}
		if(keys[2] == true)
		{
			if (myPaddle.getY()>=75) {
				myPaddle.moveUpAndDraw(graphToBack);
			}
		}
		if(keys[3] == true) {
			if (myPaddle.getY()<=450) {
				myPaddle.moveDownAndDraw(graphToBack);
			}
		}
		
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(350, 500, 100, 100);
		
		graphToBack.setColor(Color.RED);
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
		case 'A' : keys[0]=true; break;
		case 'D' : keys[1]=true; break;
		case 'W' : keys[2]=true; break;
		case 'S' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'A' : keys[0]=false; break;
			case 'D' : keys[1]=false; break;
			case 'W' : keys[2]=false; break;
			case 'S' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	

}
