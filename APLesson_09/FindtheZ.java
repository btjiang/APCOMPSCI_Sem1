import java.util.Scanner;

public class FindtheZ
{
	static String[] words = new String[5] ;
	
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the words: ");
		printArray();
		System.out.println("Only " + hasZs() + " contain(s) the letter z");
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter five words.");
		for (int i = 0; i < words.length ; i++ )
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for(String x:words)
		{
			System.out.println(x + " ");
		}
	}
	
	public static String hasZs()
	{
		 String zs = "";
		for(String word:words)
		{
			if(word.indexOf("z") >= 0 || word.indexOf("Z")>= 0)
			{
				zs = zs + word + " ";
			}
		}
		
		return zs;
	}
}