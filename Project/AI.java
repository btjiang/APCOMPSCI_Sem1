import java.util.Scanner;

public class AI 
{
	public Hello()
	{
		return "Hello, welcome to Battleship";
	}
	
	public initiate()
	{
		return "I'll go first."
	}
	
	public String AttackResponse(String input)
	{
		String input = "";
		input = input.trim();
		System.out.println(Guess point);
		if (input = one of the array numbers)
		{
			return "Hit!!"; 
		}
		
		else 
		{
			return "Miss";
		}
		
	}
	
	public String Attack(int ship)
	{
		int ship = 1 + (int)(Math.random()*99);
		System.out.println("Attack" + ship);
		Scanner kb = new Scanner(System.in);
		String response = kb.nextLine();
		response = response.trim.toLowerCase();
		if (response.equals("hit"))
		{
			health -=health;
			return "Oh no!";
		}
		
		else
		{
			return "Yay!";
		}
		
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.trim();
		 if (statement.length() == 0)
		 {
			 return "Say Something, please.";
		 }
		
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
		
		else if (findKeyword(statement, "I want", 0) >= 0)
		{
			response = transformIWantStatement(statement);
		}

		else
		{

			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{psn = findKeyword(statement, "i", 0);

				if (psn >= 0 && findKeyword(statement, "you", psn) >= 0)
				{
					response = transformIYouStatement(statement);
				}
				else
				{
					response = getRandomResponse();
				}
			}
		}
		return response;
	}
	
	private String HitResponse()
	{
		final int phrase = 4;
		double num = Math.random();
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
		double num = Math.random();
		int miss = (int)(num * phrase);
		String response = "";
		
		if (miss == 0)
			response = "HAHAHAAHA!! You missed!";
		else if (miss == 1)
			response = "YAAAYYYY! My ships are still alive";
		else if (miss == 2)
			response = "Cool beans, my ships are still there!";
		else if (miss == 3)
			response = "Missed me!";

		return response;
	}
	
	private String AttackPhrase()
	{
		final int phrase = 4;
		double num = Math.random();
		int attack = (int)(num * phrase);
		String response = "";
		
		if (attack == 0)
			response = "I choose " + random number from array;
		else if (attack == 1)
			response = "Attack " + random number from array;
		else if (attack == 2)
			response = "I'm feeling " + random number from array;
		else if (attack == 3)
			response = random number from array + ", I choose you!!";

		return response;
	}
	
	