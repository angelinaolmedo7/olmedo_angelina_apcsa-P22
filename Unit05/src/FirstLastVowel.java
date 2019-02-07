//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Angelina Olmedo
//Date - 2/7/2019


public class FirstLastVowel
{
   public static String go( String a )
	{
	   if (a.substring(0,1).equals("A") || a.substring(0,1).equals("E") || a.substring(0,1).equals("I") || a.substring(0,1).equals("O") || a.substring(0,1).equals("U") || a.substring(0,1).equals("a") || a.substring(0,1).equals("e") || a.substring(0,1).equals("i") || a.substring(0,1).equals("O") || a.substring(0,1).equals("U") || a.substring(0,1).equals("a") || a.substring(0,1).equals("e") || a.substring(0,1).equals("i") || a.substring(0,1).equals("o") || a.substring(0,1).equals("u")){
		   return "yes";
	   }
	   else if (a.substring(a.length()-1,a.length()).equals("A") || a.substring(a.length()-1,a.length()).equals("E") || a.substring(a.length()-1,a.length()).equals("I") || a.substring(a.length()-1,a.length()).equals("O") || a.substring(a.length()-1,a.length()).equals("U") || a.substring(a.length()-1,a.length()).equals("a") || a.substring(a.length()-1,a.length()).equals("e") || a.substring(a.length()-1,a.length()).equals("i") || a.substring(a.length()-1,a.length()).equals("O") || a.substring(a.length()-1,a.length()).equals("U") || a.substring(a.length()-1,a.length()).equals("a") || a.substring(a.length()-1,a.length()).equals("e") || a.substring(a.length()-1,a.length()).equals("i") || a.substring(a.length()-1,a.length()).equals("o") || a.substring(a.length()-1,a.length()).equals("u")){
		   return "yes";
	   }
	   else return "no";
	}
}