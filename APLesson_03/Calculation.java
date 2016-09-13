import java.util.Scanner;

public class Calculation
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi, this is the simple interest calculator! I can calculate the total amount of money in your account after a certain period of time after interest! First please tell me your initial amount of money.");
		float money = keyboard.nextInt();
		System.out.println("Great! Now what is the percent number of your rate of interest?");
		float percent = keyboard.nextInt();
		System.out.println("Finally, how long, in years, will this money be invested?");
		float years = keyboard.nextInt();
		System.out.println("I will now calculate your total amount of money");
		
		float rate = percent/100;
		float num = rate * years; 
		float mult = 1 + num; 
		float x = money * mult;
		System.out.println("Your total amount of money now is " + x + ". Thank you for using the simple interest calculator.");
		
	}
}

