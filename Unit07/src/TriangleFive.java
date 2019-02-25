//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;
   private char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	public TriangleFive()
	{
		setLetter('A');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		String let = ""+c;
		letter = let.toUpperCase().charAt(0);
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	
	public int findLocation () {
		int loc = 0;
		for (int i = 0; i<alphabet.length; i++) {
			if (alphabet[i]==letter) {
				loc = i;
			}
		}
		return loc;
	}
	
	public String doTriBase() {
		String tri = "";
		int repeat = amount;
		int start = findLocation();
		
		for (int i=0;i<amount;i++) {
			for (int n = repeat; n>0; n--) {
				if ((start+i>25)) {
					start = 0-i;
				}
				tri += alphabet[start+i];
			}
			tri+=" ";
			repeat -= 1;
		}
		
		return tri;
	}
	
	public String otherLines () {
		String base = doTriBase();
		String addTo = base;
		String line ="";
		int sub = 1;
		for (int i=0;i<amount;i++) {
			addTo = addTo.substring(0, addTo.length()-sub);
			line += (addTo+"\n");
			sub++;
		}
		return line;
	}

	public String toString()
	{
		String output= otherLines();
		return output;
	}
}