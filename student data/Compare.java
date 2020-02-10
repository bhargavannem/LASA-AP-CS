import java.util.*;
import java.io.*;

public class Compare {
    public static void main(String[] args) {
        Scanner in;
        try {
            in = new Scanner(new File("compare.dat"));
            String st = "9th Annual Indeed Computer Science UIL Invitational";
            while (in.hasNext()) {
                String sk = in.nextLine();
                int score = 0;
                for (int i = 0; i < sk.length(); i++) {
                    Character sk_letter = sk.charAt(i);
                    Character st_letter = st.charAt(i);
                    int diff = sk_letter - st_letter;
                    boolean differ = diff == 0 || diff == 32 || diff == -32;
                    boolean no_space = !(sk_letter.equals(' ') || st_letter.equals(' '));
                    if (differ && no_space) {
                        score++;
                    }
                }
                System.out.println(score);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}