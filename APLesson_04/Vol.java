import java.util.Scanner;

public class Vol
{
	
	static int side;
	static int volume;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the side length of your cube");
		side = kb.nextInt();
		calcVolume();
		print();
	
	}
	
	public static void calcVolume()
	{
		volume = (side * side * side);
	}
	
	public static void print()
	{
		System.out.println("Your volume is " + volume);
	}
	
}