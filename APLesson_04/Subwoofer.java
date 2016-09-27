import java.util.Scanner;

public class Subwoofer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Subwoofer measure = new Subwoofer();
		System.out.println("Please enter height in inches:");
		double height = kb.nextDouble();
		System.out.println("Please enter length in inches:");
		double length = kb.nextDouble();
		System.out.println("Please enter width in inches:");
		double width = kb.nextDouble();
		double volume = measure.ruler(height, length, width);
		System.out.println("Your volume is " + volume + " cubic feet.");
		
	}
	
	public double ruler (double h, double l, double w)
	{
		return ((h * l * w) / 1728);
	}
}