import java.io.*;
import java.util.*;

public class Encryption {
    public static void main(String[] args) {
        Scanner in;
        try {
            in = new Scanner(new File("encryption.dat"));
            int n = in.nextInt();
            in.nextLine();
            for (int i = 0; i < n; i++) {
                String str = second_and_fourth(first_and_third(first_enc(in.nextLine())));
                System.out.println(str);
            }
        }

        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }

    public static String first_enc(String str) {
        String cur = "";
        int num = 0;
        String fin = "";
        for (int j = 0; j < str.length(); j++) {
            cur = "" + str.charAt(j);
            num = Integer.parseInt(cur);
            num = (num + 7) % 10;
            fin += "" + num;
        }
        return fin;
    }

    public static String second_and_fourth(String str) {
        String sol = str;
        for (int i = 0; i < (str.length() / 4); i++) {
            int front_loc = 1 + (i * 4);
            int back_loc = 3 + (i * 4);
            char front = sol.charAt(front_loc);
            char back = sol.charAt(back_loc);
            char temp = front;
            front = back;
            back = temp;
            sol = sol.substring(0, front_loc) + front + sol.substring(front_loc + 1, back_loc) + back
                    + sol.substring(back_loc + 1);

        }
        return sol;
    }

    public static String first_and_third(String str) {
        String sol = str;
        for (int i = 0; i < (str.length() / 4); i++) {
            int front_loc = 0 + (i * 4);
            int back_loc = 2 + (i * 4);
            char front = sol.charAt(front_loc);
            char back = sol.charAt(back_loc);
            char temp = front;
            front = back;
            back = temp;
            sol = sol.substring(0, front_loc) + front + sol.substring(front_loc + 1, back_loc) + back
                    + sol.substring(back_loc + 1);

        }
        return sol;
    }
}

/*
 * 3 1234567890123456 4536278290123476 7685438920456431
 */
