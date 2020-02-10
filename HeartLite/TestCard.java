/*
    Authors:
        B. Annem
        B. Woytek
*/
public class TestCard{
   
   public static void main(String[] args){
      Card clubs_3 = new Card("3", "clubs", 3);
      Card new_clubs_3 = new Card("3", "clubs", 3); 
      Card diamonds_3 = new Card("3", "diamonds", 3);
      Card hearts_ace = new Card("A", "hearts", 14);
      Card spades_7 = new Card("7", "spades", 7);
      Card spades_6 = new Card("6", "spades", 6);
      System.out.println(clubs_3 + ".equals(" + new_clubs_3 + ") is " + clubs_3.equals(new_clubs_3));
      System.out.println(clubs_3 + ".equals(" + diamonds_3 + ") is " + clubs_3.equals(diamonds_3));
      System.out.println(clubs_3 + ".compareTo(" + new_clubs_3 + ") is " + clubs_3.compareTo(new_clubs_3));
      System.out.println(clubs_3 + ".compareTo(" + diamonds_3 + ") is " + clubs_3.compareTo(diamonds_3));
      System.out.println(diamonds_3 + ".compareTo(" + clubs_3 + ") is " + diamonds_3.compareTo(clubs_3));
      System.out.println(hearts_ace + ".compareTo(" + spades_7 + ") is " + diamonds_3.compareTo(spades_7));
      System.out.println(spades_7 + ".compareTo(" + hearts_ace + ") is " + spades_7.compareTo(hearts_ace));
      System.out.println(spades_7 + ".compareTo(" + spades_6 + ") is " + spades_7.compareTo(spades_6));
   }
}