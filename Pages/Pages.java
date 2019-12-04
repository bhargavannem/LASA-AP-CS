// REPL.IT requires the root class be named "Main".  Normally 
// .   this would be the name of the App  

  // You still need a main() method.  Put the following in the main() method


      // set up input scanner
      
      // get the age
      
      // compute the pages to be read
      
      // display result (pages to be read)
      
import java.util.Scanner;
  public class books{
    public static void main(String args[]){
      int age;
      int PagesRead;
      Scanner scan = new Scanner(System.in);
      System.out.println("How old are you? ");
      age = scan.nextInt();
      scan.nextLine();
      PagesRead = 100 - age;
      System.out.println("You should read " + PagesRead + " pages before giving up on a book.");
      
    
    }
  }