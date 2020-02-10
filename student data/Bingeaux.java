import java.util.*;
import java.io.*;

public class Bingeaux {
	public static void main(String[] args) {
		Scanner in;
		try {
			in = new Scanner(new File("bingeaux.dat"));
			int num = in.nextInt();
			for (int i = 0; i <= num; i++) {
				String str = in.nextLine();
				System.out.println(str);
				if (!check_ph(str).equals("na")) {
					System.out.println(check_ph(str));
				}
				if (!check_ai(str).equals("na")) {
					System.out.println(check_ai(str));
				}
				if (!check_o(str).equals("na")) {
					System.out.println(check_o(str));
				}
				if (!check_multiples(str).equals("na")) {
					System.out.println(check_multiples(str));
				}
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File not found");
		}
	}

	public static String check_ph(String str) {
		int first = str.indexOf("p");
		int second = str.indexOf("h");

		if (first >= 0 && second >= 0 && first + 1 == second) {
			String front = str.substring(0, first);
			String back = str.substring(second + 1, str.length());
			String new_str = front + "f" + back;
			return new_str;
		}
		return "na";
	}

	public static String check_ai(String str) {
		int first = str.indexOf("a");
		int second = str.indexOf("i");
		int count_first = countOccurences(str, 'p', 0);
		int count_second = countOccurences(str, 'h', 0);
		if(count_first > 0 && count_second > 0 && count_first == count_second){
			String s = "";
			int index_of_front = 0;
			while(index_of_front < str.length()){
				first = str.indexOf("a", index_of_front);
				second = str.indexOf("i", index_of_front);
				String front = str.substring(index_of_front, first);
				String back = str.substring(second + 1, str.length());
				String new_str = front + "ay" + back;
				index_of_front = second;
				s += new_str + ",";
		}
		System.out.println(s);
		return s;
	}
		if ((first >= 0 && second >= 0) && second + 1 != str.length() && first + 1 == second) {
			String front = str.substring(0, first);
			String back = str.substring(second + 1, str.length());
			String new_str = front + "ay" + back;
			return new_str;
		}
		return "na";
	
	}
	public static String check_o(String str) {
		int loc = str.lastIndexOf("o");
		if (loc == str.length() - 1 && loc >= 0) {
			String new_str = str.substring(0, loc) + "eaux";
			return new_str;
		}
		return "na";
	}

	public static String check_multiples(String str) {
		for (int i = 0; i < str.length(); i++) {

			if (i == str.length() - 2) {
				return "na";
			}
			String currentLetter = "" + str.charAt(i);
			String nextLetter = "" + str.charAt(i + 1);
			String followingLetter = "" + str.charAt(i + 2);
			if (currentLetter.equals(nextLetter) && !nextLetter.equals(followingLetter)) {
				String front = str.substring(0, i);
				String back = str.substring(i + 1, str.length());
				String new_str = front + back;
				return new_str;
			}
		}
		return "na";
	}
	
	public static int countOccurences(String str, char c, int i) {
		int count = 0;
		if (i >= str.length()) {
			return 0;
		}

		if(str.charAt(i) == c){
			 count = 1;
			}
			else{
				count = 0;
			}
		return count + countOccurences(str, c, i + 1);
	}
}