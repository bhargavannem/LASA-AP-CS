
/*
    Authors:
        B. Annem
        B. Woytek
*/
import java.util.*;

public class CardPlayer extends Player {
    private ArrayList<Card> hand;
    private ArrayList<Card> takenCards;

<<<<<<< HEAD
    public CardPlayer() {
        super();
        takenCards = new ArrayList<Card>();
        hand = new ArrayList<Card>();
    }

=======
>>>>>>> 215e92c77c3b064abea00bdfaf7b3c54ea749560
    public CardPlayer(String name, ArrayList<Card> hand, int score) {
        super(name, score);
        this.hand = hand;
    }

    public void setHand(ArrayList<Card> hand) {
        ArrayList<Card> n_hand = copy_al(hand);
        this.hand = n_hand;
    }

    public void setTakenCards(ArrayList<Card> takenCards) {
        ArrayList<Card> n_taken_cards = copy_al(takenCards);
        this.takenCards = n_taken_cards;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public ArrayList<Card> getTakenCards() {
        return takenCards;
    }

    public void addCard(Card c) {
        this.hand.add(c);
    }

    public Card playCard(int i) {
        return this.hand.remove(i);
    }

    public Card chooseCard(ArrayList<Card> round, ArrayList<Card> game) {
<<<<<<< HEAD
        Card two_clubs = new Card("2", "c", 2);
        if (hand.contains(two_clubs)) {
            return playCard(hand.indexOf(two_clubs));
        } else if(round.size()==0){
            return playCard(randomInt(this.hand.size()));
        }else {
            int rand_loc = randomInt(this.hand.size());
            for (int cards = 0; cards < hand.size()*100; cards++) {
=======
        Card two_clubs = new Card("2", "clubs", 2);
        if (hand.indexOf(two_clubs) > -1) {
            return playCard(hand.indexOf(two_clubs));
        } else if (round.size() == 1) {
            int rand_loc = randomInt(this.hand.size());
            boolean same_suit = false;
            while (!same_suit) {
>>>>>>> 215e92c77c3b064abea00bdfaf7b3c54ea749560
                if (hand.get(rand_loc).getSuit().equals(round.get(0).getSuit())) {
                    return playCard(rand_loc);
                }
                rand_loc = randomInt(this.hand.size());
            }
<<<<<<< HEAD
        
=======
            return playCard(rand_loc);
        } else {
>>>>>>> 215e92c77c3b064abea00bdfaf7b3c54ea749560
            boolean has_heart = false;
            for (int i = 0; i < this.hand.size(); i++) {
                Card c = hand.get(i);
                String hand_suit = c.getSuit();
                if (hand_suit.equals("hearts")) {
                    has_heart = true;
                }
            }
            boolean heart_solved = true;

            if (has_heart) {
                while (heart_solved) {
                    int rand = randomInt(this.hand.size());
                    Card rand_card = hand.get(randomInt(rand));
                    if (rand_card.getSuit().equals("hearts")) {
                        return hand.remove(rand - 1);
                    }
<<<<<<< HEAD
                } 
=======
                }
>>>>>>> 215e92c77c3b064abea00bdfaf7b3c54ea749560
            }

            int rand = randomInt(this.hand.size() - 1);
            return playCard(rand);
        }
    }

    // -----------------------------------------------------------------------------
    public ArrayList<Card> copy_al(ArrayList<Card> copy_me) {
        ArrayList<Card> temp = new ArrayList<Card>();
        for (Card cd : copy_me) {
            temp.add(cd);
        }
        return temp;
    }

    public int randomInt(int upper) {
        return (int) (Math.random() * (upper));
    }

    public int randomInt(int upper, int lower) {
        return (int) ((Math.random() + lower) * upper);
    }

    public String toString() {
        Collections.sort(this.hand);
        String str = "" + super.getName() + " (" + super.getScore() + ") " + this.hand;
        return str;
    }
}