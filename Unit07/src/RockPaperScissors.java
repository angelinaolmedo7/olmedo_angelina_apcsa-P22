//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("R");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		compChoice = makeCompChoice();
	}
	
	public String makeCompChoice() {
		
		Random rand = new Random();
		int n = rand.nextInt(3) + 1;
		
		if (n==1) {
			return "R";
		}
		else if (n==2) {
			return "P";
		}
		else {
			return "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		if (playChoice.equals("R")){
			if (compChoice.equals("R")) {
				winner = "Tie";
			}
			else if (compChoice.equals("P")){
				winner = "Computer";
			}
			else winner = "Player";
		}
		else if (playChoice.equals("P")) {
			if (compChoice.equals("R")) {
				winner = "Player";
			}
			else if (compChoice.equals("P")) {
				winner = "Tie";
			}
			else winner = "Computer";
		}
		else { // S
			if (compChoice.equals("R")) {
				winner = "Computer";
			}
			else if (compChoice.equals("P")) {
				winner = "Player";
			}
			else winner = "Tie";
			
		}
		return winner;
	}

	public String toString()
	{
		String output="Player had :: "+playChoice+"\nComputer had :: "+compChoice+"\nThe winner is :: "+determineWinner();
		return output;
	}
}