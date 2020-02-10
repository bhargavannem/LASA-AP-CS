import java.util.*;
import java.io.*;

public class card_sort implements Comparable<Object> {

    private String name;
    private int attack;
    private int defense;

    public card_sort(){
        name = "";
        attack = 0;
        defense = 0;
    }

    public card_sort(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName(){
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
    public int compareTo(Object comparison){
        card_sort theCard = (card_sort)comparison;
        if(theCard.getAttack()+theCard.getDefense()!=this.getAttack()+this.getDefense()){
            if(theCard.getAttack()+theCard.getDefense()>this.getAttack()+this.getDefense()){
                return 1;
            }else{
                return -1;
            }
        }
        else if(theCard.getAttack() > getAttack()){
            return 1;
        }
        else if (theCard.getAttack() < getAttack()) {
            return -1;
        }
        else if (theCard.getAttack() == getAttack() && theCard.getDefense() != getDefense()) {
            if(theCard.getDefense() < getDefense()){
                return -1;
            }
            else if (theCard.getDefense() > getDefense()) {
                return 1;
            }
        }else if (theCard.getAttack() == getAttack() && theCard.getDefense() == getDefense() && !(theCard.getName().equals(this.getName()))){
            if(this.getName().compareTo(theCard.getName())>0){
                return 1;
            }else{
                return -1;
            }
        }
        else{
            return 0;
        }

        return 0;
    }
    public String toString(){
        String res = "";
        res += (this.getAttack()+this.getDefense())+" ("+this.getName()+"/"+this.getAttack()+"/"+this.getDefense()+")";
        return res;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file;
        file = new Scanner(new File("card_sort.dat"));
        ArrayList<card_sort> cards = new ArrayList<card_sort>();

        while(file.hasNextLine()){
            String in = file.nextLine();
            String[] arr = in.split("/");

            String theName = arr[0];
            int theAttack = Integer.parseInt(arr[1]);
            int theDefense = Integer.parseInt(arr[2]);

            card_sort obj = new card_sort(theName, theAttack, theDefense);
            cards.add(obj);
            
        }
        Collections.sort(cards);
        for(card_sort cs :cards){
            System.out.println(cs);
        }
    }
}