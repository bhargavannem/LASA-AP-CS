/*
    Authors:
        B. Annem
        B. Woytek
*/
public class TestPlayer{
    public static void main(String[] args) {
    Player kara_jones = new Player("Kara Jones", 0);
    System.out.println("Created Player -> " + kara_jones.toString());
    kara_jones.updateScore(6);
    System.out.println("After scoring 6 points -> " + kara_jones.toString());
    Player bob_smith = new Player("Bob Smith", 27);
    System.out.println("Created Player -> " + bob_smith.toString());
    bob_smith.updateScore(65);
    System.out.println("After scoring 65 points -> " + bob_smith.toString());
}
}