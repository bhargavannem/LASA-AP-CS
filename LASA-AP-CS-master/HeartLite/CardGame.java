import java.util.ArrayList;

public class CardGame {
    private Deck deckOfCards;
    private String nameOfGame;
    private ArrayList<CardPlayer> players;
    private int numberOfPlayers;
    private int currentPlayer;
    
    public CardGame(String nameOfGame, int numberOfPlayers, String[] nameOfPlayers, int currentPlayer){
        this.nameOfGame = nameOfGame;
        this.numberOfPlayers = numberOfPlayers;
        this.currentPlayer = currentPlayer;
        for(String str: nameOfPlayers){
            players.add(new CardPlayer(str, new ArrayList<>(), 0));
        }
        deckOfCards = new Deck();
        deckOfCards.shuffle();
    }

    public ArrayList<Card> deal(int player){
        int counter = 0;
        while(counter < 13){
            player.add(deckOfCards.getCard(counter));
            counter++;
        }
    }
}