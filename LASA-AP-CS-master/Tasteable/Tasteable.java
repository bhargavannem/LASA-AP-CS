import java.util.Scanner;

public class Tasteable {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double weeks;
		double BestTaste;
		System.out.println("What is the shelf life of your ice cream in weeks?");
		weeks = scan.nextInt();
		scan.nextLine();
		BestTaste = (0.5 * weeks) + 7;
		System.out.println("Your ice cream will taste the best when it is " + BestTaste + " weeks old.");
	}
}3