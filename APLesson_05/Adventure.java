import java.util.Scanner

public class Adventure
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Hello, brave warrior! The princess has been captured by the evil, enemy kingdom, and it is your job to save her with your choices!");
		
	}
	
	public static void obstacle()
	{
		System.out.println("First:Choose your method of transport."+
		"\n1.) Jicama the trusted racehorse" +
		"\n2.) Taylor the dusty pickup truck" +
		"\n3.) Skylar the uber driver");
		int move = kb.nextInt();
		
		if (move == 1)
		{
			System.out.println("Jicama needs a soft path for his delicate hooves, so you must take the forest path to the enemy kingdom. At the fork in the road you:" +
			"\n1.) Follow the footprints." +
			" \n2.) Follow the hoove prints.");  
			int prints = kb.nextInt();
			
			if (prints == 1)
			{
				System.out.println("You find the camp of the enemies, but they are not there! You promptly"+
				"\n1.)Go deeper into the surrounding woods, the damsel must be saved!" +
				"\n2.)Hide in the camp and wait for their return, they have to return eventually.");
				int action = kb.nextInt();
				
				if (action == 1)
				{
					System.out.println("You encounter the foul beasts that took your princess! Alas, they have you surrounded and move in for the kill and worst of all you discover they do not even have the princess. But wait! The princess bursts into the scene and saves you from the ruffians! Turns out she escaped right after they got outside the city and was tired of living in a misogynistic society where she was considered weak and in need of saving and is now pursuing a Computer Science degree from UC Berekley. But she always has time to rescue her favorite warrior in between classes!");
				}
		
			}
		}
	}
}