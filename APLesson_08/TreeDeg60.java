import java.util.Scanner;

public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = kb.next();
		int stop = word.length();
		int start = 0;
		String x = tree(word, start, stop);
		System.out.println(x);
	}
	
	public static String tree(String word, int start, int stop)
	{
		if (start<=stop)
		{
			System.out.println(word.substring(0, start));
			start += 1;
			tree(word, start, stop);
		}
		
		return "";
	}
}