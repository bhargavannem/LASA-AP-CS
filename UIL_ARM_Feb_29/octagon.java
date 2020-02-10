import java.util.*;
import java.io.*;
import java.text.*;

public class octagon {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file;
        DecimalFormat df = new DecimalFormat("0.00");
        file = new Scanner(new File("octagon.dat"));
        file.nextLine();
        while(file.hasNextLine()){
            double area = Double.parseDouble(file.nextLine());
            double side = Math.sqrt((area)/(2+(2*Math.sqrt(2))));
            side*=100.0;
            side = Math.round(side);
            side/=100.0;
            System.out.println(df.format(side));

        }
    }
}
