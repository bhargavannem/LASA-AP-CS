import java.util.*;
import java.io.*;

public class rearrange {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("rearrange.dat"));
        while(file.hasNextLine()){
            String str = file.nextLine();
            String[] temp = str.split(" ");
            for(String s: temp){
                if(s.length() < 3){
                    System.out.print("" + s + " ");
                }
                else if (s.length()%2 == 0){
                    String t = "" +s.charAt(0);
                    s = s.substring(1);
                    s = "" + s.charAt(s.length() - 1) + s;
                    s = s.substring(0, s.length() - 1);
                    s = s + t;
                    System.out.print(s + " ");
                }
                else{
                    String sol = new StringBuffer(s).reverse().toString();
                    System.out.print("" + sol + " ");
                }
            }
        }
        System.out.println("");
    }
}
