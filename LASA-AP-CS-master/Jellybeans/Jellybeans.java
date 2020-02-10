import java.lang.Math;
import java.util.Scanner;
public class JellyBeans{

	public static void main(String args[]){
		double JbLength;
		double JbHeight;
		int JarSize;
		double counted;
		double JbCount;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of the jelly beans in cm? ");
		JbLength = scan.nextDouble();
		scan.nextLine();
		System.out.println("What is the average height of the jelly beans in cm? ");
		JbHeight = scan.nextDouble();
		scan.nextLine();
		System.out.println("How tall is the jar of jelly beans in mL? ");
		JarSize = scan.nextInt();
		scan.nextLine();
		counted = counter(JbLength,JbHeight);
		JbCount = (0.698 * JarSize)/counted;
		int FinalJB = (int)(Math.round(JbCount));
		System.out.println("I believe that a jelly bean with a length of " + JbLength + "cm and a height of " + JbHeight + "cm inside of a Mason Jar with a size of " + JarSize + "mL is " + FinalJB + ".");
	}
	public static double counter( double x, double y ){
		double z;
		z = Math.PI * 5 * x * (y*y);
		return z/24;
	}


}