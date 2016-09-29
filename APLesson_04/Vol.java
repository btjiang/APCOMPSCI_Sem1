import java.util.Scanner;

public class Vol
{
	public static void main
	{
		Scanner kb = new Scanner(System.in);
		Vol cube = new Vol();
		System.out.println("Please enter the side length of your cube");
		side1 = kb.nextDouble();
		double total = cube.calcVolume(side1);
		System.out.println("Your volume is " + total);
	
	}
	
	public static void calcVolume(side)
	{
		return (side * side * side);
	}
	
	