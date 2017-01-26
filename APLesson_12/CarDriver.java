import java.util.*;

public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter paint type:");
		String paint = kb.nextLine();
		System.out.println("Please enter interior type:");
		String interior = kb.nextLine();
		System.out.println("Please enter engine type:");
		String engine = kb.nextLine();
		System.out.println("Please enter tire type:");
		String tires = kb.nextLine();
		
		Car drive = new Car(paint, interior, engine, tires);
		System.out.println("Your vehicle is ready...\nPaint:\t" + drive.getPaint() + "\nInterior:\t" + drive.getInterior() + "\nEngine:\t" + drive.getEngine() + "\nTires:\t" +drive.getTires());
	}
}