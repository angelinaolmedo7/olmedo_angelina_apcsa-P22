//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		
		int size = file.nextInt();
		List<Word> words = new ArrayList<Word>();
		
		file.nextLine();
		
		for (int i = 0; i < size; i++) {
			words.add(new Word(file.nextLine()));
		}
		
		List<Word> newWords = new ArrayList<Word>();
		
		for (int i = 0; i<size;i++) {
			Word next = words.get(0);
			for (int b = 1; b<words.size();b++)
				if (words.get(b).compareTo(next)<0) {
					next = words.get(b);
				}
			newWords.add(next);
			words.remove(next);
		}
		
		System.out.println(newWords);
		











	}
}