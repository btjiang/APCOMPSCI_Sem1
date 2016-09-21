import java.util.Scanner;

public class ID_Card
{
	public static void main(String[]args)
	{
		
		ID_Card card = new ID_Card();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String name2 = keyboard.next();
		System.out.println("Please enter your last name:");
		String other2 = keyboard.next();
		System.out.println("Enter your title:");
		String name3 = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter the school site:");
		String name1 = keyboard.nextLine();
		System.out.println("Enter the School Year:");
		String other1 = keyboard.next();
		keyboard.nextLine();
		System.out.println("What is your subject?");
		String other3 = keyboard.nextLine();
		
		System.out.println("**********************************************");
		card.ID(name1, other1);
		card.ID(name2, other2);
		card.ID(name3, other3);
		System.out.println("\n\n**********************************************");
	}
	
	public void ID (String name, String other)
		{
			System.out.printf("\n* %15s       %20s *", name, other);
		}
}