import java.util.Scanner;

public class DigitAdder
{
	static int sum = 0;
	static int number = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number");
		number = kb.nextInt();
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	
	public static void sumDigits()
	{
		int num = number;
		while(num > 0)
		{
			sum = sum + (num % 10);
			num  = num / 10;
		}
	}
}