public class ExamScore

{

private String studentId;

private double score;

public ExamScore(String sid, double s)

{

studentId = sid;

score = s;

}

public double getScore()

{

return score;

}

public void bonus(int b)

{

score += score * b/100.0;

}

    public void printSum(int x, double y)

    {

        System.out.println(x + y);

    }

    public void printProduct(double x, int y)

    {

        System.out.println(x * y);

    }
public static void main(String args[]){
        int num1 = 5;

        double num2 = 10.0;

        printSum(num1, num2);

        printProduct(num1, num2);
}
}