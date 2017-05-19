import java.util.Scanner;

public class AIRunner
{

	public static void main(String[] args)
	{
		AI battle = new AI();
		
		System.out.println (battle.Hello());
		System.out.println(battle.inititate());
		Scanner ship = new Scanner (System.in);
		String guess = ship.nextLine();
		
		
		while (!statement.equals("Bye"))
		{
			System.out.println (battle.getResponse(statement));
			statement = ship.nextLine();
		}
	}

}
