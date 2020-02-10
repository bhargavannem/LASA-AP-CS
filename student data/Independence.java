import java.util.*;
import java.io.*;

public class Independence{
	public static void main(String[] args) {
		Scanner in;
		try{
            in = new Scanner(new File("independence.dat"));
			int largest = 0;
			while(in.hasNext()){
				String str = in.next();
				if(str.length() > largest){
					largest = str.length();
				}
			}
			Scanner file = new Scanner(new File("independence.dat"));
			while(file.hasNext()){
				String s = file.next();
				if (s.length() == largest){
					System.out.print(s.charAt(0));
				}
			}
			System.out.println();
		}
		catch(FileNotFoundException ex){
			System.out.println("File not found");
		}
	}
}