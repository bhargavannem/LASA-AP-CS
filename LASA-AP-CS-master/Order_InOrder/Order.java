import java.util.*;

public class Order {
    // main(): program starting point
    public static void main(String[] args) {
        // set up scanner to read input from user
        Scanner scan = new Scanner(System.in);

        // prompt the user for input
        System.out.print("Enter x, y, and z: ");

        // use the scanner to read in the input

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        // create InOrder object by calling the initialization constructor
        InOrder order = new InOrder(x, y, z);

        // call the method in InOrder you created to determine whether the numbers
        // were in order. Remember to put the method call inside a print statement
        System.out.println(order.toString());

    }
}