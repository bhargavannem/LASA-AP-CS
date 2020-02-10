public class InOrder {
    private int numOne;
    private int numTwo;
    private int numThree;

    public InOrder() {
        numOne = 0;
        numTwo = 0;
        numThree = 0;

    }

    public InOrder(int n1, int n2, int n3) {
        numOne = n1;
        numTwo = n2;
        numThree = n3;
    }

    public void setNumOne(int n1) {
        // complete modifier method for numOne
        numOne = n1;

    }

    // add modifier method for numTwo
    public void setNumTwo(int n2) {
        numTwo = n2;
    }

    // add modifier method for numThree

    public void setNumThree(int n3) {
        numThree = n3;
    }

    public int getNumOne() {
        // complete accessor method for numOne
        return numOne;
    }

    // add accessor method for numTwo
    public int getNumTwo() {
        return numTwo;
    }

    // add accessor method for numThree
    public int getNumThree() {
        return numThree;
    }

    // create method to determine if the numbers are in order
    public static bool inOrder(int numOne, int numTwo, int numThree) {

        if (numOne <= numTwo <= numThree) {
            return true;
        } else {
            return false;
        }
    }

    public String toString()
	{
		return "" + numOne + "<=" + numTwo + "<=" + numThree + "is" +  InOrder.inOrder(numOne,numTwo,numThree);
	}
}