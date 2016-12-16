public class XsandOs
{
	public static void main(String[]args)
	{
		String[][]XO = new String [4][4];
		
		for ( int i = 0; i < XO.length; i++)
		{
		for ( int j = 0; j < XO[i].length; j++)
		{
			int pick = 1 + (int)((Math.random() * 2));
			if (pick == 1)
			{
				XO[i][j] = "x";
			}
			if (pick == 2)
			{
				XO[i][j] = "o";
			}
			System.out.println(XO[i][j] + "\t");
		}
		System.out.println("");
		}
		
		for ( int i = 0; i < XO.length; i++)
		{
		for ( int j = 0; j < XO[i].length; j++)
		{
			System.out.print(XO[i][j]+"\t");
		}
		System.out.println("");
		}
	}
}