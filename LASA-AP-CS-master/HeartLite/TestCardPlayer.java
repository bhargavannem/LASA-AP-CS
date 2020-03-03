import java.util.ArrayList;

/*
    Authors:
        B. Annem
        B. Woytek
*/

public class TestCardPlayer {
    public static void main(String[] args) {
        ArrayList<Card> hand = new ArrayList<Card>();
        CardPlayer c = new CardPlayer("Kara Jones", hand, 0);
        System.out.println("New CardPlayer -> " + c);
        hand.add(new Card("3", "diamonds", 3));
        hand.add(new Card("A", "hearts", 14));
        hand.add(new Card("6", "spades", 6));
        hand.add(new Card("7", "spades", 7));
        hand.add(new Card("2", "clubs", 2));
        hand.add(new Card("3", "clubs", 3));
        c.setHand(hand);
        System.out.println("After adding 6 specific cards. Player -> " + c);
        c.playCard(5);
        c.setScore(27);
        System.out.println("Played c3(3) at index 5 and updated score to 27 points. Player -> " + c);
        ArrayList<Card> in_round = new ArrayList<Card>();
        ArrayList<Card> in_game = new ArrayList<Card>();
        System.out.println("Cards played in round -> " + in_round);
        System.out.println("Cards played in game -> " + in_game);
        Card two_of_clubs = new Card("2", "clubs", 2);
        in_game.add(two_of_clubs);
        c.chooseCard(in_round, in_game);
        System.out.println("Chose 2 of clubs -> " + two_of_clubs + " Player -> " + c);
        Card ten_of_spades = new Card("10", "spades", 10);
        in_round.add(ten_of_spades);
        System.out.println("Cards played in round -> " + in_round);
        System.out.println("RANDOMLY chosen spade -> " + c.chooseCard(in_round, in_game) + " Player -> " + c);
        Card nine_of_clubs = new Card("9", "clubs", 9);
        in_round.add(nine_of_clubs);
        System.out.println("heart chosen -> " + c.chooseCard(in_round, in_game) + " Player -> " + c);
        in_round.clear();
        System.out.println("Cards played in round -> " + in_round);
        in_round.add(new Card("3", "diamonds", 3));
        System.out.println("RANDOMLY chosen card -> " + c.chooseCard(in_round, in_game) + " Player -> " + c);

    }
}