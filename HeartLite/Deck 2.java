
/*
    Authors:
        B. Annem
        B. Woytek
    Dependencies:
        Card.java
*/
import java.lang.Math;
import java.util.*;

public class Deck {
    private ArrayList<Card> dk;
    public static final String[] NAMES = { "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A" };
    public static final String[] SUITS = { "clubs", "spades", "hearts", "diamonds" };
    public static final int[] VALUES = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

    // default constructor
    public Deck() {
        dk = new ArrayList<Card>(52);
        initializeDeck();
    }

    public void initializeDeck() {
        int name_counter = 0;
        for (String str : SUITS) {
            for (String s : NAMES) {
                String first_letter = "" + str.charAt(0);
                Card temp = new Card(s, first_letter, VALUES[name_counter]);
                dk.add(temp);
                name_counter++;
            }
            name_counter = 0;
        }

    }

    public Card getCard(int index) {
        return dk.get(index);
    }

    public Card dealTopCard() {
        return dk.remove(0);
    }

    public void shuffle() {
        int counter = 0;
        while (counter < 20) {
            int card_num = (int) (Math.random() * 9 + 2);
            int card_loc = 0;
            int random_loc;
            for (int i = 0; i < card_num; i++) {
                random_loc = (int) (Math.random() * dk.size());
                Card c = getCard(card_loc);
                dk.remove(i);
                dk.add(random_loc, c);
                card_loc++;
            }
            counter++;
        }
    }

    public void shuffle2(){
        Collections.shuffle(dk);
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < dk.size(); i++) {
            temp += "" + getCard(i).toString();
        }
        return temp;
    }
}