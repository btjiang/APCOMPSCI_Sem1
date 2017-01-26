import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first x coordinate:");
		int x1 = kb.nextInt();
		System.out.println("Please enter your first y coordinate:");
		int y1 = kb.nextInt();
		System.out.println("Please enter your second x coordinate:");
		int x2 = kb.nextInt();
		System.out.println("Please enter your second y coordinate:");
		int y2 = kb.nextInt();
		
		Distance running = new Distance(x1, y1, x2, y2);
		System.out.print("distance = " + running.getDist());
		running.setValues(6, 8, 0, 8);
		System.out.print("\ndistance = " + running.getDist());
	}
	
	
}