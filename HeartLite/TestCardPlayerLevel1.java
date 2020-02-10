import java.util.ArrayList;
import java.util.Collections;

public class TestCardPlayerLevel1 {
	final static int HEARTS_VAL = 1;
	final static int QUEEN_VAL = 13;

	public static void main(String[] args) {
		/*
		 * ArrayList<Card> hand = new ArrayList<Card>(); CardPlayerLevel1 c = new
		 * CardPlayerLevel1("Kara Jones", hand, 0);
		 * System.out.println("New CardPlayer -> " + c); hand.add(new Card("3",
		 * "diamonds", 3)); hand.add(new Card("A", "hearts", 14)); hand.add(new
		 * Card("6", "spades", 6)); hand.add(new Card("7", "spades", 7)); hand.add(new
		 * Card("2", "clubs", 2)); hand.add(new Card("3", "clubs", 3)); c.setHand(hand);
		 * System.out.println("After adding 6 specific cards. Player -> " + c);
		 * c.playCard(5); c.setScore(27); System.out.
		 * println("Played c3(3) at index 5 and updated score to 27 points. Player -> "
		 * + c); ArrayList<Card> in_round = new ArrayList<Card>(); ArrayList<Card>
		 * in_game = new ArrayList<Card>();
		 * System.out.println("Cards played in round -> " + in_round);
		 * System.out.println("Cards played in game -> " + in_game); Card two_of_clubs =
		 * new Card("2", "clubs", 2); in_game.add(two_of_clubs); c.chooseCard(in_round,
		 * in_game); System.out.println("Chose 2 of clubs -> " + two_of_clubs +
		 * " Player -> " + c); Card ten_of_spades = new Card("10", "spades", 10);
		 * in_round.add(ten_of_spades); System.out.println("Cards played in round -> " +
		 * in_round); System.out.println("RANDOMLY chosen spade -> " +
		 * c.chooseCard(in_round, in_game) + " Player -> " + c); Card nine_of_clubs =
		 * new Card("9", "clubs", 9); in_round.add(nine_of_clubs);
		 * System.out.println("heart chosen -> " + c.chooseCard(in_round, in_game) +
		 * " Player -> " + c); in_round.clear();
		 * System.out.println("Cards played in round -> " + in_round); in_round.add(new
		 * Card("3", "diamonds", 3)); System.out.println("RANDOMLY chosen card -> " +
		 * c.chooseCard(in_round, in_game) + " Player -> " + c);
		 */
		Deck d = new Deck();
		d.shuffle();
		// Create all of the hands for the four players
		ArrayList<Card> first_player_hand = new ArrayList<Card>();
		ArrayList<Card> second_player_hand = new ArrayList<Card>();
		ArrayList<Card> third_player_hand = new ArrayList<Card>();
		ArrayList<Card> level1_player_hand = new ArrayList<Card>();

		// Create three CardPlayer players and one level one
		CardPlayer c_player_1 = new CardPlayer("Player 1", first_player_hand, 0);
		CardPlayer c_player_2 = new CardPlayer("Player 2", second_player_hand, 0);
		CardPlayer c_player_3 = new CardPlayer("Player 3", third_player_hand, 0);
		CardPlayerLevel1 c_player_lev = new CardPlayerLevel1("Upgraded Player", level1_player_hand, 0);

		// Deal out the cards
		Card two_clubs = new Card("2", "clubs", 2);
		int two_of_spades_counter = 0;
		for (int i = 0; i < 13; i++) {
			first_player_hand.add(d.dealTopCard());
			if (first_player_hand.get(first_player_hand.size() - 1).equals(two_clubs)) {
				two_of_spades_counter = 0;
			}
			second_player_hand.add(d.dealTopCard());
			if (second_player_hand.get(second_player_hand.size() - 1).equals(two_clubs)) {
				two_of_spades_counter = 1;
			}
			third_player_hand.add(d.dealTopCard());
			if (third_player_hand.get(third_player_hand.size() - 1).equals(two_clubs)) {
				two_of_spades_counter = 2;
			}
			level1_player_hand.add(d.dealTopCard());
			if (level1_player_hand.get(level1_player_hand.size() - 1).equals(two_clubs)) {
				two_of_spades_counter = 3;
			}
		}
		System.out.println("First Player: " + c_player_1);
		System.out.println("Second Player: " + c_player_2);
		System.out.println("Third Player: " + c_player_3);
		System.out.println("Upgraded Player: " + c_player_lev);

		// Play the game
		ArrayList<Card> round = new ArrayList<Card>();
		ArrayList<Card> game = new ArrayList<Card>();
		for (int g = 0; g < 13; g++) {
			for (int r = 0; r < 4; r++) {
				if (two_of_spades_counter == 0) {
					round.add(c_player_1.chooseCard(round, game));
					round.add(c_player_2.chooseCard(round, game));
					round.add(c_player_3.chooseCard(round, game));
					round.add(c_player_lev.chooseCard(round, game));
				} else if (-two_of_spades_counter == 1) {
					round.add(c_player_2.chooseCard(round, game));
					round.add(c_player_3.chooseCard(round, game));
					round.add(c_player_lev.chooseCard(round, game));
					round.add(c_player_1.chooseCard(round, game));
				} else if (-two_of_spades_counter == 2) {
					round.add(c_player_3.chooseCard(round, game));
					round.add(c_player_lev.chooseCard(round, game));
					round.add(c_player_1.chooseCard(round, game));
					round.add(c_player_2.chooseCard(round, game));
				} else if (-two_of_spades_counter == 3) {
					round.add(c_player_lev.chooseCard(round, game));
					round.add(c_player_1.chooseCard(round, game));
					round.add(c_player_2.chooseCard(round, game));
					round.add(c_player_3.chooseCard(round, game));
				}

			}
			game.addAll(round);
			round.clear();
		}

	}
}