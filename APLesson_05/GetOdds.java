public class GetOdds
{
	static int Array;
	
	public static void main(String[]args)
	{
		int[] Array = new int[10];
		fillArray();
		int[] d = printArray();
		int p = getOdds;
		System.out.println("For the following numbers... " + d);
		System.out.println("There are " + p + " odd numbers.");
		
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
			System.out.print(x);
		}
	}
	
	public static void getOdds()
	{
		int odds = 0;
		for (int num : Array)
		{
			if (!((num%2)==0) )
			{
				odds += num;
			}
			
			else 
			{
				return 0;
			}
		
		}
		return odds;
	}
}