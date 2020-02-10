import java.util.*;
import java.io.*;

public class album_length {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file;
        file = new Scanner(new File("album_length.dat"));
        file.nextLine();
        int finalMinutes = 0;
        int finalSeconds = 0;
        while(file.hasNextLine()){
            String s = file.nextLine();
            s = s.substring(s.indexOf(",")+2);
            int index = s.indexOf(":");
            String m = s.substring(0,index);
            s = s.substring(index+1);
            Scanner min = new Scanner(m);
            Scanner sec = new Scanner(s);
            int minutes = min.nextInt();
            int seconds = sec.nextInt();
            minutes += seconds/60;
            seconds%=60;
            finalMinutes+=minutes;
            finalSeconds+=seconds;
        }
        finalMinutes += finalSeconds/60;
        finalSeconds %=60;
        if(finalSeconds <10){
            System.out.println("The album length is " + finalMinutes + ":0" + finalSeconds);
        }else{
            System.out.print("The album length is " + finalMinutes + ":" + finalSeconds);
        }
    }
}
