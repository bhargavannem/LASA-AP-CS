public class Student

{

    private int studentID;

    private int gradeLevel;

    private boolean honorRoll;

    public Student(int s, int g)

    {

        studentID = s;

        gradeLevel = g;

        honorRoll = false;

    }

    public Student(int s)

    {

        studentID = s;

        gradeLevel = 9;

        honorRoll = false;

    }
    public static void main(String[] args){
        Student one = new Student(328564, 11);
        Student two = new Student(238783);
        int id = 392349;
        int grade = 11;
        Student three = new Student(id, grade);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}