import java.util.Scanner;

public class CalculatorRunner{
    public static void main(String[] args) {
        int num1;
        int num2;
        char operator;

        // instantiate a Scanner
        Scanner scan = new Scanner(System.in);

        // prompt the user for the operator (how do you read in a character?)
        System.out.println("Enter the operator: ");

        // assign the input from the user to operator variable
        operator = scan.next().charAt(0);

        // setup a set of conditions below to determine if the operator is valid
        if (!((operator == '+') || (operator == '-') || (operator == '*') || (operator == '/'))) {
            System.out.println("Invalid Operator");
            return;
        } else {

            // get the remaining inputs from the user
            System.out.println("Enter the first operand: ");
            num1 = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the second operand: ");
            num2 = scan.nextInt();
            scan.nextLine();

            // check for division by zero
            if ((operator == '/') && (num2 == 0)) {
                System.out.println("Invalid Operand for Division");
                return;
            }
            // instantiate Calculator object with the values entered by the user
            Calculator calc = new Calculator(operator, num1, num2);
            calc.asmd();
            System.out.println(calc.toString());

        }

    } // call the toString() method to print the results

}
