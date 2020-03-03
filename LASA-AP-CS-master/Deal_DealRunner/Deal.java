import java.util.*;

public class Deal {
	// instance variables
	private int prizeLoc;
	private int userGuess;

	// constructor
	public Deal() {
		setPrizeLoc();
		setUserGuess();
	}

	// modifier method for userGuess (should call random number method)
	public void setUserGuess() {
		userGuess = randomNumber(3, 1);
	}

	// modifier method for prizeLoc (should call random number method)
	public void setPrizeLoc() {
		prizeLoc = randomNumber(3, 1);
	}

	// accessor method for userGuess
	public int getUserGuess() {
		return userGuess;
	}

	// accessor method for prizeLoc
	public int getPrizeLoc() {
		return prizeLoc;
	}

	// method to generate random number between 1 & 3
	public static int randomNumber(int high, int low) {
		return (int) (low + (Math.random() * (high)));
	}

	public static int randomNumber(int high, int low, int exclude) {
		int sol = (int) (low + ((Math.random() * (high))));
		while ((exclude == sol) || (exclude == 0)) {
			sol = (int) (low + ((Math.random() * (high))));
		}
		return sol;
	}

	// method to reveal the door
	public int prizeLoc() {
		int door = randomNumber(3, 1);
		if (userGuess == prizeLoc) {
			door = randomNumber(3, 1, userGuess);
			door = randomNumber(3, 1);
			return door;
		} else {
			while (userGuess == door || prizeLoc == door) {
				door = randomNumber(3, 1);
			}
			return door;
		}
	}

	// method to update user's guess
	public int newGuess() {
		int newGuess = userGuess;
		while (newGuess == userGuess) {
			newGuess = randomNumber(3, 1, userGuess);
		}
		return newGuess;
	}

	// toString method
	public String toString() {
		return "user guess: " + userGuess + " prizeLoc: " + prizeLoc;
	}
}