//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "Y";
		
		//add in a do while loop after you get the basics up and running
		
		while (!response.equals("N")) {
			String player = "";
			out.print("Rock-Paper-Scissors - pick your weapon [R,P,S]:: ");
			player = keyboard.nextLine().trim().substring(0, 1).toUpperCase();
			
			while (!player.equals("R")&&!player.equals("P")&&!player.equals("S")) {
				System.out.print("Please enter a valid answer [R/P/S] ");
				player = keyboard.nextLine().trim().substring(0, 1).toUpperCase();
			}
			
			RockPaperScissors game = new RockPaperScissors(player);
			System.out.println(game);
			
			System.out.print("\nPlay again? [Y/N] ");
			response = keyboard.nextLine().trim().substring(0, 1).toUpperCase();
			while (!response.equals("Y")&&!response.equals("N")) {
				System.out.print("Please enter a valid answer [Y/N] ");
				response = keyboard.nextLine().trim().substring(0, 1).toUpperCase();
			}
		}
	}
}



