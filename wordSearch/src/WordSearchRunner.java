import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class WordSearchRunner {
    public static void main(String[] args) throws FileNotFoundException {
        // instantiate Scanner object to read in from file
        Scanner file = new Scanner(new File("word.txt"));
        // read in rows
        int rows = file.nextInt();
        // read in columns
        int columns = file.nextInt();
        file.nextLine();
        // instantiate WordSearch object passing in number of rows & columns for 2D array
        WordSearch ws = new WordSearch(rows, columns);
        // loop through the rows in the file
        String str = "";
        for (int r = 0; r < rows; r++) {
            // loop through the columns in the file
            for (int c = 0; c < columns; c++) {
                // read in value from file using local variable
                str = file.next();
                // pass row, column, and value into the 2D array
                ws.setSpot(str, r, c);
            }
        }
        // read number of works to search for from file
        int wordCount = file.nextInt();
        // loops through the words
        String toSearch = "";
        boolean result;
        for (int wc = 0; wc < wordCount; wc++) {
            // read in word from file
            toSearch = file.next();
            // method call to search for the word in the 2D array
            result = ws.inGrid(toSearch);
            // print out word to search for and true/false
            System.out.println("" + toSearch + " - " + result);
        }
    }
}