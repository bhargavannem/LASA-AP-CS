import java.util.Scanner;
import java.io.*;

public class test {
    public static void main(final String[] args) {
        try {
            final Scanner file = new Scanner(new File("test.dat"));
            int num = 0;
            if(file.hasNext()){
            num = file.nextInt();
            }
            System.out.println("tests = " + num);
            System.out.println();
            int lineCount = 1;
            int testNum = 1;
            while(testNum <= num){
                lineCount = 1;
                System.out.println("Processing test #" + testNum);
                System.out.println("working on line " + lineCount);
                System.out.print(file.nextLine());
                System.out.println(file.nextLine());
                lineCount++;
                System.out.println("working on line " + lineCount);
                while(file.hasNextInt()){
                    System.out.print(file.nextInt() + " ");
                }
                System.out.println();

                lineCount++;
                System.out.println("working on line " + lineCount);
                while (file.hasNextFloat()) {
                    System.out.print(file.nextFloat() + " ");
                }
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