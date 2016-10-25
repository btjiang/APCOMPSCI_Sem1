import java.util.Scanner;

public class Password
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		String password = "Candle";
		String username = "BillNye";
		passcheck();
	}
		
	public static void passcheck()
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter your username:");
		String un = kb.next();
		System.out.println("Please enter your password:");
		String pw = kb.next();
		if (un.equals("BillNye")&&pw.equals("Candle"))
		{
			System.out.println("You are granted access!");
		}
		
		else if (!(un.equals("BillNye"))&&(pw.equals("Candle")))
		{
			System.out.println("Your username is incorrect!");
			passcheck();
		}
		else if ((un.equals("BillNye"))&&!(pw.equals("Candle")))
		{
			System.out.println("Your password is incorrect!");
			passcheck();
		}
		
		else 
		{
			System.out.println("Your username and password are incorrect!");
			passcheck();
		}
	}
	
}