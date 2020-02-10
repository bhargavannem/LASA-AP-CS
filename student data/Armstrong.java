import java.util.*;
import java.io.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in;
        try {
            in = new Scanner(new File("armstrong.dat"));
            int n = in.nextInt();
            in.nextLine();
            for (int k = 0; k < n; k++) {
                String str = in.nextLine();
                String[] arr = str.split("");
                int[] int_arr = new int[arr.length];
                int counter = 0;
                for (String s : arr) {
                    int_arr[counter] = Integer.parseInt(s);
                    counter++;
                }
                int sum = 0;
                for (int i : int_arr) {
                    sum += Math.pow(i, int_arr.length);
                }
                String num = "" + sum;
                if (num.equals(str)) {
                    System.out.println("ARMSTRONG");
                } else {
                    System.out.println("NOT AN ARMSTRONG");
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}