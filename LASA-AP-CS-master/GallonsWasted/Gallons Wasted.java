import java.util.Scanner;

public class GallonsWasted
{
  public static int dpd = 15140;
  public static void main(String args[])
  {
    float PerDay;
    float WaterLoss;
    int Days;
    float TotalLoss;
    float TL;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter faucet drips per minute: ");
    WaterLoss = scan.nextFloat();
    scan.nextLine();
    WaterLoss = (WaterLoss/dpd)*1440;
    System.out.println("Enter the number of days: ");
    Days = scan.nextInt();
    scan.nextLine();    
    TotalLoss = WaterLoss*Days;
    System.out.println("In " + Days + ", you wasted a total of " + TotalLoss + " Gallons");
  }
}