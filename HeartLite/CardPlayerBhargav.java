
/*
/    Authors:
/        B. Annem
    Dependencies:
        Card.java
        Deck.java
        Player.java
        CardGame.java
        CardPlayer.java
*/
import java.util.ArrayList;
import java.lang.Math;

public class CardPlayerBhargav extends CardPlayer {

    public CardPlayerBhargav(String name, ArrayList<Card> hand, int score) {
        super(name, hand, score);
        // TODO Auto-generated constructor stub
    }

    public Card chooseCard(ArrayList<Card> round, ArrayList<Card> game) {
        // If player is not the 1st player in the round
        if (game.size() > 0) {
            if(round.size() == 0){
                return startingRound(round, game);
            }
            else{
            String suit_needed = round.get(0).getSuit();
            boolean has_suit = false;
            boolean has_queen_of_spades = false;
            int queen_of_spades_location = 0;
            boolean has_heart = false;
            int score_for_round = score4Game(round);
            int index_of_lowest_suit = 0;
            int value_of_lowest_suit = 17;
            int index_of_highest_suit = 0;
            int value_of_highest_suit = -1;
            for (int i = 0; i < super.getHand().size(); i++) {
                if (super.getHand().get(i).getSuit().equals(suit_needed)) {
                    has_suit = true;
                    if(super.getHand().get(i).getValue() > value_of_highest_suit){
                        value_of_highest_suit = super.getHand().get(i).getValue();
                        index_of_highest_suit = i;
                    }
                    else if(super.getHand().get(i).getValue() < value_of_lowest_suit){
                        value_of_lowest_suit = super.getHand().get(i).getValue();
                        index_of_lowest_suit = i;
                    }
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
                if(score_for_round > 3 && index_of_lowest_suit < 15){
                    return super.playCard(index_of_lowest_suit);
                }
                else if(index_of_highest_suit > -1){
                    return super.playCard(index_of_highest_suit);
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
                return super.playCard((int) (Math.random() * super.getHand().size()));
            }
        } 
    }
            Card two_of_clubs = new Card("2", "clubs", 2);
            int two_of_clubs_location = super.getHand().indexOf(two_of_clubs);
            return super.playCard(two_of_clubs_location);
    }
    
    

    public Card startingRound(ArrayList<Card> round, ArrayList<Card> game){
        int highest_val = 0;
        int index_of = 0;
        int lowest_val = 15;
        int index_of_low = 0;
        int lowest_heart_val = 15;
        int lowest_heart_index = 0;
        boolean early_in_game = game.size() < 20;
        // Search for 2 or 3 of Hearts
        // Search for highest cards that are not hearts to play
        if(early_in_game){
            for (int p = 0; p < super.getHand().size(); p++) {
                if (super.getHand().get(p).getValue() > highest_val && !super.getHand().get(p).getClass().equals("h")) {
                    highest_val = super.getHand().get(p).getValue();
                    index_of = p;

                } else if (super.getHand().get(p).getClass().equals("h") && super.getHand().get(p).getValue() < 15) {
                    if (super.getHand().get(p).getValue() < 4) {
                        lowest_heart_index = p;
                        lowest_heart_val = super.getHand().get(p).getValue();
                    }
                }
            }
    }
    else{
        for (int p = 0; p < super.getHand().size(); p++) {
            if (super.getHand().get(p).getValue() < lowest_val && !super.getHand().get(p).getClass().equals("h")) {
                lowest_val = super.getHand().get(p).getValue();
                index_of_low = p;

            } else if (super.getHand().get(p).getClass().equals("h") && super.getHand().get(p).getValue() < 15) {
                if (super.getHand().get(p).getValue() < 4) {
                    lowest_heart_index = p;
                    lowest_heart_val = super.getHand().get(p).getValue();
                }
            }
        }
    }
        if(highest_val > 11){
            return super.getHand().get(index_of);
        }
        else if (lowest_val < 7){
            return super.getHand().get(index_of_low);
        }
        else if(lowest_heart_index >= 0){
            return super.getHand().get(lowest_heart_index);
        }
        else {
            while(true){
            int rand_loc = (int)(Math.random()*super.getHand().size());
            if(!super.getHand().get(rand_loc).getClass().equals("h") && !super.getHand().get(rand_loc).equals(new Card("Q", "spades", 12))){
             return super.getHand().get(rand_loc);
            }
        }
        }
        

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
}