
/*
    Authors:
        B. Annem
        B. Woytek
*/
import java.util.ArrayList;

public class TestCardGame {
    public static void main(String[] args) {
        ArrayList<CardPlayer> players = new ArrayList<CardPlayer>();
        players.add(new CardPlayer("Player0", new ArrayList<Card>(), 0));
        players.add(new CardPlayer("Player1", new ArrayList<Card>(), 0));
        players.add(new CardPlayer("Player2", new ArrayList<Card>(), 0));
        players.add(new CardPlayer("Player3", new ArrayList<Card>(), 0));
        System.out.println(">>> Printed in Constructor");
        String[] names = new String[players.size()];
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Player " + players.get(i).getName() + " is a CardPlayer");
            names[i] = players.get(i).getName();
        }
        System.out.println(">>> Printing game in TestCardGame");
        CardGame game = new CardGame("Hearts", players.size(), names, 0);
        System.out.println(game);
        for(int p = 0; p < 4; p++){
            for (int i = 0; i < players.size(); i++) {
                Deck d = new Deck();
                game.setDeck(d);
                game.deal(i);
            }
        game.playGame();
    }
    game.calculateScore();
    System.out.println();

    for (int p = 0; p < 2000; p++) {
        for (int i = 0; i < players.size(); i++) {
            Deck d = new Deck();
            game.setDeck(d);
            game.deal(i);
        }
        game.playGame();
    }
    game.calculateScore();
}
}