import java.util.Scanner;

public class counting
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int x = kb.nextInt();
		System.out.println("Please enter the number you would like to count by:");
		int y = kb.nextInt();
		for(int i = 0; i <= x; i+=y)
		{
			System.out.print(i+"\t");
		}
	}
}