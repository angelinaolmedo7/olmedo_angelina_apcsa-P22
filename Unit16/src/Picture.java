import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void zeroRed() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(0);
      }
    }
  }
  
  public void zeroGreen() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setGreen(0);
      }
    }
  }
  
  //keepOnly
  
  public void keepOnlyBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  public void keepOnlyRed() {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels) {
	      for (Pixel pixelObj : rowArray) {
	        pixelObj.setBlue(0);
	        pixelObj.setGreen(0);
	      }
	    }
	  }
  public void keepOnlyGreen() {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels) {
	      for (Pixel pixelObj : rowArray) {
	        pixelObj.setRed(0);
	        pixelObj.setBlue(0);
	      }
	    }
	  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
	  public void mirrorVertical()
	  {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width / 2; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    } 
	  } 
	  public void mirrorVerticalRightToLeft() {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++) {
	      for (int col = pixels[row].length-1; col > width / 2; col--) {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    } 
	  } 
	 public void mirrorHorizontal() {
	   Pixel[][] pixels = this.getPixels2D();
	   Pixel topPixel = null;
	   Pixel botPixel = null;
	   int height = pixels.length;
	   for (int row = 0; row < height/2; row++) {
	     for (int col = 0; col < pixels[row].length; col++) {
	       topPixel = pixels[row][col];
	       botPixel = pixels[height - 1 - row][col];
	       botPixel.setColor(topPixel.getColor());
	     }
	   } 
	 } 
	 public void mirrorHorizontalBotToTop() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel botPixel = null;
	  int height = pixels.length;
	  for (int row = pixels.length-1; row > height/2; row--) {
	    for (int col = 0; col < pixels[row].length; col++) {
	      topPixel = pixels[row][col];
	      botPixel = pixels[height - 1 - row][col];
	      botPixel.setColor(topPixel.getColor());
	    }
	  } 
	} 
	 public void mirrorDiagonal() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel botPixel = null;
	  int height = 0; 
	  if (pixels.length < pixels[0].length) {
		  height = pixels.length-1;
	  }
	  else {
		  height = pixels[0].length - 1;
	  }
	  
	  for (int row = height; row >= 0; row--) {
	    for (int col = height; col >= 0 ; col--) {
	      topPixel = pixels[row][col];
	      botPixel = pixels[col][row];
	      botPixel.setColor(topPixel.getColor());
	    }
	  } 
	} 
	 public void mirrorArms() {
	    int mirrorPoint1 = 194; int mirrorPoint2 = 193;
	    Pixel topPixel = null;
	    Pixel botPixel = null;
	    Pixel[][] pixels = this.getPixels2D(); 
	    for (int row = 156; row < mirrorPoint1; row++) { //left
	      for (int col = 99; col < 170; col++) {
	        topPixel = pixels[row][col];
	        botPixel = pixels[mirrorPoint1 - row + mirrorPoint1][col];
	        botPixel.setColor(topPixel.getColor());
	      }
	    }  
	    for (int row = 163; row < mirrorPoint2; row++) { //right
	      for (int col = 238; col < 297; col++) {
	        topPixel = pixels[row][col];
	        botPixel = pixels[mirrorPoint2 - row + mirrorPoint2][col];
	        botPixel.setColor(topPixel.getColor());
	      }
	    }  
	  }
	  public void mirrorGull() {
	    int mirrorPoint = 366;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D(); 
	    for (int row = 230; row < 322; row++) { 
	      for (int col = 237; col < 345; col++) {
	        count++;
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    } 
	    //System.out.println(count);
	  }
  public void mirrorTemple() {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D(); 
    for (int row = 27; row < 97; row++) { 
      for (int col = 13; col < mirrorPoint; col++) { 
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  public void copyTwo(Picture fromPic, 
	          int startRow, int startCol, int sRow, int eRow, int sCol, int eCol) {
	Pixel fromPixel = null;
	Pixel toPixel = null;
	Pixel[][] toPixels = this.getPixels2D();
	Pixel[][] fromPixels = fromPic.getPixels2D();
	for (int fromRow = sRow, toRow = startRow; 
	  fromRow < eRow &&
	  toRow < toPixels.length; 
	  fromRow++, toRow++) {
		for (int fromCol = sCol, toCol = startCol; 
				fromCol < eCol &&
				toCol < toPixels[0].length;  
				fromCol++, toCol++) {
			fromPixel = fromPixels[fromRow][fromCol];
			toPixel = toPixels[toRow][toCol];
			toPixel.setColor(fromPixel.getColor());
			}
		}   
	}

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void createCollageTwo()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copyTwo(flower1,0,0, 50, 90, 20, 60);
    this.copyTwo(flower2,100,0,50, 90, 20, 60);
    this.copyTwo(flower1,200,0, 50, 90, 20, 60);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copyTwo(flowerNoBlue,300,0, 50, 90, 20, 60);
    this.copyTwo(flower1,400,0, 50, 90, 20, 60);
    this.copyTwo(flower2,500,0, 50, 90, 20, 60);
    this.mirrorVertical();
    this.write("collage.jpg");
  } 
  public void createMyCollage()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    Picture butterfly = new Picture("butterfly1.jpg");
    this.copy(caterpillar,0,200);
    this.copyTwo(butterfly,120,50,50, 90, 20, 60);
    Picture cat = new Picture(caterpillar);
    cat.grayscale();
    this.copy(cat,100,0);
    Picture butNoRed = new Picture(butterfly);
    butNoRed.zeroRed();
    this.copy(butNoRed,200,100);
    Picture onlyRed = new Picture(caterpillar);
    onlyRed.negate();
    this.copy(onlyRed,350,0);
    this.mirrorHorizontal();
    this.write("collage.jpg");
  }
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  public void edgeDetection2(int edgeDist) {
    Pixel leftPixel = null;
    Pixel botPixel = null;
    Pixel[][] pixelsTwo = this.getPixels2D();
    Color botColor = null; 
    for (int row = 0; row < pixelsTwo.length-1; row++) {
      for (int col = 0; 
           col < pixelsTwo[0].length; col++) {
        leftPixel = pixelsTwo[row][col];
        botPixel = pixelsTwo[row+1][col];
        botColor = botPixel.getColor(); 
        if (leftPixel.colorDistance(botColor) > edgeDist) {
        	leftPixel = pixelsTwo[row][col];
            leftPixel.setColor(Color.BLACK);
          }
          else
 	      {
 	        leftPixel = pixelsTwo[row][col];
 	        leftPixel.setColor(Color.WHITE);
 	      }
      	}
    } 
  }
  
  public void negate() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setBlue(255 - pixelObj.getBlue());
        pixelObj.setGreen(255 - pixelObj.getGreen());
      }
    }
  }
  
  public void grayscale() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
    	int avg = (pixelObj.getRed()+pixelObj.getBlue()+pixelObj.getGreen())/3;
        pixelObj.setRed(avg);
        pixelObj.setBlue(avg);
        pixelObj.setGreen(avg);
      }
    }
  }
  
  public void fixUnderwater() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
          pixelObj.setRed(0); 
          if (pixelObj.getGreen() > pixelObj.getBlue())
          pixelObj.setBlue(pixelObj.getBlue()*3/4);
      }
    }
  }
  
  public void encode(Picture messagePict)
  {
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  
	  int rv;
	  int gv;
	  int bv;
	  
	  //int count = 0;
	  for (int row = 0; row < this.getHeight(); row++) {
		  for (int col = 0; col < this.getWidth(); col++) {
			  currPixel = currPixels[row][col];
			  
			  rv = currPixel.getRed()%10;
			  gv = currPixel.getGreen()%10;
			  bv = currPixel.getBlue()%10;

			  if (rv==gv && gv==bv) {
				  currPixel.setRed((currPixel.getRed()-(currPixel.getRed()%10)+rv)+1);
			  }
		  }
	  }
	  for (int row = 0; row < this.getHeight(); row++) {
		  for (int col = 0; col < this.getWidth(); col++) {
			  currPixel = currPixels[row][col];
			  messagePixel = messagePixels[row][col];
			  
			  rv = currPixel.getRed()%10;
			  gv = currPixel.getGreen()%10;
			  bv = currPixel.getBlue()%10;
			  
			  int avg = (rv+gv+bv)/3;

			  if (messagePixel.getRed()<35 || messagePixel.getGreen()<35 || messagePixel.getBlue()<35) {
				  currPixel.setRed((currPixel.getRed()-rv+avg));
				  currPixel.setGreen((currPixel.getGreen()-gv+avg));
				  currPixel.setBlue((currPixel.getBlue()-bv+avg));
				  
				  if ((currPixel.getRed()%10 != currPixel.getBlue()%10)) {
					  System.out.println("uh oh sisters");
				  }
			  }
		  }
	  }
	  //System.out.println(count);
  }
  /**
  * Method to decode a message hidden in the
  * red value of the current picture
  * @return the picture with the hidden message
  */
  public Picture decode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;
	  int rv;
	  int gv;
	  int bv;

	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++) {
		  for (int col = 0; col < this.getWidth(); col++) {
			  currPixel = pixels[row][col];
			  
			  rv = currPixel.getRed()%10;
			  gv = currPixel.getGreen()%10;
			  bv = currPixel.getBlue()%10;

			  if (rv==gv && gv==bv) {
				  messagePixels[row][col].setColor(Color.BLACK);
			  }
		  }
	  }
	  //System.out.println(count);
	  return messagePicture;
  }
  
  public void encodeImg(Picture messagePict)
  {
	  
	  messagePict.keepOnlyRed();
	  
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  
	  /*
	  
	  int rv;
	  int gv;
	  int bv;
	  
	  //int count = 0;
	  
	  for (int row = 0; row < this.getHeight(); row++) {
		  for (int col = 0; col < this.getWidth(); col++) {
			  currPixel = currPixels[row][col];
			  
			  rv = currPixel.getRed()%10;
			  gv = currPixel.getGreen()%10;
			  bv = currPixel.getBlue()%10;
			  
			  int avg = (rv+gv+bv)/3;

			  if (!(rv==gv && gv == bv)) {
				  currPixel.setRed((currPixel.getRed()-rv+avg));
				  currPixel.setGreen((currPixel.getGreen()-gv+avg));
				  currPixel.setBlue((currPixel.getBlue()-bv+avg));
			  }
		  }
	  }
	  */
	  for (int row = 0; row < this.getHeight(); row++) {
		  for (int col = 0; col < this.getWidth(); col++) {
			  currPixel = currPixels[row][col];
			  messagePixel = messagePixels[row][col];
			  
			  int v1 = messagePixel.getRed()/100;
			  int v2 = (messagePixel.getRed()/10)%10;
			  int v3 = messagePixel.getRed()%10;

			  
			  currPixel.setRed(currPixel.getRed()-currPixel.getRed()%10+v1);
			  currPixel.setGreen(currPixel.getGreen()-currPixel.getGreen()%10+v2);
			  currPixel.setBlue(currPixel.getBlue()-currPixel.getBlue()%10+v3);
			  }
		  }
	  }
	  //System.out.println(count);
  /**
  * Method to decode a message hidden in the
  * red value of the current picture
  * @return the picture with the hidden message
  */
  public Picture decodeImg()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;

	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  //int count = 0;
	  
	  for (int row = 0; row < this.getHeight(); row++) {
		  for (int col = 0; col < this.getWidth(); col++) {
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
			  
			  int rv = currPixel.getRed()%10;
			  int gv = currPixel.getGreen()%10;
			  int bv = currPixel.getBlue()%10;

			  messagePixel.setRed(rv*100 + gv*10 + bv);
			  messagePixel.setBlue(0);
			  messagePixel.setGreen(0);
		  }
	  }
	  //System.out.println(count);
	  return messagePicture;
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
    
    Picture templ = new Picture("temple.jpg");
    templ.explore();
    templ.mirrorTemple();
    templ.explore();
    
    Picture feesh = new Picture("water.jpg");
    feesh.explore();
    feesh.fixUnderwater();
    feesh.explore();
    
    Picture collage = new Picture("640x480.jpg");
    collage.createMyCollage();
    collage.explore();
    
  }
  
} // this } is the end of class Picture, put all new methods before this
