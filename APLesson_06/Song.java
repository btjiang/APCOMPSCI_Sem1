
public class Song 
{
	public static void main(String[]args)
	{
		String word1 = "Na";
		String word2 = "Na";
		String word3 = "Hey";
		String word4 = "Goodbye!";
		int number1 = 4;
		int number2 = 4;
		int number3 = 3;
		int number4 = 1;
		sing(word1, number1);
		sing(word2, number2);
		sing(word3, number3);
		sing(word4, number4);
	}
	
	public static void sing(String word, int number)
	{
		for(int i = 0; i < number; i++)
		{
			System.out.print(word + "\t");
		}
	}
}