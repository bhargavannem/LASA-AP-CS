import java.util.Arrays;

public class WordSearch {
    /**
     * 2D array instance variable
     * You CANNOT add any additional instance variables
     */
    public String mat[][];

    /**
     * constructor used to set the number of rows and columns in the 2D array
     *
     * @param row
     * @param col
     */
    public WordSearch(int row, int col) {
        mat = new String[row][col];
    }

    /**
     * method to set an element in the 2D array
     *
     * @param s   which is the value to store in the 2D array
     * @param row the row to use
     * @param col the column to use
     */
    public void setSpot(String s, int row, int col) {
        mat[row][col] = s;
    }

    /**
     * methods to check for the word in the 2D array
     *
     * @param word the word to search for
     * @return return true or false
     */
    public boolean inGrid(String s)
    {
        //Create A String
        String total = "";
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                total += mat[i][j];
            }
        }
        String temp = reverse(s);
        return(total.contains(temp)||total.contains(s));
    }

    public String reverse(String str){
        String rev = "";
        for(int i = str.length() - 1; i <= 0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }
    /**
     * toString method
     *
     * @return String containing all elements in the 2D array
     */
    public String toString() {
        return "";
    }
}