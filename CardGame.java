  
import java.util.ArrayList;
import java.util.Collections;
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
        for(int i = 0; i < 13; i++){
            players.get(player).addCard(deckOfCards.dealTopCard());
        }
    }

    public void playGame(){
        ArrayList<Card> in_round = new ArrayList<Card>();
        ArrayList<Card> in_game = new ArrayList<Card>();
        int highest_value = 0;
        int loc_of_highest_value = 0;
        ArrayList<Card> temp;
        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getHand().contains(new Card("2", "clubs", 2)))){
                currentPlayer = i;
            }
        }
        for(int j = 0; j < 13; j++){
            Collections.rotate(player, -currentPlayer)
            for(int play = 0; play < players.size(); play++){
                Card current_card_played = players.get(play).chooseCard(in_round, in_game);
                if(current_card_played.getValue() > highest_value){
                    highest_value = current_card_played.getValue;
                    loc_of_highest_value = play;
                }
                in_round.add(current_card_played);
            }
            temp = players.get(loc_of_highest_value).getTakenCards();
            temp.addAll(in_round);
            players.get(loc_of_highest_value).setTakenCards(temp);
            in_game.addAll(in_round);
            in_round.clear();
        }
        int score;
        for(int p = 0; p < players.size(); p++){
            score = 0;
            for(int val = 0; val < players.get().getHand().size(); val++){
                if(players.get(p).getHand().get(val).getSuit().equals("hearts")){
                    score++;
                }
                else if(players.get(p).getHand().get(val).equals(new Card("12", "spades", 12))){
                    score+=13;
                }
            }
            players.get(p).super.setScore(score);
        }
    }
    
    public toString(){
        String str =  "***" + nameOfGame + "***" + "\n";
        for(int i = 0; i < players.size(); i++){
            Str += "" + players.get(i).super.getName() + " " + players.get(i).super.getScore() + " " + players.get(i).super.getHand()  
        }
    }
}