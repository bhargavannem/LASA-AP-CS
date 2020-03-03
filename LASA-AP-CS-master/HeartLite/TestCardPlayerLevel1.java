/*
/    Authors:
/        B. Annem
*/
import java.util.ArrayList;
import java.util.Collections;

public class TestCardPlayerLevel1 {
	final static int HEARTS_VAL = 1;
	final static int QUEEN_VAL = 13;

	public static void main(String[] args) {
		
		ArrayList<Card> hand = new ArrayList<Card>();
        CardPlayer c = new CardPlayerLevel1("John Griffin", hand, 0);
        System.out.println("New CardPlayerLevel1 -> " + c);
        hand.add(new Card("3", "diamonds", 3));
        hand.add(new Card("6", "diamonds", 6));
		hand.add(new Card("A", "hearts", 14));
		hand.add(new Card("J", "hearts", 11));
		hand.add(new Card("Q", "spades", 12));
        hand.add(new Card("7", "spades", 7));
        hand.add(new Card("2", "clubs", 2));
        c.setHand(hand);
        System.out.println("After adding " + hand.size() + " specific cards. Player -> " + c);
        c.setScore(3);
        ArrayList<Card> in_round = new ArrayList<Card>();
        ArrayList<Card> in_game = new ArrayList<Card>();
        System.out.println("Cards played in round -> " + in_round);
        System.out.println("Cards played in game -> " + in_game);
        Card two_of_clubs = new Card("2", "clubs", 2);
        in_round.add(two_of_clubs);
        in_game.add(two_of_clubs);
        c.chooseCard(in_round, in_game);
        System.out.println("Chose 2 of clubs -> " + two_of_clubs + " Player -> " + c);
		in_round.clear();
		Card ten_of_spades = new Card("10", "spades", 10);
        in_round.add(ten_of_spades);
        System.out.println("Cards played in round -> " + in_round);
        System.out.println("RANDOMLY chosen spade -> " + c.chooseCard(in_round, in_game) + " Player -> " + c);
		in_round.clear();
		Card nine_of_clubs = new Card("9", "clubs", 9);
		in_round.add(nine_of_clubs);
		System.out.println("Cards played in round -> " + in_round);
        System.out.println("RANDOM Card chosen -> " + c.chooseCard(in_round, in_game) + " Player -> " + c);
		in_round.clear();
		in_round.add(new Card("9", "clubs", 9));
        System.out.println("Card played in round -> " + in_round);
        System.out.println("RANDOMLY chosen card -> " + c.chooseCard(in_round, in_game) + " Player -> " + c);
		in_round.clear();
		in_round.add(new Card("4", "clubs", 4));
        System.out.println("Card played in round -> " + in_round);
		System.out.println("RANDOMLY chosen card -> " + c.chooseCard(in_round, in_game) + " Player -> " + c);
		in_round.clear();
		in_round.add(new Card("J", "spades", 11));
        System.out.println("Card played in round -> " + in_round);
        System.out.println("RANDOMLY chosen card -> " + c.chooseCard(in_round, in_game) + " Player -> " + c);
		in_round.clear();
	}
}