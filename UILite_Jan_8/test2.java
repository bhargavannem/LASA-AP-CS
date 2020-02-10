import java.util.Scanner;
import java.io.*;

public class test2 {
    public static void main(final String[] args) {
        try {
            final Scanner file = new Scanner(new File("test2.dat"));
            int num = 0;
            if(file.hasNext()){
            num = file.nextInt();
            }
            System.out.println("tests = " + num);
            System.out.println();
            int lineCount = 1;
            int testNum = 1;
            int sum = 0;
            float altsum = 0;
            String str = "";
            String rev = "";
            while(testNum <= num){
                str = "";
                rev = "";
                lineCount = 1;
                System.out.println("Processing test #" + testNum);
                System.out.println("working on line " + lineCount);
                System.out.print(file.nextLine());
                str = file.nextLine();
                String arr[] = str.split(" ");
                for(int i = arr.length - 1; i >= 0; i--){
                    rev += arr[i] + " ";
                }
                System.out.println("backwards = " + rev);
                lineCount++;
                System.out.println("working on line " + lineCount);
                while(file.hasNextInt()){
                    sum += file.nextInt();
                }
                System.out.println("sum = " + sum);
                sum = 0;
                lineCount++;
                System.out.println("working on line " + lineCount);
                while (file.hasNextFloat()) {
                    altsum += file.nextFloat();
                }
                System.out.println("sum = " + altsum);
                altsum = 0;
                System.out.println();
                System.out.println();

                testNum++;
            }
            file.close();
        } catch (final Exception err) {
            System.out.println(err);
        }
    }
}