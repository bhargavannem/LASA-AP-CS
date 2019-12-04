public class StudentID {
  public static final String NON = "non";
  public String origStudentFirstName = NON;
  public String origStudentLastName = NON;
  public int origStudentId = 0;   

//Default Constructor
 public StudentID(){
}

 
 public void setStudentFirstName(String origStudentFirstName){
   this.studentFirstName = origStudentFirstName;
   
 }
 
 public void setStudentLastName(String origStudentLastName){
   this.studentLastName = origStudentLastName;
 }
 
 public void setStudentId(int origStudentId){
   this.studentId = origStudentId;
 } 
 public String getStudentFirstName() {
   return studentFirstName;
 }
 
 public String getStudentLastName(){
   return studentLastName;
 }
 
 public int getStudentId(){
   return studentId;
 }

 public String getPassword(String studentLastName, int StudentId){
   String lastname = getStudentLastName();
   String student_id = getStudentId();
   int len = lastname.length();
   String password = "" + lastname.substring(0,1) +  student_id + lastname.substring(len-2, len);
   return password;
 }
 public String toString(){
   return " Name = " + setStudentFirstName + " " + setStudentLastName + " Student ID = " + setStudentID;
 }
  
}
  

/*
Create a class for student information with the following features

Part I
========================================================
1. class name    
        StudentID

2. instance variables 
        studentFirstName (a string)
        studentLastName (a string)
        studentId (an integer

3. default & initialization constructors
         First and Last should default to "non".  Student Id should default to zero.
4. accessor & modifier methods for all instance variables
5. method getPassword()
        returns student password consisting of the first character of last name followed by the student ID followed by the last character of the last name.

6. a toString() method that prints   Name = xx yy  Student ID = # 


Part II
========================================================
Write a class containing a main() method that 
instantiates a student object using the default constructor 
print the student object Name = xx yy  Student ID = #
changes the name of this student object and their id
          set first name to "Joe" and second name to "Bob", set student ID to 1234.
print the student object Name = xx yy  Student ID = #
instantiates a 2nd student object using the initialization constructor
          set first name to "Betty" and second name to "Sue", set student ID to 5678.
print the 2nd student object Name = xx yy  Student ID = #
For both student objects print the student name followed by the student's ID, followed by their password.   xx yy  ID = #  Password = zzzz

Output should match
========================================================
 
Name = non non Student ID = 0
Name = Joe Bob Student ID = 1234
Name = Betty Sue Student ID = 5678
Joe Bob ID = 1234 Password = B1234b
Betty Sue ID = 5678 Password = S5678e



*/