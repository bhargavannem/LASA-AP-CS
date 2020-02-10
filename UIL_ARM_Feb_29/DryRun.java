import java.util.*;
import java.io.*;

public class DryRun {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file;
            file = new Scanner(new File("pr00.dat"));
            int counter = file.nextInt();
            file.nextLine();
            for(int i = 0; i < counter; i++){
                System.out.println(file.nextInt() + 1);
                file.nextLine();
            }
    }
}
