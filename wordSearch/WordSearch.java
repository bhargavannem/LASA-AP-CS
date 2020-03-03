<<<<<<< HEAD:wordSearch/WordSearch.java
import java.util.Arrays;

public class WordSearch {
    /**
     * 2D array instance variable You CANNOT add any additional instance variables
     */
    String[][] mat;

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
    public boolean inGrid(String s) {
        String val = "";
        for (int x = 0; x < mat.length; x++) {
          for (int y = 0; y < mat[x].length; y++) {
                val += mat[x][y];
            }
        }
        String temp[][] = new String[mat.length][mat[0].length];
        temp = rotate(temp);
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                val += temp[i][j];
            }
        }
        String rev = reverse(s);
        return (val.indexOf(s) >= 0 || val.indexOf(rev) >= 0);

    }

    public String reverse(String str) {
        int len = str.length();
        String rev = "";
        for (int i = len - 1; i != 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    public String[][] rotate(String mat[][]) 
    { 
        String[][] rot = new String[mat.length][mat[0].length];
        for (int i = 0; i < mat[0].length; ++i) {
            for (int j = 0; j < mat.length; ++j) {

                rot[i][j] = mat[j][mat[0].length - i - 1];
            }
        }
        return rot;
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
=======
import java.util.Arrays;

public class WordSearch {
    /**
     * 2D array instance variable
     * You CANNOT add any additional instance variables
     */
    String[][] mat;

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
    public boolean inGrid(String s) {
        String val = "";
        for (int x = 0; x < mat.length; x++) {
            for (int y = 0; y < mat[x].length; y++) {
                val += mat[x][y];
            }
        }
        String temp = "";
        for(int i = 0; i < mat.length; i++){
            temp = Arrays.toString(mat[i]);
            val += temp;
        }
        String rev = reverse(s);
        return(val.indexOf(s) >= 0 || val.indexOf(rev) >= 0);

    }

    public String reverse(String str) {
        int len = str.length();
        String rev = "";
        for (int i = len - 1; i != 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }


        /** toString method
         * @return String containing all elements in the 2D array*/
        public String toString()
        {
            return "";
        }
    }
>>>>>>> 215e92c77c3b064abea00bdfaf7b3c54ea749560:wordSearch/src/WordSearch.java
