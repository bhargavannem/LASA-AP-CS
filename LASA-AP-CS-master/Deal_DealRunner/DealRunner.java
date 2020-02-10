import java.util.Scanner;

public class DealRunner {
	public static void main(String[] args) {
		// instantiate Scanner object
		Scanner scan = new Scanner(System.in);

		// prompt the user for the number of simulations to run
		System.out.println("How many simulations do you want to run? ");

		// assign input to variable
		int count = scan.nextInt();

		// declare variables to store stopping condition for loop, prize loc, user
		// guess,
		// door revealed, the new guess, and wins by changing
		int prize;
		int guess;
		int newGuess;
		int stop;
		int changeWins;
		int wins;
		int view;
		boolean isWin;
		stop = 0;
		changeWins = 0;
		wins = 0;
		// loop through the number of simulations
		for (stop = 0; stop <= count; stop++) {
			// instantiate a Deal object inside the loop
			Deal deal = new Deal();
			// get the user's guess and assign to a variable
			guess = deal.getUserGuess();

			// get the prize location and assign to a variable
			prize = deal.getPrizeLoc();

			// get the door which is revealed and assign to a variable
			view = deal.prizeLoc();

			// get the new guess and assign to a variable
			newGuess = deal.newGuess();

			// Win condition
			// determine if the new guess matches the prize location
			if (newGuess == prize) {
				// increment the win count by changing
				changeWins++;
				wins++;
			} else if (newGuess == prize) {
				wins++;
			}
			// output the variables for each simulation
			System.out.println("prize:" + prize + " guess:" + guess + " view:" + view + " new guess:" + newGuess
					+ " win:" + (newGuess == prize));

		}
		// output the probability of winning/not winning by switching
		System.out.print("Probablility of winning if you switch = ");
		System.out.println(((double) changeWins / count));
		System.out.print("Probability of winning if you do not switch = ");
		System.out.println(1 - ((double) changeWins / count));

	}
}
