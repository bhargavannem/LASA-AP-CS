import java.util.*;
import java.io.*;

public class most_value {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new File("most_value.dat"));
        int number;
        int accounts;
        int total;
        int counter = 0;
        int bigCount = 0;
        int index;
        ArrayList<Integer> vals = new ArrayList<Integer>();

        while(file.hasNextLine()){
            Scanner in = new Scanner(file.nextLine());
            while(in.hasNextInt()){
                vals.add(in.nextInt());
            }

            for(int i = 0; i < vals.size(); i++){
                int theVal = vals.get(i);
                for(int c: vals){
                    if(c == theVal){
                        counter++;
                    }
                }
            }

            if(counter >= bigCount){
                bigCount = counter;
                index = i;
            }


            counter = 0;
        }
    }
}
