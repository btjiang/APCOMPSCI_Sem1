import java.util.Scanner;

public class Interest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Interest done = new Interest();
		System.out.println("Please enter your interest rate:");
		double rate = kb.nextDouble();
		System.out.println("Please enter the original amount of your loan:");
		double principal = kb.nextDouble();
		System.out.println("Please enter the number of times your loan is compounded per year:");
		double number = kb.nextDouble();
		System.out.println("Please enter the total life of your loan in years:");
		double time = kb.nextDouble();
		double tot = done.money(rate, principal, number, time);
		System.out.println("Your monthly payment will be "+ tot);
		
	}
	
	public double money(double r, double p, double t, double n)
	{
		return (p*(Math.pow(1+r/n,n*t)))/(t*12);
	}
	
}