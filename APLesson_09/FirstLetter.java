import java.util.Scanner;

public class FirstLetter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter five words.");
		String [] words = new String[5];
		for (int i = 0; i < words.length ; i++ )
		{
			words[i] = kb.next();
		}
		
		first(words);
	}
	
	public static void first(String[] word)
	{
		for (String x : word)
		{
			System.out.println(x.charAt(0));
		}
	}
}
