import java.util.Scanner;

public class Gun
{
	static int bc;
	static int cs = 16;
	static int sc;
	static String[]clip = new String[cs];
	
	public static void main(String[]args)
	{
		Scanner kb  = new Scanner(System.in);
		bc= 96;
		sc = 0;
		resetClip();
		while (bc > 0 || sc > 0)
		{
			System.out.println("Action");
			String action = kb.next();
			if (action.equalsIgnoreCase("r"))
			{
				reload();
			}
			if (action.equalsIgnoreCase("s"))
			{
				System.out.println(shoot());
			}
			System.out.println(printClip());
			
		}
		System.out.print("Out of Bullets!!!");
		
	}
	
	public static void resetClip()
	{
		for (int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot()
	{
		if(sc>0)
		{
			clip[sc-1] = "[]";
			sc -= 1;
			return "Boom!!";
		}
		else 
		{
			return "Reload!!!";
		}
	}
	
	public static void reload()
	{
		if (bc>=cs)
		{
			bc -= cs;
			sc = cs;
		}
		else 
		{
			sc = bc;
			bc = 0;
		}
		
		//resetClip();
		
		for (int i = 0; i < sc; i++)
		{
			clip[i] = " * ";
		}
	}
	
	public static String printClip()
	{
		String output = "";
		System.out.println("Bullets:\t" + bc);
		System.out.println("Clip:\t ");
		for (int i = 0; i < cs; i++)
		{
			output += clip[i];
		}
		return output;
	}
}