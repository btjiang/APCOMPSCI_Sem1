public class GameRunner
{
	public static void main(String[]args)
	{	
		GameSystem game = new Xbox("XBox");
		GameSystem bop = new PlayStation("PlayStation");
		GameSystem Comp = new PC("PC");
		System.out.println(game);
		System.out.println(bop);
		System.out.println(Comp);
		
	}
}