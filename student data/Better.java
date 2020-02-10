import java.util.*;
import java.io.*;

public class Better {
    public static void main(String[] args) {
        Scanner in;
        try {
            in = new Scanner(new File("better.dat"));
			int count = in.nextInt();
			in.nextLine();
			for(int i = 0; i < count; i++){
				String s = in.nextLine();
				String[] str = s.split(" ");
				if(sum(str[0]) > sum(str[1])){
					System.out.println(str[0] + " is better than " + str[1]);
				}
				else if(sum(str[0]) < sum(str[1])){
					System.out.println(str[1] + " is better than " + str[0]);
				}
				else{
					if(Integer.parseInt(str[0]) > Integer.parseInt(str[1])){
						System.out.println(str[1] + " is better than " + str[0]);
					}
					else if (Integer.parseInt(str[0]) < Integer.parseInt(str[1])){
						System.out.println(str[0] + " is better than " + str[1]);
					}
					else{
						System.out.println(str[0] + " is the same as " + str[1]);
					}
				}
			}
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
	}
	public static int sum(String str){
		String[] temp = str.split("");
		int sk = 0;
		for(String s: temp){
			sk +=Integer.parseInt(s);
		}
		return sk;
	}
}