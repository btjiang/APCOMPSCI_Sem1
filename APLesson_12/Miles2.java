import java.util.Scanner;
public class Miles2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance:");
		int d = kb.nextInt();
		System.out.println("Please enter the number of hours:");
		int h = kb.nextInt();
		System.out.println("Please enter the number of minutes:");
		int m = kb.nextInt();
	
	
	MilesPerHour miles = new MilesPerHour(d, h, m);
	System.out.print(miles.getDistance() + " miles in " + miles.getHours() + " hours and " + miles.getMinutes() + " minutes = " + miles.getMPH() + " mph.");
	miles.setValues(d,h,m);
	System.out.print("\n" + miles.getDistance() + " miles in " + miles.getHours() + " hours and " + miles.getMinutes() + " minutes = " + miles.getMPH() + " mph.");
	}
}