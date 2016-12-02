public class GetOdds
{
	static int[] Array = new int[10] ;
	
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the following numbers... ");
		printArray();
		System.out.print("\n\n");
		getOdds();
		System.out.println("are odd numbers");

		
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < 10; i++)
		{
			Array[i] = 1 + (int)((Math.random() * 100));
		}
	}
	
	public static void printArray()
	{
		for(int x : Array)
		{
			System.out.print(x + " ");
		}
	}
	
	public static void getOdds()
	{
		for (int num : Array)
		{
			if(num%2 == 1)
			{
				System.out.print(num + " ");
			}
			
		}
	}
}