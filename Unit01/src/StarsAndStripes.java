//© A+ Computer Science
//www.apluscompsci.com

//Name - Angelina Olmedo
//Date - 02/01/2019
//Class - APCSA
//Lab  - StarsAndStripes

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println("");
	   out.println("");
   }
   
   public void printASmallBox()
   {	
	   printTwentyDashes();
	   printTwentyStars();	
	   printTwentyDashes();
	   printTwentyStars();	
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   printASmallBox();
	   printASmallBox();
   }   
}