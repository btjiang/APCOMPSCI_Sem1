import java.util.Scanner;

public class Adventure
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Hello, brave warrior! The princess has been captured by the evil, enemy kingdom, and it is your job to save her with your choices!");
		obstacle();
	}
	
	public static void obstacle()
	{
		System.out.println("First:Choose your method of transport."+
		"\n1.) Jicama the trusted racehorse" +
		"\n2.) Skylar the uber driver");
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
					System.out.println("You encounter the foul beasts that took your princess! They don't have the princess... But wait! The princess bursts into the scene and saves you from the ruffians! Turns out she escaped right after they got outside the city and was tired of living in a misogynistic society where she was considered weak and in need of saving and is now pursuing a Computer Science degree from UC Berekley. But she always has time to rescue her favorite warrior in between classes!");
				}
				
				else
				{
					System.out.println("You wait for days but they never return, and you return to the kingdom empty handed. Unfortunately, in your kingdom with cruel and unusual punishment and destructive tropes of masculinity you are beheaded. How medieval. ");
				}
			}	
			else
			{
				System.out.println("You encounter the enemy kingdom's calvary! You draw your sword to prepare for battle, but a horse steps on you, and you are incapacitated. When you reach the kingdom you are allowed one outside message before your trial you contact:"+
				"\n1.)The king"+
				"\n2.)Beyonce");
				int call = kb.nextInt();
				
				if (call == 1)
				{
					System.out.println("The King does nothing to help you and considers execution punishment for failure.");
				}
				
				else 
				{
					System.out.println("\"The Queen\" plays her new album for the enemy kindom's people, they rejoice and celebrate you for bringing the beyhive to them. You become the new honorary ruler, because Beyonce's still on her Formation world tour.");
				}
			}
		}
		else
		{
			System.out.println("Skylar lives on the wild side and takes the quickest path to the enemy kingdom he can through the dangerous swamp, but you're fine because you ordered an uber black. You arrive with time to spare, and consider your options. You choose to:"+
			"\n1.) Pose as a delegate to open relations"+
			"\n2.) Run straight in and start rampaging");
			int uber = kb.nextInt();
			if (uber == 1)
			{
				System.out.println("You have choice of clothing, so you choose:"+
				"\n1.)The blue cloak, the official colors of the enemy kingdom"+
				"\n2.)The black cloak, clean and sleek so you look good.");
				int cloak = kb.nextInt();
				
				if (cloak == 1)
				{
					System.out.println("They think you are just kissing up to them and see through the ruse, they banish you to a tropical island, which isn't too bad.");
				}
				
				else 
				{
					System.out.println("The kingdom admires how good you look and accept you as their own. You make decent pay as an ambassador and live in the new kingdom.");
				}
			}
			else 
			{
				System.out.println("That was a bad move. The guards immediately descend upon you, and in your final moments you begin:"+
				"\n1.)Using your sword to fight them off"+
				"\n2.)Running away");
				int fight = kb.nextInt();
				
				if (fight == 1)
				{
					System.out.println("You somehow are so good of a swordsmen that you slay all of your enemies and come out the triumphant new tyrannical ruler of the kingdom");
				}
				
				else 
				{
					System.out.println("You run away just as Skylar pulls up and saves you! He drives away and the two you go on a cross country adventure in his uber.");
				}
			}			
		}						
	}
}
