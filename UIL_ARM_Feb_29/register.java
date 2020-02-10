import java.util.*;
import java.io.*;

public class register {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file;
        file = new Scanner(new File("register.dat"));
        final double zero = 0.0;
        double finalExpected = 0.0;
        while(file.hasNextLine()){
            double expected = file.nextDouble();
            expected-=(double)(file.nextInt()*20);
            expected -= (double) (file.nextInt() * 10);
            expected -= (double) (file.nextInt() * 5);
            expected -= (double) (file.nextInt());
            expected -=((double)(file.nextInt()))*0.25;
            expected -= ((double) (file.nextInt())) * 0.1;
            expected -= ((double) (file.nextInt())) * 0.05;
            expected -= ((double) (file.nextInt())) * 0.01;
            finalExpected = expected;
            finalExpected *=100;
            finalExpected = Math.round(finalExpected);
            finalExpected/=100;
            if (finalExpected < zero) {
                System.out.println("Over $" + -1 * finalExpected);
            } else if (finalExpected > zero) {
                System.out.println("Missing $" + finalExpected);
            } else {
                System.out.println("Correct");
            }
            finalExpected = 0.0;
            expected = 0.0;
        }
    }
}