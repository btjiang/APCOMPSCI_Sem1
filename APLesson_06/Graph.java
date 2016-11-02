import java.util.Scanner;

public class Graph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		double x = kb.nextDouble();
		System.out.println("Please enter the table size:");
		double y = kb.nextDouble();
		for(int i = 1; i <= y; i++ )
		{
			double z = i*x;
			System.out.printf("%10d | %10.3f\n", i,z);
		}
		
	}
}