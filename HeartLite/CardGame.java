
/*
    Authors:
        B. Annem
        B. Woytek
    Dependencies:
        Card.java
        Deck.java
        Player.java   
        CardPlayer.java 
*/
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    private  Deck deckOfCards;
    private String nameOfGame;
    private  ArrayList<CardPlayer> players;
    private  int numberOfPlayers;
    private int currentPlayer;
    private final static Card TWO_OF_CLUBS = new Card("2", "c", 2);
    private final String first_player;

    public CardGame( String nameOfGame,  int numberOfPlayers,  String[] nameOfPlayers,  int currentPlayer) {
        players = new ArrayList<>();
        this.nameOfGame = nameOfGame;
        this.numberOfPlayers = numberOfPlayers;
        this.currentPlayer = currentPlayer;
        for ( String str : nameOfPlayers) {
            players.add(new CardPlayer(str, new ArrayList<>(), 0));
        }
        deckOfCards = new Deck();
        first_player = players.get(0).getName();
    }

    public void deal( int player) {
        deckOfCards.shuffle();
        for (int i = 0; i < 13; i++) {
            players.get(player).addCard(deckOfCards.dealTopCard());
        }
    }
    
    public void checkRound(ArrayList<Card> round, int startingPlayer) {
        System.out.print(startingPlayer + " ");
        // Establish what the suit to match is
        String roundSuit = round.get(0).getSuit();
        // For all other players
        for (int i = 1; i < round.size(); i++) {
            // If their card doesn't match suit, check to see if they're incorrect
            if (!round.get(i).getSuit().equals(roundSuit)) {
                CardPlayer player = players.get((i + startingPlayer) % round.size());
                // Go through their cards
                for (int j = 0; j < player.getHand().size(); j++) {
                    Card c = player.getHand().get(j);
                    // If incorrect, print out offending card and that they're incorrect
                    if (c.getSuit().equals(roundSuit)) {
                        System.out.println("*** INCORRECT ***" + player.getName() + " playing " + round.get(i) + " in "
                                + round + " while having " + player.getHand());
                        break;
                    }
                }
            }
        }
    }

public int takesRound( int playerThatLed,  ArrayList<Card> cardsPlayedThisRound) {
    // returns the index of the player that took the 4 cards that were played that
    // round
    int max_score = 0;
    int location = 0;
    for(int i = 0; i < cardsPlayedThisRound.size(); i++){
        if(cardsPlayedThisRound.get(playerThatLed).getClass().equals(cardsPlayedThisRound.get(i).getClass()) && cardsPlayedThisRound.get(i).getValue() > max_score){
            max_score = cardsPlayedThisRound.get(i).getValue();
            location = i;
        }
    }
    return location;
}
public int score4Game( ArrayList<Card> cards) {
    //returns the score for the player's takenCards for all 13 rounds of the game.
    int gameScore = 0;
    if(cards != null){
    for(int c = 0; c < cards.size(); c++){
        if(cards.get(c).getSuit().equals("h")){
            gameScore++;
        }
        if(cards.get(c).equals(new Card("Q", "s", 12))){
            gameScore += 12;
        }
    }
}
    return gameScore;
}
public void setCurrentPlayerToStartingPlayer(){
//sets currentPlayer to the player with the 2♣ at the beginning of the game.
    for(int p = 0; p < numberOfPlayers; p++){
       ArrayList<Card> hand = players.get(p).getHand();
        /*if(hand.contains(TWO_OF_CLUBS)){
            currentPlayer = p;
        }*/
        for(int h = 0; h < hand.size(); h++){
            if(hand.get(h).equals(TWO_OF_CLUBS)){
                currentPlayer = p;
            }
        }
    }
    Collections.rotate(players, -currentPlayer);
}

public String getFirstPlayerName(){
    return players.get(0).getName();
}

public void playGame(){
    setCurrentPlayerToStartingPlayer();
    ArrayList<Card> round = new ArrayList<Card>();
    ArrayList<Card> game = new ArrayList<Card>();
    ArrayList<Card> temp = new ArrayList<Card>();
    String first_player_name = first_player;
    int index_of_player_taking_cards = 0;
    for(int round_count = 0; round_count < 13; round_count++){
        for(int current_round = 0; current_round < players.size(); current_round++){
            round.add(players.get(current_round).chooseCard(round, game));
        }
        index_of_player_taking_cards = takesRound(0, round);
        temp = players.get(index_of_player_taking_cards).getTakenCards();
        if(temp==null){
            temp = round;
        }
        else{   
            temp.addAll(round);
        }

        checkRound(round, 0);
        players.get(index_of_player_taking_cards).setTakenCards(temp);
        Collections.rotate(players, -index_of_player_taking_cards);
        game.addAll(round);
        round.clear();
       
    }
    // after all 13 rounds, calculate each player's points in their takenCards and
    // update each player's overall score.
    boolean condition = false;
    while(!condition){
        if(players.get(0).getName().equals(first_player_name)){
            condition = true;
        }
        Collections.rotate(players, -1);
    }
    int score = 0;
    System.out.print(">>> playGame() ");
    for(int p = 0; p < numberOfPlayers; p++){
        score = score4Game(players.get(p).getTakenCards());
        players.get(p).setScore(score);
            System.out.print(players.get(p).getName() + "(" + score + ")    ");
}
System.out.println();

}

public void calculateScore(){
    while(players.get(0).getName() != first_player){
        Collections.rotate(players, 1);
    }
    int total = 0;
    for (int p = 0; p < numberOfPlayers; p++) {
        total += players.get(p).getScore();
    }

    String str = "";
    int score = 0;
    System.out.println(">>> Printing Total Score and Player % in TestCardGame");
    System.out.println("Total Score = " + total);
    for (int p = 0; p < numberOfPlayers; p++) {
        score = players.get(p).getScore();
        double percentage = (double) (score) / total;
        percentage = toHundredths(percentage);
        str = "" + players.get(p).getName() + " " + percentage + "%";
        System.out.println(str);
    }
    System.out.println();
    for (int j = 0; j < numberOfPlayers; j++) {
        players.get(j).getTakenCards().clear();
        players.get(j).getHand().clear();
        players.get(j).setScore(0);
    }
}

    public String toString() {
        String str = "";
        str += "Printed in Constructor\n";
        for(int p = 0; p < numberOfPlayers; p++){
            str += "Player " + players.get(p).getName() + " is a CardPlayer\n";
        }
        str += "Printing in TestCardGame\n";
        str = "***" + nameOfGame + "***" + "\n";
        for (int i = 0; i < numberOfPlayers; i++) {
            str += "" + players.get(i).getName() + " " + players.get(i).getScore() + " " + players.get(i).getHand()
                    + "\n";
        }
        Deck d = new Deck();
        str += "deck -> \n" + d;
        return str;
    }
    public double toHundredths(double d){
        int temp = (int) Math.round(d * 10000);
        double x = (double) (temp);
        return x/100;
    }
    public void setDeck(Deck deck){
        this.deckOfCards = deck;
    }
}