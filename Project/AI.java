import java.util.Scanner;

public class AI 
{
	int [] OurShips = new int[15];
	int [] OppShips = new int[15];
	static int healthload = 6;
	static int healthCount;
	
	
	public String Hello()
	{
		return "Hello, welcome to Battleship";
	}
	
	public String initiate()
	{
		return "I'll go first.";
	}
	
	public int[] LoadOppShips()
	{
		int [] OppShips = new int[100];
		for(int i = 0; i < OppShips.length; i++)
		{
			OppShips[i] = 1 + (int)(Math.random()*99);
		}
	}
	
	public static String takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount -= amount;
			//return "Taking " + amount + " damage!";
		}
		else
		{
			if(healthCount + amount < healthload)
			{
				healthCount += amount;
			}
			else
			{
				healthCount = healthload;
			}
			
		}
		//return "Power up " + amount;
	}
	
	public static void printClip()
	{
		String output = "Health:\t";
		
		for(int i = 0; i <healthload; i++) 
		{
			if(i < healthCount)
			{
				
				health[i] = " @ "; 
			}			
			else
			{
				health[i] = " [] "; 
				
			}	
			output += health[i];
		}
		System.out.println(output);
	}
	
	public String getResponse(String statement)
	{
		Scanner kb = new Scanner(System.in);
		
		String response = "";
		response = response.trim();
		AttackPhrase();
		if(statement.equals("hit"))
		
		{
			HitResponse();
		}
	
		else 
		{
			MissResponse();
		}
		
		return response;
	}
	
	private String HitResponse()
	{
		final int phrase = 4;
		double num = 1 + (int)(Math.random()*99);
		int hit = (int)(num * phrase);
		String response = "";
		
		if (hit == 0)
			response = "Ahhhh Rats!!";
		else if (hit == 1)
			response = "Gosh Darn It!!!";
		else if (hit == 2)
			response = "Shucks!!!!";
		else if (hit == 3)
			response = "Ah! My ship has sunk!";

		return response;
	}
	
	private String MissResponse()
	{
		final int phrase = 4;
		double num = 1 + (int)(Math.random()*99);
		int miss = (int)(num * phrase);
		String response = "";
		
		if (miss == 0)
			response = "HAHAHAAHA!! You missed!";
		else if (miss == 1)
			response = "Yay! My ships are still alive";
		else if (miss == 2)
			response = "Cool beans, my ships are still there!";
		else if (miss == 3)
			response = "Missed me!";

		return response;
	}
	
	private String AttackPhrase()
	{
		final int phrase = 4;
		double num = 1 + (int)(Math.random()*99);
		int attack = (int)(num * phrase);
		String response = "";
		
		if (attack == 0)
			response = "I choose " + num;
		else if (attack == 1)
			response = "Attack " + num;
		else if (attack == 2)
			response = "I'm feeling " + num;
		else if(attack == 3)
			response = num + ", I choose you!!";

		return response;
	}
	
}
	
	