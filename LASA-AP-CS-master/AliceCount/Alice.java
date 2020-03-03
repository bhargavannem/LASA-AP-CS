// add import statements
import com.sun.xml.internal.fastinfoset.algorithm.HexadecimalEncodingAlgorithm;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
// create class AliceCount
public class Alice{
    private static DecimalFormat df = new DecimalFormat("0.00");
    private static DecimalFormat dfInt = new DecimalFormat("0");
    // create main method - remember to catch the exception
    public static void main(String[] args){
        try{
            // instantiate Scanner object using text file
            Scanner alice = new Scanner(new File("src/alice.txt"));

            // instantiate PrintWriter with output file name
            PrintWriter output = new PrintWriter(new FileOutputStream ("output.txt"));

            // create variable to track the number of words in the text
            int wordCount = 0;

            // create variable to track each of the letters
            double a = 0;
            double e = 0;
            double i = 0;
            double o = 0;
            double t = 0;
            boolean aTrue = false;
            boolean eTrue = false;
            boolean iTrue = false;
            boolean oTrue = false;
            boolean tTrue = false;
            // loop through the file
            while (alice.hasNext()){

                // read in the word one at a time
                String str = alice.next();
                // increment the word counter
                wordCount++;
                str = str.replaceAll("[^A-Za-z-]","");
                // write the word to the output file
                output.println(str);
                // check to see if the letter occurs in the word
                StringBuffer temp = new StringBuffer(str);
                if (temp.indexOf("a") != -1 || temp.indexOf("A") != -1){
                    a++;
                }
                if (temp.indexOf("e") != -1 || temp.indexOf("E") != -1){
                    e++;
                }
                if (temp.indexOf("i") != -1 || temp.indexOf("I") != -1){
                    i++;
                }
                if(temp.indexOf("o") != -1 || temp.indexOf("O") != -1){
                    o++;
                }
                if(temp.indexOf("t") != -1 || temp.indexOf("T") != -1){
                    t++;
                }

            }

            // calculate the percentage of words containing the character
            double aChance = a/wordCount * 100;
            double eChance = e/wordCount * 100;
            double iChance = i/wordCount * 100;
            double oChance = o/wordCount * 100;
            double tChance = t/wordCount * 100;
            System.out.println("e: " + dfInt.format(e));
            System.out.println("t: " + dfInt.format(t));
            System.out.println("a: " + dfInt.format(a));
            System.out.println("o: " + dfInt.format(o));
            System.out.println("i: " + dfInt.format(i));
            System.out.println("Word Count: " + dfInt.format(wordCount));
            System.out.println("Percentage of words containing the letter 'e' is " + df.format(eChance) + "%");
            System.out.println("Percentage of words containing the letter 't' is " + df.format(tChance) + "%");
            System.out.println("Percentage of words containing the letter 'a' is " + df.format(aChance) + "%");
            System.out.println("Percentage of words containing the letter 'o' is " + df.format(oChance) + "%");
            System.out.println("Percentage of words containing the letter 'i' is " + df.format(iChance) + "%");
            // close the files
            output.close();
        }
        catch (Exception io) {
            io.printStackTrace();
        }
    }

}