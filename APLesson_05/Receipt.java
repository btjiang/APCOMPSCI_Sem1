import java.util.Scanner

public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1:");
		String item1 = kb.next();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item 2:");
		String item2 = kb.next();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item 3:");
		String item3 = kb.next();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		System.out.println("Please enter item 4:");
		double price4 = kb.nextDouble();
		double total = price1 + price2 + price3 + price4;
		double subtotal = total + (total *discount);
		
		
	}
	
	public static double discount()
	{
		String discount = "";
		if (total >= 2000)
		{
			discount = .15;
		}
		
		if (total <= 2000)
		{
			discount = 0;
		}
		
	}
	
	public static void format()
	{
		System.
	}
}
