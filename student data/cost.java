import java.util.*;
import java.io.*;

public class cost {
    public static void main(String[] args) {
        Scanner in;
        try {
            in = new Scanner(new File("cost.dat"));
            int test_cases = in.nextInt();
            int counter = 0;
            String str;
            String[] temp;
            int[] arr;
            in.nextLine();
            while (counter < test_cases) {
                str = in.nextLine();
                temp = str.split(" ");
                arr = new int[temp.length];
                int loc = 0;
                for (String i : temp) {
                    arr[loc] = Integer.parseInt(i);
                    loc++;
                }
                Arrays.sort(arr);
                int mid = arr[(arr.length - 1) / 2];
                int c = counter + 1;
                System.out.println("Case " + c + ": " + mid);
                counter++;
            }
            in.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}