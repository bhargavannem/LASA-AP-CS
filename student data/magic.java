import java.util.*;
import java.io.*;

public class magic {
    public static void main(String[] args) {
        Scanner in;
        try {
            in = new Scanner(new File("magic.dat"));
            while (in.hasNext()) {
                String str = in.nextLine();
                if (!str.equals("0 0 0 0 0")) {
                    String arr[] = str.split(" ");
                    int int_arr[] = new int[arr.length];
                    int counter = 0;
                    for (String s : arr) {
                        int_arr[counter] = Integer.parseInt(s);
                        counter++;
                    }
                    int a = int_arr[0];
                    int b = int_arr[1];
                    int c = int_arr[2];
                    int d = int_arr[3];
                    int L = int_arr[4];
                    int total = 0;
                    for (int x = 0; x <= L; x++) {
                        if ((a * x * x + b * x + c) % d == 0) {
                            total++;
                        }
                    }
                    System.out.println(total);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}