
public class Dice
{
	public static void main(String[]args)
	{

		int player = 1 + (int)((Math.random())* 6);
		int computer = 1 + (int)((Math.random())* 6);
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		String win = winner(player,computer);
		System.out.println("The winner is " + win);
		
		
	}
	
	public static String winner(int player, int computer)
	{
		String winner = "";
		if(player > computer){
			winner = "you";
		}
		if(player < computer){
			winner = "computer";
		}
		return winner;
		
	}
}