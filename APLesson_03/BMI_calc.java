import java.util.Scanner; 

public class BMI_calc
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the BMI calculator! What is your height in inches?");
		int height = keyboard.nextInt();
		System.out.println("Great! Now what is your weight in pounds?");
		int weight = keyboard.nextInt();
		
		int a = 703 * weight; 
		int b = height * height;
		int BMI = a / b;
		
		System.out.println("Your BMI is " + BMI + "! Thank you for using the BMI calculator.");
		
	}
}