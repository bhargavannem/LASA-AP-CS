import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class WordSearchRunner {
    public static void main(String[] args) throws FileNotFoundException {
        // instantiate Scanner object to read in from file
        Scanner scan = new Scanner(System.in);
        Scanner file = new Scanner(new File("word.txt"));
        // read in rows
        int rows = 0;
        if (file.hasNextInt()) {
            rows = scan.nextInt();
        }
        // read in columns
        int col = 0;
        if (file.hasNextInt()) {
            col = scan.nextInt();
        }
        // instantiate WordSearch object passing in number of rows & columns for 2D array
        WordSearch wordSearch = new WordSearch(rows, col);
        // loop through the rows in the file
        String rowStr[] = new String[rows];
        for (int j = 0; j <= rows; j++) {
            // loop through the columns in the file
            for (int i = 0; i <= col; i++) {
                // pass row, column, and value into the 2D array
                wordSearch.setSpot(file.next(), j, i);
            }
        }


        // read in value from file using local variable
        String toFind = "";
        boolean foundStr = false;
        int length = 0;
        int skips = 0;
        while (!foundStr) {
            file.nextLine();
            if (skips>0 && file.hasNextInt()) {
                // read number of works to search for from file
                length = scan.nextInt();
                foundStr = true;
                file.nextLine();
                while (file.hasNext()) {
                    toFind = file.next();
                    wordSearch.inGrid(toFind);
                    file.nextLine();
                }
            }
            skips++;
        }


        // read in word from file
        // method call to search for the word in the 2D array

        // print out word to search for and true/false


    }
}