import java.util.ArrayList;
import java.util.Iterator;

public class CardPlayerMueller extends CardPlayer {
   public CardPlayerMueller(String name, int score, ArrayList<Card> hand) {
      super(name, hand, score);
   }

   public Card maxValueCard(ArrayList<Card> setOfCards) {
      Card maxCard = new Card();
      Iterator var3 = setOfCards.iterator();

      while(var3.hasNext()) {
         Card card = (Card)var3.next();
         if (card.compareTo(maxCard) > 0) {
            maxCard = card;
         }
      }

      return maxCard;
   }

   public Card chooseCard(ArrayList<Card> cardsPlayedThisRound, ArrayList<Card> cardsPlayedThisGame) {
      new Card();
      Card twoOfClubs = new Card("2", "clubs", 2);
      Card queenOfSpades = new Card("Q", "spades", 12);
      Card kingOfSpades = new Card("K", "spades", 13);
      Card aceOfSpades = new Card("A", "spades", 14);
      ArrayList<Card> heartsInMyHand = new ArrayList();
      ArrayList<Card> cardsInMyHandThatMatchSuitThatWasLed = new ArrayList();
      ArrayList<Card> otherSuits = new ArrayList();
      Card card;
      if (cardsPlayedThisGame.size() == 0 && this.getHand().contains(twoOfClubs)) {
         int twoOfClubsIdx = this.getHand().indexOf(twoOfClubs);
         card = this.playCard(twoOfClubsIdx);
      } else {
         int randCard;
         if (cardsPlayedThisRound.size() == 0) {
            randCard = (int)(Math.random() * (double)this.getHand().size());
            card = this.playCard(randCard);
         } else {
            Card cardLed = (Card)cardsPlayedThisRound.get(0);
            Iterator var14 = cardsPlayedThisRound.iterator();

            Card playerCard;
            while(var14.hasNext()) {
               playerCard = (Card)var14.next();
               if (playerCard.getSuit().equals(cardLed.getSuit()) && playerCard.compareTo(cardLed) == 1) {
                  ;
               }
            }

            var14 = this.getHand().iterator();

            while(var14.hasNext()) {
               playerCard = (Card)var14.next();
               if (playerCard.getSuit().equals("hearts")) {
                  heartsInMyHand.add(playerCard);
               }

               if (playerCard.getSuit().equals(cardLed.getSuit())) {
                  cardsInMyHandThatMatchSuitThatWasLed.add(playerCard);
               } else {
                  otherSuits.add(playerCard);
               }
            }

            if (cardsInMyHandThatMatchSuitThatWasLed.size() == 0) {
               if (this.getHand().indexOf(queenOfSpades) != -1) {
                  card = queenOfSpades;
               } else if (this.getHand().indexOf(aceOfSpades) != -1) {
                  card = aceOfSpades;
               } else if (this.getHand().indexOf(kingOfSpades) != -1) {
                  card = kingOfSpades;
               } else if (heartsInMyHand.size() != 0) {
                  card = this.maxValueCard(heartsInMyHand);
               } else {
                  card = this.maxValueCard(otherSuits);
               }
            } else if (cardsInMyHandThatMatchSuitThatWasLed.indexOf(queenOfSpades) == -1 || cardsPlayedThisRound.indexOf(kingOfSpades) == -1 && cardsPlayedThisRound.indexOf(aceOfSpades) == -1) {
               randCard = (int)(Math.random() * (double)cardsInMyHandThatMatchSuitThatWasLed.size());
               card = (Card)cardsInMyHandThatMatchSuitThatWasLed.get(randCard);
            } else {
               card = queenOfSpades;
            }

            card = this.playCard(this.getHand().indexOf(card));
         }
      }

      return card;
   }
}