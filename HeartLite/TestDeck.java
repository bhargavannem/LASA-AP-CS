
/*
    Authors:
        B. Annem
        B. Woytek
*/
import java.lang.Math;

public class TestDeck {
    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println("new deck " + d);
        d.shuffle();
        System.out.println("shuffled " + d);
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print("13 cards ");
            for (int j = 0; j < 13; j++) {
                System.out.print(d.dealTopCard());
            }
            System.out.println();
            System.out.println("remaining " + d);
        }
        Deck new_deck = new Deck();
        int rand_loc = (int) (Math.random() * 52);
        Card c = new_deck.getCard(rand_loc);
        int counter = 0;
        for (int i = 0; i < 52000; i++) {
            int loc = (int) (Math.random() * 52);
            if (new_deck.getCard(loc).equals(c)) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("random card from deck " + c);
        System.out.println("Found " + c + " at location " + rand_loc + " in the deck " + counter + " times.");
    }
}