import java.util.*;

public class GameHealth
{
	
	static String[] health;
	static Integer hl = 6; 
	static Integer hc;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0; 
		int amount = 0;
		hc = 6;
		health = new String[hl];
		while ( !(turn.equals("Q")) && hc > 0)
		{
			System.out.println("Your turn! Hit Enter when ready:");
			turn = kb.nextLine();
			damage = (int)((Math.random() * 2))+1;
			amount = (int)((Math.random() * 6))+1;
			System.out.println(takeDamage(damage,amount));
			printClip();
		}
		System.out.println("You died!");
	}
	
	public static String takeDamage(int d, int a)
	{
		if (d == 1)
		{
			hc -= a;
			return "Taking " + a + " damage!";
		}
		
		else 
		{
			if(hc + a < hl)
			{
				a += hc;
			}
			
			else 
			{
				hc = hl;
			}
			
			return "Power up "+ a + "!";
		}
		
	}
	
	public static void printClip()
	{
		String output = "Health:\t";
		for (int i = 0; i < hl; i++)
		{
			if (i < hc)
			{
				health[i] = "@";
			}
			else 
			{
				health[i] = "[]";
			}
			
			output += health[i];
		}
		System.out.println(output);
	}
}