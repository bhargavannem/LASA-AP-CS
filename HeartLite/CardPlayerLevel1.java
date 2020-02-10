import java.util.ArrayList;
import java.lang.Math;

public class CardPlayerLevel1 extends CardPlayer {

    public CardPlayerLevel1(String name, ArrayList<Card> hand, int score) {
        super(name, hand, score);
        // TODO Auto-generated constructor stub
    }

    public Card chooseCard(ArrayList<Card> round, ArrayList<Card> game) {
        // If player is not the 1st player in the round
        if (game.size() > 0) {
            String suit_needed = round.get(0).getSuit();
            boolean has_suit = false;
            boolean has_queen_of_spades = false;
            int queen_of_spades_location = 0;
            boolean has_heart = false;
            for (int i = 0; i < super.getHand().size(); i++) {
                if (super.getHand().get(i).getSuit().equals(suit_needed)) {
                    has_suit = true;
                }
                if (super.getHand().get(i).getSuit().equals("spades") && super.getHand().get(i).getName().equals("Q")) {
                    has_queen_of_spades = true;
                    queen_of_spades_location = i;
                }
                if (super.getHand().get(i).getSuit().equals("hearts")) {
                    has_heart = true;
                }
            }
            if (has_suit) {
                while (true) {
                    int rand = (int) (Math.random() * super.getHand().size());
                    if (super.getHand().get(rand).getSuit().equals(suit_needed)) {
                        return super.playCard(rand);
                    }
                }
            } else if (has_queen_of_spades) {
                return super.playCard(queen_of_spades_location);
            } else if (has_heart) {
                int highest_loc = 0;
                int highest_val = 0;
                for (int i = 0; i < super.getHand().size(); i++) {
                    if (super.getHand().get(i).getValue() > highest_val
                            && super.getHand().get(i).getSuit().equals("hearts")) {
                        highest_val = super.getHand().get(i).getValue();
                        highest_loc = i;
                    }
                }
                return super.playCard(highest_loc);
            } else {
                int highest_val = 0;
                int highest_loc = 0;
                boolean contains_high_val = false;
                for (Card c : round) {
                    if (c.getSuit().equals("hearts") || (c.equals(new Card("Q", "spades", 12))))
                        ;
                }
                for (int i = 0; i < super.getHand().size(); i++) {
                    if (contains_high_val) {

                        if (super.getHand().get(i).getValue() < highest_val) {
                            highest_val = super.getHand().get(i).getValue();
                            highest_loc = i;
                        }
                    } else {
                        if (super.getHand().get(i).getValue() > highest_val) {
                            highest_val = super.getHand().get(i).getValue();
                            highest_loc = i;
                        }
                    }

                }
                return super.playCard(highest_loc);
            }
        } else {
            Card two_of_clubs = new Card("2", "clubs", 2);
            int two_of_clubs_location = super.getHand().indexOf(two_of_clubs);
            return super.playCard(two_of_clubs_location);

        }
    }
}