import java.util.Scanner;

public class Divisor
{
	public static void main(String[]args)
	{
		int[][]nums = new int [4][4];
		Scanner kb = new Scanner(System.in);
		for ( int i = 0; i < nums.length; i++)
		{
		for ( int j = 0; j < nums[i].length; j++)
		{
			nums[i][j] = 1 + (int)((Math.random() * 100));
			System.out.println(nums[i][j]);
		}
		System.out.println("");
		}
		System.out.println("Please enter a number:");
		int div = kb.nextInt();
		int count = 0;
		for ( int i = 0; i < nums.length; i++)
		{
		for ( int j = 0; j < nums[i].length; j++)
		{
			if (nums[i][j] % div == 0)
			{
				count += 1;
			}
		}
		}
		System.out.println("There are " + count + " numbers divisible by " + div + " in the Array.");
	}
}