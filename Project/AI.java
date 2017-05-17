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

		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		
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

			if (psn >= 0
					&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{psn = findKeyword(statement, "i", 0);

				if (psn >= 0
						&& findKeyword(statement, "you", psn) >= 0)
				{
					response = transformIYouStatement(statement);
				}
				else
				{
					response = getRandomResponse();
				}
			}
		}
		

		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
		 *
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */
		
		
		return response;
	}
	
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
	
	private int findKeyword(String statement, String goal, int startPos)
	{
		/* New String variable phrase = a more searchable version of statement.
		 	-Use a combination of trim() and toLowerCase() modify statement.
		
		   New int variable psn = the location of goal in phrase after
		   startPos

			-->Refinement: Make sure we find goal by itself, and not part
			of another word ("no" vs no in "know"). if you find an occurrence
			of goal, make sure before and after aren't letters.

			As long as psn >= 0...
				Check if psn > 0 - there is no need to check for before at the
				beginning of the word
					set before = the slot in phrase before psn */

				//====>code here

				/*check if you can fit goal into the rest of phrase - no need to
				proceed otherwise
					set after = the slot in phrase after psn + length of goal */

				//=====> code here

				/* if before and after are not letters (compare before to "a"
					and after to "z")
						--return psn

				Otherwise, search for goal in phrase from psn + 1 forward */
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();
		int psn = phrase.indexOf(goal, startPos);
		while(psn >= 0)
		{
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn-1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
			}
			
			if (before.compareTo("a")<0||before.compareTo("z")>0&&after.compareTo("a")<0||after.compareTo("z")>0)
			{
				return psn;
			}
			psn = phrase.indexOf(goal, psn + 1); 
		}
			
		return -1;

	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}
}