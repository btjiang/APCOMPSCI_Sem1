import java.util.Scanner;

public class Cube_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your Cube's side length:");
		double side = kb.nextDouble();
		print(side, calcSurf(side));
	}
	
	public static double calcSurf(double side)
	{
		return ((side * side) * 6);
	}
	
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube with " + side + "\" sides is %10.5f", sa);
	}
}