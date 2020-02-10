
import java.io.*;
import java.util.*;

public class Time {
	public static void main(String[] args) {
		Scanner in;
		try {
			in = new Scanner(new File("time.dat"));
			while (in.hasNextDouble()) {
				double num = in.nextDouble();
				int hours = (int) (num / 60.0);
				int temp = (int) ((num - (hours * 60)) * 100);
				double minutes = temp / 100;
				int remaining = (int) (num * 100 - minutes * 100 - 100 * (hours * 60));
				double seconds = (double) (remaining) / 100;
				int total_seconds = 0;
				while (seconds >= 0.05) {
					seconds -= 0.05;
					total_seconds += 3;
				}
				System.out.println("" + hours + ":" + (int) (minutes) + ":" + total_seconds);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File not Found");
		}
	}
}