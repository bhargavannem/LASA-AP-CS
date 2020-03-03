// add import statements
import java.util.Scanner;
import java.io.*;

// create class AliceCount
public class AliceCount{

	// create main method - remember to catch the exception
	public static void main(String[]{
	try{
		// instantiate Scanner object using text file
		Scanner scan = new Scanner(System.in);
		Scanner in = new Scanner(File("alice.txt"));
		Scanner output = new Scanner( new File("output.txt"));
		// instatiate PrintWriter with output file name
		PrintWriter out = new PrintWriter(new FileOutputStream ("alice.txt"));
		// create variable to track the number of words in the text
		int words;
		// create variable to track each of the letters
		int e;
		int t;
		int a;
		int o;
		int i;
		// loop through the file		
		while(scan.hasNext()){
			// read in the word one at a time
			String word = scan.next();
			
			// increment the word counter
			words++;
			word.split();
			// check to see if the letter occurs in the word
			
			
				// increment the letter counter

				
				// write the word to the output file
			
		}
		// calculate the percentage of words containing the character
		
		
		// close the files
	}
	}
catch (Exception io) {
    System.out.println(io);
    return null;
  }
}
