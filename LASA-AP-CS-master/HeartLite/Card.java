/*
    Authors:
        B. Annem
        B. Woytek
*/
public class Card implements Comparable<Object>{
   private String name;
   private String suit;
   private int value;

   // Constructors
   public Card() {
      name = "default";
      suit = "default";
      value = 0;
   }

   public Card(String n, String s, int v) {
      name = n;
      suit = s;
      value = v;
   }

   // Setters and Getters
   public void setName(String n) {
      name = n;
   }

   public void setSuit(String s) {
      suit = s;
   }

   public void setValue(int val) {
      value = val;
   }

   public String getName() {
      return name;
   }

   public String getSuit() {
      return suit;
   }

   public int getValue() {
      return value;
   }

   @Override
   public boolean equals(Object obj) {
      Card o = (Card) obj;
      return (name.equals(o.getName()) && suit.equals(o.getSuit()) && value == o.getValue());
   }

   public int compareTo(Object obj) {
      /*
       * String[] ls = new String {"cA" ,"cK" ,"cQ" ,"cJ" ,"c10" ,"c9" ,"c8" ,"c7"
       * ,"c6" ,"c5" ,"c4" ,"c3" ,"c2" , "sA" ,"sK" ,"sQ" ,"sJ" ,"s10" ,"s9" ,"s8"
       * ,"s7" ,"s6" ,"s5" ,"s4" ,"s3" ,"s2" , "hA" ,"hK" ,"hQ" ,"hJ" ,"h10" ,"h9"
       * ,"h8" ,"h7" ,"h6" ,"h5" ,"h4" ,"h3" ,"h2" , "dA" ,"dK" ,"dQ" ,"dJ" ,"d10"
       * ,"d9" ,"d8" ,"d7" ,"d6" ,"d5" ,"d4" ,"d3" , "d2"};
       */
      Card n = (Card) obj;
      String card_suit = n.getSuit();
      int card_val = n.getValue();
      int result = 0;
      int suit_result = 0;
      String[] listChar = { "clubs", "spades", "hearts", "diamonds" };
      if (card_val == value) {
         result = 0;
      } else if (card_val < value) {
         result = 1;
      } else {
         result = -1;
      }

      for (String s : listChar) {
         if (s.equals(suit) && s.equals(card_suit)) {
            suit_result = 0;
         } else if (s.equals(suit) && !s.equals(card_suit)) {
            suit_result = -1;
         } else if (!s.equals(suit) && s.equals(card_suit)) {
            suit_result = 1;
         }
      }
      if (suit_result == 0) {
         return result;
      } else {
         return suit_result;
      }
   }

   @Override
   public String toString() {
      String first = "" + suit.charAt(0);
      String str = "" + first + name + "(" + value + ")";
      return str;
   }

}