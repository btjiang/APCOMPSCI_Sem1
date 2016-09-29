import java.util.Scanner;


public class Rectangle
{
	static double l;
	static double w;
	static double perim;
 
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter length:");
		l = kb.nextDouble();
		System.out.println("Please enter width:");
		w = kb.nextDouble();
		Perimeter();
		print();
	}
	
	public static void Perimeter()
	{
		perim = (2 * l) + (2 * w);
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is " + perim + " feet around.");
	}
}
