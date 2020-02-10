import java.util.Scanner;
import java.io.*;

public class elevator {
    public static void main(final String[] args) {
        try {
            final Scanner file = new Scanner(new File("elevator.dat"));
            int lineCount = file.nextInt();
            file.nextLine();
            int max = 2000;
            int ln = 0;
            String str = "";
            int loc;
            int sum;
            int lc;
            int currentNum;
            int someNum;
            String[] strArr;
            while (ln < lineCount) {
                loc = 0;
                sum = 0;
                lc = 0;
                str = file.nextLine();
                strArr = str.split(" ");
                int[] arr = new int[strArr.length];
                for (String k : strArr) {
                    arr[loc] = Integer.parseInt(k);
                    loc++;
                }
                boolean done = false;
                for (int i = 0; i < arr.length; i++) {
                    currentNum = arr[i];
                    someNum = sum + arr[i];
                    if (sum + arr[i] <= max && done == false) {
                        sum += arr[i];
                        ++lc;
                    } else {
                        done = true;
                    }
                }
                System.out.println(lc);
                ln++;
            }
            file.close();
        } catch (final Exception err) {
            System.out.println(err);
        }
    }
}