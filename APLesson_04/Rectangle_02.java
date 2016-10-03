import java.util.Scanner;

public class Rectangle_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of your rectangle?");
		double length = kb.nextDouble();
		System.out.println("What is the width of your rectangle?");
		double width = kb.nextDouble();
		print(perimeter(length, width));
	}
	
	public static double perimeter(double length, double width)
	{
		return ((2 * length) + (2 * width));
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %10.5f ft. around", perimeter);
	}
}