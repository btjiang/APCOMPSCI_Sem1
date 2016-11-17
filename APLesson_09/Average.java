public class Average 
{
	public static void main(String[]args)
	{
		int[]numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = 1 + (int)((Math.random() * 100));
		}
		
		System.out.println("Numbers...");
		for ( int x : numbers)
		{
			System.out.print(x + " ");
		}
		
		System.out.println("");
		System.out.println("The average of the above numbers is..." + average(numbers));
		
	}
	
	public static int average(int[] nums)
	{
		int avg = 0;
		for ( int num : nums)
		{
			avg += num;
		}
		return avg/10;
	}
}