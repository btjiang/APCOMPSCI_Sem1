import java.util.Scanner;

public class GPACalc 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your math grade:");
		String name1 = kb.next();
		System.out.println("Please enter your science grade:");
		String name2 = kb.next();
		System.out.println("Please enter your english grade:");
		String name3 = kb.next();
		System.out.println("Please enter your history grade:");
		String name4 = kb.next();
		System.out.println("Please enter your PE grade:");
		String name5 = kb.next();
		System.out.println("Please enter your art grade:");
		String name6 = kb.next();
		System.out.println("Please enter your french grade:");
		String name7 = kb.next();
		
		double GPA = ( points(name1) + points(name2) + points(name3) + points(name4) + points(name5) + points(name6) + points(name7) ) / 7;
		
		System.out.printf("Your GPA is %1.2f", GPA);
	}
	
	
	public static double points(String name)
	{
		
		if (name.equals("A"))
		{
			return 4.0;
		}
		
		if (name.equals("B"))
		{
			return 3.0;
		}
		
		if (name.equals("C"))
		{
			return 2.0;
		}
		
		if (name.equals("D"))
		{
			return 1.0;
		}
		else
		{
			return 0;
		}
	}
}