public class BiggestNumber
{
	static int[] Array = new int[10] ;
	
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("\nThe biggest number is " + getBiggest());
		
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < Array.length; i++)
		{
			Array[i] = 1 + (int)((Math.random() * 100));
		}
	}
	
	public static void printArray()
	{
		for(int x:Array)
		{
			System.out.print(x + " ");
		}
	}
	
	public static int getBiggest()
	{
		int max=0;
		for(int num:Array)
		{
			if (num>max)
			{
				max = num;
			}
			
		}
		return max;
	}
}