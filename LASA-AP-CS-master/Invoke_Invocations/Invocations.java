/* 
Bhargav Annem
AP Computer Science
Shockey
5 September 2019
*/

public class Invocations
{
	public static int piggyBank(int pennies, int nickels, int dimes, int quarters, int halfDollars)
	{
		int totalValue = (int) ((0.01 * pennies)+(0.05*nickels)+(0.1*dimes)+(0.25*quarters)+(0.5*halfDollars));
		return totalValue;
	}

	public static int mp3Sizer(int songs, int videos, int photos)
	{
		int totalMB = (int) ((3.04 * songs)+(89.3*videos)+(1.72*photos));
		int totalGB = totalMB/1000;
		return totalGB;
	}
}	
