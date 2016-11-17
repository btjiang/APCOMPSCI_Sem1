import java.util.Scanner;

public class Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the first word");
		String word1 = kb.next();
		System.out.println("Please enter the second word");
		String word2 = kb.next();
		System.out.println("Please enter the third word");
		String word3 = kb.next();
		makeCenter(word1);
		makeCenter(word2);
		makeCenter(word3);
		
	}
	
	public static String makeCenter(String word)
	{
		if (word.length() >= 20)
		{
			System.out.println(word);
		}	
		
		else 
		{
			makeCenter(" " + word + " ");
		}
		return "";
	}
}