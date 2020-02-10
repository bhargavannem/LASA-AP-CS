/*
    Authors:
        B. Annem
        B. Woytek
*/
public class Player{
    private String name;
    private int score;
    public Player(){
        name = "";
        score = 0;
    }

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setScore(int score){
        this.score = score;
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    public void updateScore(int added_score){
        score += added_score;
    }

    public String toString(){
        return "" + name + " " + score;
    }
}