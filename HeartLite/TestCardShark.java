
/*
    Authors:
        B. Annem
    
    Dependencies:
        Card.java
        Deck.java
        Player.java
        CardGame.java
        CardPlayer.java
        CardPlayerMueller.java
        CardPlayerBhargav.java
        CardPlayerLevel1.java
*/
import java.util.ArrayList;
public class TestCardShark{
    public static void main(String[] args) {
        ArrayList<CardPlayer> players = new ArrayList<CardPlayer>();
        players.add(new CardPlayerMueller("Mueller1", 0, new ArrayList<Card>()));
        players.add(new CardPlayerMueller("Mueller2", 0, new ArrayList<Card>()));
        players.add(new CardPlayer("Bhargav1", new ArrayList<Card>(), 0));
        players.add(new CardPlayer("Bhargav2", new ArrayList<Card>(), 0));
        System.out.println(">>> Printed in Constructor");
        String[] names = new String[players.size()];
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Player " + players.get(i).getName() + " is a CardPlayer");
            names[i] = players.get(i).getName();
        }
        System.out.println(">>> Printing game in TestCardGame");
        CardGame game = new CardGame("Hearts", players.size(), names, 0);
        System.out.println(game);

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
